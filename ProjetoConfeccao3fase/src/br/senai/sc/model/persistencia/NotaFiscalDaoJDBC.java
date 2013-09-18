package br.senai.sc.model.persistencia;

import br.senai.sc.model.negocio.NotaFiscal;
import br.senai.sc.persistencia.dao.NotaFiscalDAO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class NotaFiscalDaoJDBC implements NotaFiscalDAO {

    private final String INSERT = "Insert into Nota_fiscal(dt_emissao,produtos,vl_Total,destinatario,remetente,cod_funcionario) values (?,?,?,?,?,?)";
    private final String UPDATE = "update Nota_fiscal set  dt_emissao= ?,produtos= ?,vl_Total= ?,destinatario= ?,remetente= ?,cod_funcionario=? where cod_nota_fiscal Numero = ?";
    private final String DELETE = "delete from Nota_fiscal where cod_nota_fiscal = ?";
    private final String LIST = "select * from Nota_fiscal";
    private final String LISTBYID = "select * from Nota_fiscal where cod_nota_fiscal= ?";

    public boolean insert(NotaFiscal e) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(INSERT);
            pstm.setDate(1, new java.sql.Date(e.getDataEmissao().getTime()));
            pstm.setString(2, e.getProdutos());
            pstm.setDouble(3, e.getValorTotal());
            pstm.setString(4, e.getDestinatario());
            pstm.setString(5, e.getRemetente());
            pstm.setString(6 , e.getFuncionarioResponsavel());
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Transação efetuada com sucesso");
            ConnectionFactory.closeConnection(conn, pstm);
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel efetuar a transação" + ex.getMessage());
            return false;
        }
    }
    /*
     * Método responsável por atualizar uma endereco na base de dados
     */

    public boolean update(NotaFiscal e) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(UPDATE);
            pstm.setDate(1, (Date) e.getDataEmissao());
            pstm.setString(2, e.getProdutos());
            pstm.setDouble(3, e.getValorTotal());
            pstm.setString(4, e.getDestinatario());
            pstm.setString(5, e.getRemetente());
            pstm.setString(6 , e.getFuncionarioResponsavel());
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Transação efetuada com sucesso");
            ConnectionFactory.closeConnection(conn, pstm);
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel efetuar a transação" + ex.getMessage());
            return false;
        }
    }

    /*
     * Método responsável por remover uma endereco da base de dados
     */
    @Override
    public boolean delete(int codNumero) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(DELETE);
            pstm.setInt(1, codNumero);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Transação efetuada com sucesso");
            ConnectionFactory.closeConnection(conn, pstm);
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel efetuar a transação" + ex.getMessage());
            return false;
        }
    }

    /*
     * Método responsável por trazer as enderecos da base de dados
     */
    @Override
    public List<NotaFiscal> listAll() {
        Connection conn;
        List<NotaFiscal> notasFiscais = new ArrayList<>();
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(LIST);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                NotaFiscal e = new NotaFiscal();
                e.setDataEmissao(rs.getString("dt_emissao"));
                e.setProdutos(rs.getString("produtos"));
                e.setCodNumero(rs.getInt("cod_nota_fiscal"));
                e.setValorTotal(rs.getDouble("vl_total"));
                e.setFuncionarioResponsavel(rs.getString("cod_funcionario"));
                e.setDestinatario(rs.getString("destinatario"));
                e.setRemetente(rs.getString("remetente"));
                notasFiscais.add(e);
            }
//dataEmissao,produtos,valorTotal,funcionarioResponsavel,destinatario,remetente
//            ConnectionFactory.closeConnection(conn, pstm);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel efetuar a transação" + ex.getMessage());

        }
        return notasFiscais;
    }

    /*
     * Método responsável por listar uma nota fiscal com o código enviado por parâmetro
     */
    @Override
    public NotaFiscal listById(int id) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(LISTBYID);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                NotaFiscal e = new NotaFiscal();

                e.setDataEmissao(rs.getString("dt_emissao"));
                e.setProdutos(rs.getString("produtos"));
                e.setCodNumero(rs.getInt("cod_nota_fiscal"));
                e.setValorTotal(rs.getDouble("vl_total"));
                e.setFuncionarioResponsavel(rs.getString("cod_funcionario"));
                e.setDestinatario(rs.getString("destinatario"));
                e.setRemetente(rs.getString("remetente"));

                return e;
            }

            ConnectionFactory.closeConnection(conn, pstm);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel efetuar a transação" + ex.getMessage());

        }
        return null;
    }
}
