package br.senai.sc.model.persistencia;

import br.senai.sc.model.negocio.Transportadora;
import br.senai.sc.persistencia.dao.TransportadoraDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
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

    @Override
    public boolean update(Transportadora t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Transportadora> listAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Transportadora listById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
