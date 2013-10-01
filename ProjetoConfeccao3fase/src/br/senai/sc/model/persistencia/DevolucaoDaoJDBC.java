/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.model.persistencia;

import br.senai.sc.model.negocio.Devolucao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author douglas_ghisleri
 */
public class DevolucaoDaoJDBC {

    private final String INSERT = "insert into devolucao"
            + "(peca, dt_devolucao, qt_devolucao) values "
            + "(?,?,?,?)";
    private final String UPDATE = "update devolucao set "
            + "peca = ?, dt_devolucao = ?, qt_devolucao = ?"
            + "where cod_devolucao = ?";
    private final String DELETE = "delete from devolucao "
            + "where cod_devolucao = ?";
    private final String LIST = "select * from devolucao";
    private final String LISTBYID = "select * from devolucao "
            + "where cod_devolucao = ?";

    /*
     * Método que realiza a inserção de uma endereco na base 
     * de dados
     * 
     */
    public boolean insert(Devolucao d) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(INSERT);
            pstm.setDate(1, new java.sql.Date(d.getDataDevolucao().getTime()));
            pstm.setString(2, d.getPeca());
            pstm.setInt(3, d.getQuantidade());
            pstm.execute();
            JOptionPane.showMessageDialog(null,
                    "Transação efetuada com sucesso");
            ConnectionFactory.closeConnection(conn, pstm);
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    "Não foi possível efetuar a transação" + ex.getMessage());
            return false;
        }
    }

    /*
     * Método responsável por atualizar uma endereco 
     * na base de dados
     */
    public boolean update(Devolucao d) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(UPDATE);
            pstm.setDate(1, new java.sql.Date(d.getDataDevolucao().getTime()));
            pstm.setString(2, d.getPeca());
            pstm.setInt(3, d.getQuantidade());
            pstm.setInt(4, d.getCod_devolucao());
            pstm.execute();
            JOptionPane.showMessageDialog(null,
                    "Transação efetuada com sucesso");
            ConnectionFactory.closeConnection(conn, pstm);
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    "Não foi possível efetuar a transação" + ex.getMessage());
            return false;
        }
    }

    /*
     * Método responsável por remover uma endereco da base de 
     * dados.
     */
    public boolean delete(int cod_devolucao) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(DELETE);

            pstm.setInt(1, cod_devolucao);
            pstm.execute();
            JOptionPane.showMessageDialog(null,
                    "Transação efetuada com sucesso");
            ConnectionFactory.closeConnection(conn, pstm);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Não foi possível efetuar a transação");
            return false;
        }
    }

    /*
     * Método responsável por trazer as enderecos da base
     * de dados
     */
    public List<Devolucao> listAll() {
        Connection conn;
        List<Devolucao> devolucoes = new ArrayList<>();
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(LIST);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Devolucao d = new Devolucao();
                d.setPeca(rs.getString("Peça"));
                d.setDataDevolucao(rs.getDate("Data devolução"));
                d.setCod_devolucao(rs.getInt("Codigo devolução"));
                d.setQuantidade(rs.getInt("Quantidade"));

                devolucoes.add(d);
            }
            ConnectionFactory.closeConnection(conn, pstm);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    "Não foi possível efetuar a transação"
                    + ex.getMessage());

        }
        return devolucoes;
    }

    /*
     * Método responsável por listar uma endereco com o código 
     * enviado por parâmetro
     * 
     */
    public Devolucao listById(int cod_devolucao) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(LISTBYID);
            pstm.setInt(1, cod_devolucao);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Devolucao d = new Devolucao();
                d.setPeca(rs.getString("Peça"));
                d.setDataDevolucao(rs.getDate("Data devolução"));
                d.setCod_devolucao(rs.getInt("Codigo devolução"));
                d.setQuantidade(rs.getInt("Quantidade"));
                return d;
            }
            ConnectionFactory.closeConnection(conn, pstm);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    "Não foi possível efetuar a transação"
                    + ex.getMessage());

        }
        return null;
    }
}
