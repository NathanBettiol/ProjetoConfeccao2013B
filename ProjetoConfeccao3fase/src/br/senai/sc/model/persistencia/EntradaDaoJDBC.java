/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.model.persistencia;

import br.senai.sc.model.negocio.Entrada;
import br.senai.sc.persistencia.dao.EntradaDAO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author nathan_bettiol
 */
 
 /* classe EntradaDaoJDBC que sera responsavel pela inserção, atualização, remoção, e lista dos registros  */
public class EntradaDaoJDBC implements EntradaDAO {


// insere um registro no banco de dados 
     private final String INSERT = "insert into entrada(data_emissao, funcionario,produto ,quantidade, preco , nr_nota_fiscal) "
            + "values (?, ?, ?, ?, ?, ?)";
// atualiza um registro no banco de dados           
    private final String UPDATE = "update entrada set data_emissao = ?, funcionario = ?, produto = ?, quantidade = ?, preco = ?, nr_nota_fiscal = ? where cod_entrada = ?";
    private final String DELETE = "delete from entrada where cod_entrada = ?";
    private final String LIST = "select * from entrada ";
    private final String LISTBYID = "select * from entrada where cod_entrada = ?";
    
    
    
    
    @Override
    public boolean insert(Entrada e) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(INSERT);

            
            pstm.setDate(1, new java.sql.Date(e.getDtEmissao().getTime()));
            pstm.setString(2, e.getFuncionario());
            pstm.setString(3, e.getProduto());
            pstm.setInt(4, e.getQtProduto());
            pstm.setDouble(5, e.getPreco());
            pstm.setInt(6, e.getNrNotaFiscal());
            
           
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Inserção efetuada com "
                    + "sucesso");
            ConnectionFactory.closeConnection(conn, pstm);
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a "
                    + "Inserção" + ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean update(Entrada e) {
          Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(UPDATE);

            
            pstm.setDate(1, (Date) new java.sql.Date(e.getDtEmissao().getTime()));
            pstm.setString(2, e.getFuncionario());
            pstm.setString(3, e.getProduto());
            pstm.setInt(4, e.getQtProduto());
            pstm.setDouble(5, e.getPreco());
            pstm.setInt(6, e.getNrNotaFiscal());
            pstm.setInt(7, e.getCodigo());
            
           
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Atualização efetuada com "
                    + "sucesso");
            ConnectionFactory.closeConnection(conn, pstm);
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a "
                    + "Atualização" + ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean delete(int codigoEntrada) {
            Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(DELETE);

            pstm.setInt(1, codigoEntrada);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Mudança efetuada com "
                    + "sucesso");
            ConnectionFactory.closeConnection(conn, pstm);
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a "
                    + "mudança");
            return false;
        }
    }

    @Override
    public List<Entrada> listAll() {
      List<Entrada> entradas = new ArrayList<>();
         Connection conn;
          try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(LIST);

            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Entrada e = new Entrada();
                e.setDtEmissao(rs.getDate("data_emissao"));
                e.setFuncionario(rs.getString("funcionario"));
                e.setNrNotaFiscal(rs.getInt("nr_nota_fiscal"));
                e.setPreco(rs.getDouble("preco"));
                e.setProduto(rs.getString("produto"));
                e.setQtProduto(rs.getInt("quantidade"));
                
                entradas.add(e);
                 }
            ConnectionFactory.closeConnection(conn, pstm);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a "
                    + "transação: " + e.getMessage());
        }
        return entradas;
    }
    
    @Override
    public Entrada listById(int codigoEntrada) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(LISTBYID);

            pstm.setInt(1, codigoEntrada);
            ResultSet rs = pstm.executeQuery();
            ConnectionFactory.closeConnection(conn, pstm);
        }catch (Exception ex){
              JOptionPane.showMessageDialog(null, "Não foi possível efetuar a "
                    + "transação" + ex.getMessage());
        }
        return null;
    }
  
   
    
   
    
}
