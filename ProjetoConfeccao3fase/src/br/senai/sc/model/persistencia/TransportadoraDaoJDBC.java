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

    private final String INSERT = "insert into transportadora("
            + "nm_transportadora, razao_social, cnpj, endereco, telefone, "
            + "contato, email, pagina_web, dt_cadastro) "
            + "values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private final String UPDATE = "update transportadora set "
            + "nm_transportadora = ?, razao_social = ?, cnpj = ?, endereco = ?, "
            + "telefone = ?, contato = ?, email = ?, pagina_web = ?, "
            + "dt_cadastro = ? where cod_transportadora = ?";
    private final String DELETE = "delete from transportadora "
            + "where cod_transportadora = ?";
    private final String LIST = "select * from transportadora";
    private final String LISTBYID = "select * from transportadora "
            + "where cod_transportadora = ?";
    private static final String PESQUISA = "select * from transportadora where cod_transportadora like ? or nm_transportadora like ?";

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
     * Método responsável por atualizar uma transportadora na base de dados
     */
    @Override
    public int update(Transportadora t) {
        int retorno = -1;
        Connection con = null;
        PreparedStatement pstm = null;
        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(UPDATE);

            pstm.setString(1, t.getNmFantasia());
            pstm.setString(2, t.getRazaoSocial());
            pstm.setString(3, t.getCnpj());
            pstm.setString(4, t.getEndereco());
            pstm.setString(5, t.getTelefone());
            pstm.setString(6, t.getContato());
            pstm.setString(7, t.getEmail());
            pstm.setString(8, t.getPaginaWeb());
            pstm.setDate(9, new java.sql.Date(t.getDtCadastro().getTime()));
            pstm.setInt(10, t.getCod());
            pstm.execute();
            retorno = t.getCod();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar uma transportadora: " + e.getMessage());
            
        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão: " + e.getMessage());
            }
        }
        return retorno;
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
                t.setCod(rs.getInt("cod_transportadora"));
                t.setNmFantasia(rs.getString("nm_transportadora"));
                t.setRazaoSocial(rs.getString("razao_social"));
                t.setCnpj(rs.getString("cnpj"));
                t.setEndereco(rs.getString("endereco"));
                t.setTelefone(rs.getString("telefone"));
                t.setContato(rs.getString("contato"));
                t.setEmail(rs.getString("email"));
                t.setPaginaWeb(rs.getString("pagina_web"));
                t.setDtCadastro(rs.getDate("dt_cadastro"));
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
    public Transportadora listById(int cod) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(LISTBYID);

            pstm.setInt(1, cod);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Transportadora t = new Transportadora();
                t.setCod(rs.getInt("cod_transportadora"));
                t.setNmFantasia(rs.getString("nm_transportadora"));
                t.setRazaoSocial(rs.getString("razao_social"));
                t.setCnpj(rs.getString("cnpj"));
                t.setEndereco(rs.getString("endereco"));
                t.setTelefone(rs.getString("telefone"));
                t.setContato(rs.getString("contato"));
                t.setEmail(rs.getString("email"));
                t.setPaginaWeb(rs.getString("pagina_web"));
                t.setDtCadastro(rs.getDate("dt_cadastro"));
                return t;
            }
            ConnectionFactory.closeConnection(conn, pstm);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a "
                    + "transação");
        }
        return null;
    }

//------------------------------------------------------------------------------
    @Override
    public List<Transportadora> listPesquisa(String texto) {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<Transportadora> transportadoras = new ArrayList<>();
        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(PESQUISA);
            pstm.setString(1, "%" + texto + "%");
            pstm.setString(2, "%" + texto + "%");
            rs = pstm.executeQuery();
            while (rs.next()) {
                Transportadora t = new Transportadora();
                t.setCod(rs.getInt("cod_transportadora"));
                t.setNmFantasia(rs.getString("nm_transportadora"));
                transportadoras.add(t);
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
        return transportadoras;
    }
}
