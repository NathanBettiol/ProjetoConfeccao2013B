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
 * @version 1.0 20/09/2013
 *
 */
public class CategoriaMateriaPrimaDaoJDBC implements CategoriaMateriaPrimaDAO {

    private final String INSERT = "insert into categoria_materia_prima(nm_categoria_materia_prima,descricao) "
            + "values (?, ?)";
    private final String UPDATE = "update categoria_materia_prima set nm_categoria_materia_prima = ?, "
            + "descricao = ? where cod_categoria_materia_prima = ?";
    private final String DELETE = "delete from categoria_materia_prima where cod_categoria_materia_prima= ?";
    private static final String Pesquisa = "select * from categoria_materia_prima where cod_categoria_materia_prima like ? or nome like?";
    private final String LIST = "select * from categoria_materia_prima";
    /*
     * Método que realiza a inserção de uma categoria de matéria-prima na base de dados
     */

    @Override
    public boolean insert(CategoriaMateriaPrima cmp) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(INSERT);

      
            pstm.setString(1, cmp.getNome());
            pstm.setString(2, cmp.getDescricao());
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

            pstm.setInt(1, cmp.getCod());
            pstm.setString(2, cmp.getNome());
            pstm.setString(3,cmp.getDescricao());
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
     * Método responsável por remover uma categoria de matéria-prima da base de dados
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
                    + "transação: " + e.getMessage());
            return false;
        }
    }

    /*
     * Método responsável por listar as categorias de matéria-prima  da base de dados
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
                cmp.setCod(rs.getInt("Codigo"));
                cmp.setNome("Nome da categoria da matéria-prima:");
                cmp.setDescricao(rs.getString("Descrição:"));
              
                categoriamateriaprima.add(cmp);


            }
            ConnectionFactory.closeConnection(conn, pstm);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a "
                    + "transação: " + e.getMessage());
        }
        return categoriamateriaprima;
    }
   

    @Override
    public List<CategoriaMateriaPrima> listAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CategoriaMateriaPrima listById(int codCategoriaMateriaPrima) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       public List<CategoriaMateriaPrima> listPesquisa(String texto) {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<CategoriaMateriaPrima> categoriasmateriaprima = new ArrayList<>();
        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(Pesquisa);
            pstm.setString(1, "%" + texto + "%");
             pstm.setString(2, "%" + texto + "%");
             pstm.setString(3,"%"+ texto+"%");
            rs = pstm.executeQuery();
            while (rs.next()) {
                CategoriaMateriaPrima cmp = new CategoriaMateriaPrima();
                cmp.setCod(rs.getInt("cod_categoria_materia_prima"));
                cmp.setNome(rs.getString("nome"));
                cmp.setDescricao(rs.getString("descricao"));
                categoriasmateriaprima.add(cmp);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar: " + e.getMessage());
        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm, rs);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão:"
                        + e.getMessage());
            }
        }
        return categoriasmateriaprima;
    }
}


