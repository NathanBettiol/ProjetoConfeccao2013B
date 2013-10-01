/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.model.persistencia;

import br.senai.sc.model.negocio.Meta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author douglas_ghisleri
 */
public class MetaDaoJDBC {

    private final String INSERT = "insert into meta"
            + "(dt_inicio, dt_fim, vl_produto, qt_pecas) values "
            + "(?,?,?,?)";
    private final String UPDATE = "update meta set "
            + "dt_inico = ?, dt_fim = ?, vl_produto = ?, qt_pecas = ?"
            + "where cod_meta = ?";
    private final String DELETE = "delete from meta "
            + "where cod_meta = ?";
    private final String LIST = "select * from meta";
    private final String LISTBYID = "select * from meta "
            + "where cod_meta = ?";

    /*
     * Método que realiza a inserção de uma endereco na base 
     * de dados
     * 
     */
    public boolean insert(Meta m) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(INSERT);
            pstm.setString(1, m.getDataInicio());
            pstm.setString(2, m.getDataFim());
            pstm.setInt(3, m.getQuantidade());
            pstm.setDouble(4, m.getValor());
            pstm.execute();
            JOptionPane.showMessageDialog(null,
                    "Transação efetuada com sucesso");
            ConnectionFactory.closeConnection(conn, pstm);
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    "Não foi possível efetuar a transação" + ex.getMessage());
            return false;
        }
    }

    /*
     * Método responsável por atualizar uma endereco 
     * na base de dados
     */
    public boolean update(Meta m) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(UPDATE);
            pstm.setString(1, m.getDataInicio());
            pstm.setString(2, m.getDataFim());
            pstm.setInt(3, m.getQuantidade());
            pstm.setDouble(4, m.getValor());
            pstm.setInt(5, m.getCod_meta());
            pstm.execute();
            JOptionPane.showMessageDialog(null,
                    "Transação efetuada com sucesso");
            ConnectionFactory.closeConnection(conn, pstm);
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    "Não foi possível efetuar a transação" + ex.getMessage());
            return false;
        }
    }

    /*
     * Método responsável por remover uma endereco da base de 
     * dados.
     */
    public boolean delete(int id) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(DELETE);

            pstm.setInt(1, id);
            pstm.execute();
            JOptionPane.showMessageDialog(null,
                    "Transação efetuada com sucesso");
            ConnectionFactory.closeConnection(conn, pstm);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Não foi possível efetuar a transação");
            return false;
        }
    }

    /*
     * Método responsável por trazer as enderecos da base
     * de dados
     */
    public List<Meta> listAll() {
        Connection conn;
        List<Meta> metas = new ArrayList<>();
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(LIST);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Meta m = new Meta();
                m.setDataInicio(rs.getString("data inicio"));
                m.setDataFim(rs.getString("data fim"));
                m.setCod_meta(rs.getInt("Codigo meta"));
                m.setValor(rs.getDouble("Valor"));
                m.setQuantidade(rs.getInt("Quantidade"));

                metas.add(m);
            }
            ConnectionFactory.closeConnection(conn, pstm);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    "Não foi possível efetuar a transação"
                    + ex.getMessage());

        }
        return metas;
    }

    /*
     * Método responsável por listar uma endereco com o código 
     * enviado por parâmetro
     * 
     */
    public Meta listById(int cod_meta) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(LISTBYID);
            pstm.setInt(1, cod_meta);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Meta m = new Meta();
                m.setDataInicio(rs.getString("Data inicio"));
                m.setDataFim(rs.getString("Data fim"));
                m.setCod_meta(rs.getInt("cod_meta"));
                m.setValor(rs.getDouble("Valor"));
                m.setQuantidade(rs.getInt("Quantidade"));
                return m;
            }
            ConnectionFactory.closeConnection(conn, pstm);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    "Não foi possível efetuar a transação"
                    + ex.getMessage());

        }
        return null;
    }
}
