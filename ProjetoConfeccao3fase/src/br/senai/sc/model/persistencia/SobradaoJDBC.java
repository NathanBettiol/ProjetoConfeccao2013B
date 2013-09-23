package br.senai.sc.model.persistencia;

import br.senai.sc.model.negocio.Sobra;
import br.senai.sc.persistencia.dao.SobraDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Patricia Gageiro
 * @version 1.0 23/09/2013
 */
public class SobradaoJDBC implements SobraDAO {

    private static final String INSERT = "insert into sobra(cod_sobra, peso, categoria, materiaPrima, dtCadastro, funcionarioResposavel, values (?,?,?,?,?,?)";
    private static final String UPDATE = "update sobra set cod= ? , peso = ?, categoria = ?, materiaPrima = ?, dtCadasto = ?, funcionarioResponsavel = ?";
    private static final String DELETE = "delete from sobra where cod_sobra = ?";
    private static final String LIST = "select * from sobra";
    private static final String LISTBYID = "select * from sobra where cod_sobra = ?";

    public boolean insert(Sobra sob) {
        Connection con;

        try {
            con = ConnectionFactory.getConnection();
            PreparedStatement pstm = con.prepareStatement(INSERT);
            pstm.setString(1, sob.getCodSobra());
            pstm.setString(2, sob.getPeso());
            pstm.setString(3, sob.getCategoria());
            pstm.setString(4, sob.getMateriaPrima());
            pstm.setDate(5, new java.sql.Date(sob.getDtCadastro().getTime()));
            pstm.setString(6, sob.getFuncionarioResponsavel());
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Transação efetuada com sucesso");
            ConnectionFactory.closeConnection(con, pstm);
            return true;

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a transação" + ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean update(Sobra sob) {
        Connection con;

        try {
            con = ConnectionFactory.getConnection();
            PreparedStatement pstm = con.prepareStatement(UPDATE);
            pstm.setString(1, sob.getCodSobra());
            pstm.setString(2, sob.getPeso());
            pstm.setString(3, sob.getCategoria());
            pstm.setString(4, sob.getMateriaPrima());
            pstm.setDate(5, new java.sql.Date(sob.getDtCadastro().getTime()));
            pstm.setString(6, sob.getFuncionarioResponsavel());
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Transação efetuada com sucesso");
            ConnectionFactory.closeConnection(con, pstm);
            return true;

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a transação" + ex.getMessage());
            return false;
        }
    }

    public boolean delete(Sobra sob) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(DELETE);
            pstm.setString(1, sob.getCodSobra());
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Transação efetuada com sucesso");
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a transação" + ex.getMessage());
            return false;
        }
    }

    public List<Sobra> ListAll() {
        Connection conn;
        List<Sobra> sobras = new ArrayList<>();

        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(LIST);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Sobra sob = new Sobra();
                sob.setCodSobra(rs.getString("codSobra"));
                sob.setPeso(rs.getString("peso"));
                sob.setCategoria(rs.getString("categoria"));
                sob.setMateriaPrima(rs.getString("materiaPrima"));

                try {
                    String data = JOptionPane.showInputDialog("Data Cadastro");

                    sob.setDtCadastro(new SimpleDateFormat("dd/mm/yyyy").parse(data));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Data incorreta" + ex);
                }
                sob.setFuncionarioResponsavel(rs.getString("funcionarioResponsavel"));
                sobras.add(sob);
                
                ConnectionFactory.closeConnection(conn, pstm);
            }

            }catch(Exception exp) {
            
                 
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a transação" + exp.getMessage());

            }
            return sobras;
        }

    @Override
    public Sobra listById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    }
