package br.senai.sc.model.persistencia;

import br.senai.sc.model.negocio.Assistencia;
import br.senai.sc.persistencia.dao.AssistenciaDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Classe responsável pela persistência da entidade assistência na base de dados
 *
 * @author wesley_s
 */
public class AssistenciaDaoJDBC implements AssistenciaDAO { 

    private final String INSERT = "insert into assistencia("
            + "nm_assistencia, razao_social, cnpj, endereco, telefone, "
            + "contato, email, pagina_web, dt_cadastro) "
            + "values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private final String UPDATE = "update assistencia set "
            + "nm_assistencia = ?, razao_social = ?, cnpj = ?, endereco = ?, "
            + "telefone = ?, contato = ?, email = ?, pagina_web = ?, "
            + "dt_cadastro = ? where cod_assistencia = ?";
    private final String DELETE = "delete from assistencia "
            + "where cod_assistencia = ?";
    private final String LIST = "select * from assistencia";

//------------------------------------------------------------------------------
    /*
     * Método que realiza a inserção de uma assistência na base de dados
     */
    @Override
    public boolean insert(Assistencia a) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(INSERT);

            pstm.setString(1, a.getNmFantasia());
            pstm.setString(2, a.getRazaoSocial());
            pstm.setString(3, a.getCnpj());
            pstm.setString(4, a.getEndereco());
            pstm.setString(5, a.getTelefone());
            pstm.setString(6, a.getContato());
            pstm.setString(7, a.getEmail());
            pstm.setString(8, a.getPaginaWeb());
            pstm.setDate(9, new java.sql.Date(a.getDtCadastro().getTime()));
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
     * Método responsável por atualizar uma assistência na base de dados
     */
    @Override
    public boolean update(Assistencia a) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(UPDATE);

            pstm.setString(1, a.getNmFantasia());
            pstm.setString(2, a.getRazaoSocial());
            pstm.setString(3, a.getCnpj());
            pstm.setString(4, a.getEndereco());
            pstm.setString(5, a.getTelefone());
            pstm.setString(6, a.getContato());
            pstm.setString(7, a.getEmail());
            pstm.setString(8, a.getPaginaWeb());
            pstm.setDate(9, new java.sql.Date(a.getDtCadastro().getTime()));
            pstm.setInt(10, a.getCod());
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
     * Método responsável por remover uma assistência da base de dados
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
     * Método responsável por trazer as assistências da base de dados
     */
    @Override
    public List<Assistencia> listAll() {
        Connection conn;
        List<Assistencia> assistencias = new ArrayList<>();
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(LIST);

            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Assistencia a = new Assistencia();
                a.setCod(rs.getInt("cod_assistencia"));
                a.setNmFantasia(rs.getString("nm_assistencia"));
                a.setRazaoSocial(rs.getString("razao_social"));
                a.setCnpj(rs.getString("cnpj"));
                a.setEndereco(rs.getString("endereco"));
                a.setTelefone(rs.getString("telefone"));
                a.setContato(rs.getString("contato"));
                a.setEmail(rs.getString("email"));
                a.setPaginaWeb(rs.getString("pagina_web"));
                a.setDtCadastro(rs.getDate("dt_cadastro"));
                assistencias.add(a);
            }
            ConnectionFactory.closeConnection(conn, pstm);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a "
                    + "transação: " + e.getMessage());
        }
        return assistencias;
    }
}
