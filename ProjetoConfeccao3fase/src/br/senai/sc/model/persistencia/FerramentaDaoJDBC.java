package br.senai.sc.model.persistencia;

import br.senai.sc.model.negocio.Ferramenta;
import br.senai.sc.model.negocio.Pessoa;
import br.senai.sc.model.negocio.Produto;
import br.senai.sc.persistencia.dao.FerramentaDAO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class FerramentaDaoJDBC implements FerramentaDAO{

    private final String INSERT = "INSERT INTO produtos(cod_ferramenta, nome, descricao, nm_fabricante, dt_cadastro, status) values (?,?,?,?,?,?)";
    private final String UPDATE = "UPDATE produtos SET cod_ferramenta = ?, nome = ?, descricao = ?, nm_fabricante = ?, dt_cadastro = ?, status = ? WHERE cod_produto = ?";
    private final String DELETE = "DELETE FROM produtos WHERE cod_produto = ?";
    private final String LIST = "SELECT * FROM produto";
    private final String LISTBYID = "SELECT * FROM produto WHERE cod_produto = ?";

    public boolean insert(Ferramenta f) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(INSERT);
            pstm.setInt(1, f.getCodFerramenta());
            pstm.setString(2, f.getNome());
            pstm.setString(3, f.getDescricao());
            pstm.setString(4, f.getNmFabricante());
            pstm.setDate(5, new java.sql.Date(f.getDtCadastro().getTime()));
            pstm.setString(6, f.getStatus());
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Transação efetuada com sucesso");
            ConnectionFactory.closeConnection(conn, pstm);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a transação" + e.getMessage());
            return false;
        }
    }

    public boolean update(Ferramenta f) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(UPDATE);
            pstm.setInt(1, f.getCodFerramenta());
            pstm.setString(2, f.getNome());
            pstm.setString(3, f.getDescricao());
            pstm.setString(4, f.getNmFabricante());
            pstm.setDate(5, (Date) f.getDtCadastro());
            pstm.setString(6, f.getStatus());
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Transação efetuada com sucesso");
            ConnectionFactory.closeConnection(conn, pstm);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a transação" + e.getMessage());
            return false;
        }
    }

    public boolean delete(int codFerramenta) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(DELETE);

            pstm.setInt(1, codFerramenta);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Transação efetuada com sucesso");
            ConnectionFactory.closeConnection(conn, pstm);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a transação" + e.getMessage());
            return false;

        }
    }
    
         public List<Ferramenta> listAll() {
        Connection conn;
        List<Ferramenta> ferramentas = new ArrayList<>();
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(LIST);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Ferramenta f = new Ferramenta();
                f.setCodFerramenta(rs.getInt("cod_ferramenta"));
                f.setNome(rs.getString("nome"));
                f.setDescricao(rs.getString("descricao"));
                f.setNmFabricante(rs.getString("nm_fabricante"));
                f.setDtCadastro(rs.getDate("dt_cadastro"));
                f.setStatus(rs.getString("status"));
                ferramentas.add(f);
            }
            ConnectionFactory.closeConnection(conn, pstm);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a transação");
        }
        return ferramentas;
    }
            
    @Override
        public Ferramenta listById(int codFerramenta) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(LISTBYID);
            pstm.setInt(1, codFerramenta);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Ferramenta f = new Ferramenta();
                f.setCodFerramenta(rs.getInt("cod_ferramenta"));
                f.setNome(rs.getString("nome"));
                f.setDescricao(rs.getString("descricao"));
                f.setNmFabricante(rs.getString("nm_fabricante"));
                f.setDtCadastro(rs.getDate("dt_cadastro"));
                f.setStatus(rs.getString("status"));
                return f;
            }
            ConnectionFactory.closeConnection(conn, pstm);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a transação");
        }
        return null;
    }
}
