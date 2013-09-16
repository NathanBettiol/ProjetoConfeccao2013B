/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.model.persistencia;

import br.senai.sc.model.negocio.Endereco;
import br.senai.sc.model.negocio.MateriaPrima;
import br.senai.sc.model.negocio.Pessoa;
import br.senai.sc.persistencia.dao.MateriaPrimaDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author leticia_jesus
 */
public class MateriaPrimaDaoJDBC implements MateriaPrimaDAO {

    private final String INSERT = "insert into materia_prima(nm_materia_prima,preco,tipo_unidade,qt_materiaprima,fornecedor) "
            + "values (?,?,?,?,?)";
    private final String UPDATE = "update materia_prima set nm_materia_prima = ?, "
            + "preco = ?,tipoUnidade = ?,qt_materia_prima,fornecedor=? where cod_materia_prima = ?";
    private final String DELETE = "delete from materia_prima where cod_materia_prima = ?";
    private final String LIST = "select * materia_prima";
    private final String LISTBYID = "select * from materia_prima";

//------------------------------------------------------------------------------
    /*
     * Método que realiza a inserção de uma materia-prima na base de dados
     */
    @Override
    public boolean insert(MateriaPrima mp) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(INSERT);

            pstm.setString(1, mp.getNome());
            pstm.setDouble(2, mp.getPreco());
            pstm.setString(3, mp.getTpUnidade());
            pstm.setInt(4, mp.getQuantidade());
            //pstm.setString(5,mp.getFornecedor());dando erro por causa da falta da classe fornecedor//
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Transação efetuada com "
                    + "sucesso");
            ConnectionFactory.closeConnection(conn, pstm);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a "
                    + "transação: " + e.getMessage());
            return false;
        }
    }

//------------------------------------------------------------------------------
    /*
     * Método responsável por atualizar uma materia-prima na base de dados
     */
    public boolean update(MateriaPrima mp) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(UPDATE);
            pstm.setString(1, mp.getNome());
            pstm.setDouble(2, mp.getPreco());
            pstm.setString(3, mp.getTpUnidade());
            pstm.setInt(4, mp.getQuantidade());
            //* pstm.setString(5,mp.getFornecedor()); está dando erro por causa da classe fornecedor que está imcompleta//


            pstm.execute();


            JOptionPane.showMessageDialog(null, "Transação efetuada com "
                    + "sucesso");
            ConnectionFactory.closeConnection(conn, pstm);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a "
                    + "transação: " + e.getMessage());
            return false;
        }
    }

//------------------------------------------------------------------------------
    /*
     * Método responsável por remover uma materia-prima da base de dados
     */
    @Override
    public boolean delete(int cod) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(DELETE);

            pstm.setInt(1, cod);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Transação efetuada com "
                    + "sucesso");
            ConnectionFactory.closeConnection(conn, pstm);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a "
                    + "transação");
            return false;
        }
    }

//------------------------------------------------------------------------------
    /*
     * Método responsável por trazer as materia-prima da base de dados
     */
    public List<MateriaPrima> listAll() {
        Connection conn;
        List<MateriaPrima> materiaprima = new ArrayList<>();
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(LIST);

            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                MateriaPrima mp = new MateriaPrima();
                mp.setNome(rs.getString("nome"));
                mp.setPreco(rs.getDouble("preço"));

                mp.setTpUnidade(rs.getString("tipo unidade"));

                mp.setQuantidade(rs.getInt("quantidade"));
                // mp.setFornecedor(rs.getString("fornecedor"));está dando erro por causa da classe fornecedor que está imcompleta//

                materiaprima.add(mp);
            }
            ConnectionFactory.closeConnection(conn, pstm);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a "
                    + "transação: " + e.getMessage());
        }
        return materiaprima;
    }

//------------------------------------------------------------------------------
    /*
     * Método responsável por listar uma materia-prima com o código enviado por 
     * parâmetro
     */
    @Override
    public MateriaPrima listById(int cod) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(LISTBYID);

            pstm.setInt(1, cod);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                MateriaPrima mp = new MateriaPrima();
                mp.setNome(rs.getString("nome"));
                mp.setPreco(rs.getDouble("preço"));

                mp.setTpUnidade(rs.getString("tipo unidade"));

                mp.setQuantidade(rs.getInt("quantidade"));
                // mp.setFornecedor(rs.getString("fornecedor"));está dando erro por causa da classe fornecedor que está imcompleta//

                return mp;
            }
            ConnectionFactory.closeConnection(conn, pstm);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a "
                    + "transação");
        }
        return null;
    }
}
