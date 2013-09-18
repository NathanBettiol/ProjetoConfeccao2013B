package br.senai.sc.model.persistencia;

import br.senai.sc.model.negocio.Fabricante;
import br.senai.sc.persistencia.dao.FabricanteDAO;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
     * Classe responsável pelos métodos de banco da Classe Fabricante
     * @author Mateus Generoso
     * @version 1.0 16/09/2013
     * @param p
     * @return
     */

public class FabricanteDaoJDBC implements FabricanteDAO {

    private final String INSERT = "INSERT INTO fabricante(cod_fabricante, nmfantasia, cnpj, telefone, email, endereco) values (?,?,?,?,?,?)";
    private final String UPDATE = "UPDATE fabricante SET nmfantasia = ?, cnpj = ?, telefone = ?, email = ?, endereco = ? WHERE cod_fabricante = ?";
    private final String DELETE = "DELETE FROM fabricante WHERE cod_fabricante = ?";
    private final String LIST = "SELECT * FROM fabricante";
    private final String LISTBYID = "SELECT * FROM fabricante WHERE cod_fabricante = ?";

    
    @Override
    /* INSERÇÃO */
    public boolean insert(Fabricante fab) {
        Connection conn;
            try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(INSERT);
            pstm.setInt(1, fab.getCod());
            pstm.setString(2, fab.getNmFantasia());
            pstm.setString(3, fab.getCnpj());
            pstm.setString(4, fab.getTelefone());
            pstm.setString(5, fab.getEmail());
            pstm.setString(6, fab.getEndereco());
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Transação efetuada com sucesso");
            ConnectionFactory.closeConnection(conn, pstm);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a transação" + e.getMessage());
            return false;
        }
    }

    @Override
    /* ALTERAÇÃO */
    public boolean update(Fabricante fab) {
            Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(UPDATE);
            pstm.setString(1, fab.getNmFantasia());
            pstm.setString(2, fab.getCnpj());
            pstm.setString(3, fab.getTelefone());
            pstm.setString(4, fab.getEmail());
            pstm.setString(5, fab.getEndereco());
            pstm.setInt(6, fab.getCod());
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Transação efetuada com sucesso");
            ConnectionFactory.closeConnection(conn, pstm);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a transação" + e.getMessage());
            return false;
        }
    }

    @Override
    /* DELEÇÃO */
    public boolean delete(int codFabricante) {
            Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(DELETE);

            pstm.setInt(1, codFabricante);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Transação efetuada com sucesso");
            ConnectionFactory.closeConnection(conn, pstm);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a transação" + e.getMessage());
            return false;

        }
    }

    @Override
    /* LISTAGEM */
    public List<Fabricante> listAll() {
    Connection conn;
        List<Fabricante> fabricante = new ArrayList<>();
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(LIST);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Fabricante f = new Fabricante();
                f.setCod(rs.getInt("cod_fabricante"));
                f.setNmFantasia(rs.getString("nmfantasia"));
                f.setCnpj(rs.getString("cnpj"));
                f.setTelefone(rs.getString("telefone"));
                f.setEmail(rs.getString("email"));
                f.setEndereco(rs.getString("endereco"));
                fabricante.add(f);
            }
            ConnectionFactory.closeConnection(conn, pstm);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a transação");
        }
        return fabricante;
    }

    @Override
    /* LISTAGEM POR ID */
    public Fabricante listById(int codFabricante) {
       Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(LISTBYID);
            pstm.setInt(1, codFabricante);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Fabricante f = new Fabricante();
                f.setCod(rs.getInt("cod_fabricante"));
                f.setNmFantasia(rs.getString("nmfantasia"));
                f.setCnpj(rs.getString("cnpj"));
                f.setTelefone(rs.getString("telefone"));
                f.setEmail(rs.getString("email"));
                f.setEndereco(rs.getString("endereco"));
                return f;
            }
            ConnectionFactory.closeConnection(conn, pstm);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a transação");
        }
        return null;
    }
    }
    

