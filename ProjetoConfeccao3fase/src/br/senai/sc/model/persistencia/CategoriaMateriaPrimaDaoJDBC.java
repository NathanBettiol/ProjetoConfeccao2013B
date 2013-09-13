/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.model.persistencia;

import br.senai.sc.model.negocio.CategoriaMateriaPrima;
import br.senai.sc.persistencia.dao.CategoriaMateriaPrimaDAO;
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
public class CategoriaMateriaPrimaDaoJDBC implements CategoriaMateriaPrimaDAO {
    
    private final String INSERT = "insert into categoriamateriaprima(cod,nome,descricao,materiaprima) "
            + "values (?, ?, ?,?)";
    private final String UPDATE = "update categoriamateriaprima set nome = ?, "
            + "descricao = ?, materiaprima = ? where cod = ?";
    private final String DELETE = "delete from categoriamateriaprima where id = ?";
    private final String LIST = "select * from categoriamateriaprima";
    private final String LISTBYID = "select * from categoriamateriaprima";
    /*
     * Método que realiza a inserção de uma pessoa na base de dados
     */

    @Override
    public boolean insert(CategoriaMateriaPrima cmp) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(INSERT);

            pstm.setInt(1, cmp.getCod());
            pstm.setString(2,cmp.getNome());
            pstm.setString(3,cmp.getDescricao());
            pstm.setString(4,cmp.getMateriaPrima());
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Transação efetuada com "
                    + "sucesso");
            ConnectionFactory.closeConnection(conn, pstm);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a "
                    + "transação" + e.getMessage());
            return false;
        }
    }

    /*
     * Método responsável por atualizar uma pessoa na base de dados
     */
        public boolean update(CategoriaMateriaPrima cmp) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(UPDATE);

           pstm.setInt(1,cmp.getCod());
            pstm.setString(2,cmp.getNome());
            pstm.setString(3,cmp.getDescricao());
            pstm.setString(4,cmp.getMateriaPrima());
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

    /*
     * Método responsável por remover uma pessoa da base de dados
     */
    @Override
    public boolean delete(int codCategoriaMateriaPrima) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(DELETE);

            pstm.setInt(1, codCategoriaMateriaPrima);
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

    /*
     * Método responsável por trazer as pessoas da base de dados
     */
    @Override
                    public List<CategoriaMateriaPrima> listAll() {
       Connection conn;
        List<CategoriaMateriaPrima> categoriamateriaprima = new ArrayList<>();
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(LIST);

            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                CategoriaMateriaPrima cmp = new CategoriaMateriaPrima();
                cmp.setCod(rs.getInt("codigo"));
                cmp.setNome(rs.getString("nome"));
                cmp.setDescricao(rs.getString("descrição"));
                cmp.setMateriaPrima(rs.getString("matéria-prima"));
                categoriamateriaprima.add(cmp);

               
             }
            ConnectionFactory.closeConnection(conn, pstm);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a "
                    + "transação: " + e.getMessage());
        }
        return categoriamateriaprima;
    }
    /*
     * Método responsável por listar uma pessoa com o código enviado por 
     * parâmetro
     */
    
 
    @Override
               public CategoriaMateriaPrima listById(int codCategoriaMateriaPrima) {
                   
        Connection conn;
        
        try {
            conn = ConnectionFactory.getConnection();
           
            PreparedStatement pstm = conn.prepareStatement(LISTBYID);

            pstm.setInt(1,codCategoriaMateriaPrima);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                CategoriaMateriaPrima cmp = new CategoriaMateriaPrima();
                cmp.setCod(rs.getInt("codigo Categoria matéria-prima"));
                cmp.setNome(rs.getString("nome"));
                cmp.setDescricao(rs.getString("descrição"));
                cmp.setMateriaPrima(rs.getString("matéria-prima"));
                return cmp;
            }
            ConnectionFactory.closeConnection(conn, pstm);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a "
                    + "transação");
        }
        return null;
    }
}

 

