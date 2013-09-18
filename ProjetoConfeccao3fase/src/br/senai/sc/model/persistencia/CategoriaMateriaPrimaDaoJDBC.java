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
    
    private final String INSERT = "insert into categoria_materia_prima(cod_categoria_materia_prima,nm_categoria_materia_prima,descricao) "
            + "values (?, ?, ?)";
    private final String UPDATE = "update categoria_materia_prima set nome = ?, "
            + "descricao = ? where cod = ?";
    private final String DELETE = "delete from categoria_materia_prima where id = ?";
    private final String LIST = "select * from categoriamateriaprima";
    private final String LISTBYID = "select * from categoria_materia_prima";
    /*
     * Método que realiza a inserção de uma categoria de matéria-prima na base de dados
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
     * Método responsável por atualizar uma categoria de matéria-prima na base de dados
     */
        public boolean update(CategoriaMateriaPrima cmp) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(UPDATE);

           pstm.setInt(1,cmp.getCod());
            pstm.setString(2,cmp.getDescricao());
            pstm.setString(3,cmp.getMateriaPrima());
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
                        public List<CategoriaMateriaPrima> listall() {
       Connection conn;
        List<CategoriaMateriaPrima> categoriamateriaprima = new ArrayList<>();
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(LIST);

            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                CategoriaMateriaPrima cmp = new CategoriaMateriaPrima();
                cmp.setCod(rs.getInt("codigo"));
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

    @Override
    public List<CategoriaMateriaPrima> listAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
 

