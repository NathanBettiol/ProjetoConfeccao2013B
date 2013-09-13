package br.senai.sc.model.persistencia;

import br.senai.sc.model.negocio.Transportadora;
import br.senai.sc.persistencia.dao.TransportadoraDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Classe responsável pela persistência da entidade transportadora na base de
 * dados
 *
 * @author wesley_s
 */
public class TransportadoraDaoJDBC implements TransportadoraDAO {

    private final String INSERT = "insert into transportadora(nmFantasia, "
            + "razaoSocial, cnpj, endereco, telefone, contato, email, paginaWeb,"
            + " dtCadastro) values (?, ?, ?)";
    private final String UPDATE = "update transportadora set nmFantasia = ?, "
            + "razaoSocial = ?, cnpj = ?, endereco = ?, telefone = ?, "
            + "contato = ?, email = ?, paginaWeb = ? where cod = ?";
    private final String DELETE = "delete from transportadora where cod = ?";
    private final String LIST = "select * from transportadora";
    private final String LISTBYID = "select * from transportadora "
            + "where cod = ?";

//------------------------------------------------------------------------------
    /*
     * Método que realiza a inserção de uma transportadora na base de dados
     */
    @Override
    public boolean insert(Transportadora t) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(INSERT);

            pstm.setString(1, t.getNmFantasia());
            pstm.setString(1, t.getRazaoSocial());
            pstm.setString(1, t.getCnpj());
            pstm.setString(1, t.getEndereco());
            pstm.setString(1, t.getTelefone());
            pstm.setString(1, t.getContato());
            pstm.setString(1, t.getEmail());
            pstm.setString(1, t.getPaginaWeb());
            pstm.setDate(8, new java.sql.Date(t.getDtCadastro().getTime()));
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
     * Método responsável por atualizar uma transportadora na base de dados
     */
    @Override
    public boolean update(Transportadora t) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(UPDATE);

            pstm.setString(1, t.getNmFantasia());
            pstm.setString(2, t.getRazaoSocial());
            pstm.setString(3, t.getCnpj());
            pstm.setString(4, t.getEndereco());
            pstm.setString(5, t.getTelefone());
            pstm.setString(6, t.getContato());
            pstm.setString(7, t.getEmail());
            pstm.setString(8, t.getPaginaWeb());
            pstm.setDate(9, new java.sql.Date(t.getDtCadastro().getTime()));
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
     * Método responsável por remover uma transportadora da base de dados
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
     * Método responsável por trazer as transportadoras da base de dados
     */
    @Override
    public List<Transportadora> listAll() {
        Connection conn;
        List<Transportadora> transportadoras = new ArrayList<>();
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(LIST);

            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Transportadora t = new Transportadora();
                t.setCod(rs.getInt("cod"));
                t.setNmFantasia(rs.getString("nome"));
                t.setRazaoSocial(rs.getString("nome"));
                t.setCnpj(rs.getString("nome"));
                t.setEndereco(rs.getString("nome"));
                t.setTelefone(rs.getString("nome"));
                t.setContato(rs.getString("nome"));
                t.setEmail(rs.getString("nome"));
                t.setPaginaWeb(rs.getString("nome"));
                t.setDtCadastro(rs.getDate("dtCadastro"));
                transportadoras.add(t);
            }
            ConnectionFactory.closeConnection(conn, pstm);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a "
                    + "transação: " + e.getMessage());
        }
        return transportadoras;
    }

//------------------------------------------------------------------------------
    /*
     * Método responsável por listar uma transportadora com o código enviado por 
     * parâmetro
     */
    @Override
    public Transportadora listById(int id) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(LISTBYID);

            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Transportadora t = new Transportadora();
                t.setCod(rs.getInt("id"));
                t.setNmFantasia(rs.getString("nmFantasia"));
                t.setRazaoSocial(rs.getString("nmFantasia"));
                t.setCnpj(rs.getString("nmFantasia"));
                t.setEndereco(rs.getString("nmFantasia"));
                t.setTelefone(rs.getString("nmFantasia"));
                t.setContato(rs.getString("nmFantasia"));
                t.setEmail(rs.getString("nmFantasia"));
                t.setPaginaWeb(rs.getString("nmFantasia"));
                t.setDtCadastro(rs.getDate("dtCadastro"));
                return t;
            }
            ConnectionFactory.closeConnection(conn, pstm);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a "
                    + "transação");
        }
        return null;
    }
}
