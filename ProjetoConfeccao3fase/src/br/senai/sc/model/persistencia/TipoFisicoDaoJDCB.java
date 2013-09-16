/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.model.persistencia;

import br.senai.sc.model.negocio.TipoFisico;
import br.senai.sc.persistencia.dao.TipoFisicoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo_lourenco
 */
public class TipoFisicoDaoJDCB implements TipoFisicoDAO {

    private final String INSERT = "Insert into tipos_fisicos(nm_tipos_fisicos, genero, descricao) values (?, ?, ?)";
    private final String UPDATE = "update tipos_fisicos set nm_tipos_fisicos = ?, genero = ?, descricao = ? where cod_tipos_fisicos = ?";
    private final String DELETE = "delete from tipos_fisicos where cod_tipos_fisicos = ?";
    private final String LIST = "select * from tipos_fisicos";

    @Override
    public boolean insert(TipoFisico tf) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(INSERT);
            pstm.setString(1, tf.getNome());
            pstm.setString(2, tf.getGenero());
            pstm.setString(3, tf.getDescicao());
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Operação realizada sem problemas");
            ConnectionFactory.closeConnection(conn, pstm);
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + ex);
            return false;
        }

    }

    @Override
    public boolean update(TipoFisico tf) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(UPDATE);
            pstm.setString(1, tf.getNome());
            pstm.setString(2, tf.getGenero());
            pstm.setString(3, tf.getDescicao());
            pstm.setInt(4, tf.getCodigo());
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Operação realizada sem problemas");
            ConnectionFactory.closeConnection(conn, pstm);
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + ex);
            return false;
        }
    }

    @Override
    public boolean delete(int id) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(DELETE);
            pstm.setInt(1, id);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Operação realizada sem problemas");
            ConnectionFactory.closeConnection(conn, pstm);
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + ex);
            return false;
        }

    }

    @Override
    public List<TipoFisico> listall() {
        Connection conn;
        List<TipoFisico> tipofisico = new ArrayList<>();
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(LIST);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                TipoFisico tf = new TipoFisico();
                tf.setCodigo(rs.getInt("cod_tipos_fisicos"));
                tf.setNome(rs.getString("nm_tipos_fisicos"));
                tf.setGenero(rs.getString("genero"));
                tf.setDescicao(rs.getString("descricao"));
                tipofisico.add(tf);
            }
            ConnectionFactory.closeConnection(conn, pstm);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + ex);
        }
        return tipofisico;
    }
}
