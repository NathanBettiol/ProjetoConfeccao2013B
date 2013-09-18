/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.model.persistencia;

import br.senai.sc.model.negocio.Medida;
import br.senai.sc.persistencia.dao.MedidaDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo_lourenco
 */
public class MedidaDaoJDBC implements MedidaDAO {

    private final String INSERT = "Insert into medidas(nm_usuario, md_busto, md_cintura, md_quadril, md_ombros, md_altura) values (?, ?, ?, ?, ?, ?)";
    private final String UPDATE = "update medidas set nm_usuario = ?, md_busto = ?, md_cintura = ?, md_quadril = ?, md_ombros = ?, md_altura = ? where cod_medida = ?";
    private final String DELETE = "delete from medidas where cod_medida = ?";
    private final String LIST = "select * from medidas";

    @Override
    public boolean insert(Medida m) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(INSERT);
            pstm.setInt(1, m.getUsuario().getCod());
            pstm.setDouble(2, m.getMdBusto());
            pstm.setDouble(3, m.getMdCintura());
            pstm.setDouble(4, m.getMdQuadril());
            pstm.setDouble(5, m.getMdOmbros());
            pstm.setDouble(6, m.getAltura());
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
    public boolean update(Medida m) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(INSERT);
            pstm.setInt(1, m.getUsuario().getCod());
            pstm.setDouble(2, m.getMdBusto());
            pstm.setDouble(3, m.getMdCintura());
            pstm.setDouble(4, m.getMdQuadril());
            pstm.setDouble(5, m.getMdOmbros());
            pstm.setDouble(6, m.getAltura());
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
            JOptionPane.showMessageDialog(null, "Transação efetuada com sucesso");
            ConnectionFactory.closeConnection(conn, pstm);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel efetuar a transação");
            return false;
        }

    }

    @Override
    public List<Medida> listall() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
