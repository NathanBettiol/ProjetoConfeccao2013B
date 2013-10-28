
package br.senai.sc.model.persistencia;

import br.senai.sc.model.negocio.Vagas;
import br.senai.sc.persistencia.dao.VagasDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Classe responsável pela persistência da entidade vagas
 * na base de dados
 * @author Bruna Zakrzeski
 * @version 1.0 09/09/2013
 */


public class VagasDaoJDBC implements VagasDAO {
    
    //Declarando os métodos de INSERT, DELETE, LISTAR POR ID, UPDATE E LISTAR TODOS de VAGAS
    private final String INSERT = "insert into vagas (nm_vaga, qt_vaga, pre_requisitos, funcao, faixa_salarial) values (?,?,?,?,?)";
    
    private final String UPDATE = "update vagas set nm_vaga = ?, qt_vaga = ?, pre_requisitos = ?, funcao = ?, faixa_salarial = ? where cod_vaga = ?";
    
    private final String DELETE = "delete from vagas where" + " cod_vaga = ?";
    
    private final String LIST = "select * from vagas where vagas.cod_vaga = cod_vaga";

    
    
    /*
     * Método que realiza a inserção de um vagas
     * e seus dados
     * 
     */
    
    public boolean insert(Vagas vaga) {
        Connection conn;
        try{
            
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(INSERT);
            
            
            pstm.setString(1, vaga.getNome());
            pstm.setInt(2, vaga.getQtVaga());
            pstm.setString(3, vaga.getPreRequisito());
            pstm.setString(4, vaga.getFuncao());
            pstm.setDouble(5, vaga.getfaixaSalarial());
            
            
            pstm.execute();
            
            
            JOptionPane.showMessageDialog(null, "Dados enviados com sucesso!");
            ConnectionFactory.closeConnection(conn, pstm);
            return true;
            
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Dados não enviados! " + e.getMessage());
            
          }
        return false;
    }
      
        
        
       
     /*
     * Método que realiza a alteração de vagas
     * e seus dados
     * 
     */
        

    public boolean update(Vagas vaga) {
        Connection conn;
         
        try{
            conn = ConnectionFactory.getConnection(); 
            PreparedStatement pstm = conn.prepareStatement(UPDATE);
           
            
            pstm.setString(1, vaga.getNome());
            pstm.setInt(2, vaga.getQtVaga());
            pstm.setString(3, vaga.getPreRequisito());
            pstm.setString(4, vaga.getFuncao());
            pstm.setDouble(5, vaga.getfaixaSalarial());
            pstm.setInt(6, vaga.getCodigo());
            
            pstm.execute();
        
        
        JOptionPane.showMessageDialog(null, "Dados enviados!");
            ConnectionFactory.closeConnection(conn, pstm);
            return true;
            
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Dados não enviados!" + e.getMessage());
            return false;
        }  
    }
    
    
    
     /*
     * Método que realiza a remoção de vagas
     * e seus dados
     * 
     */
    
   
    public boolean delete(int codigo) {
        
         Connection conn;
         
        try{
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(DELETE);
            
            pstm.setInt(1, codigo);
            
            pstm.execute();
            
            JOptionPane.showMessageDialog(null, "Dados enviados!");
            ConnectionFactory.closeConnection(conn, pstm);
            return true;
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Dados não enviados!" + e.getMessage());
            return false;
        }
    }
            
             
    
    
     /*
     * Método que realiza a listagem de vagas
     * e seus dados
     * 
     */

    
    public List<Vagas> listAll() {
        Connection conn;
         
         List<Vagas> vaga = new ArrayList<>();
         
        try{
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(LIST);
            
            
            ResultSet rs = pstm.executeQuery();
             while (rs.next()){
        
                 Vagas vag = new Vagas();
                 
                 
                 vag.setCodigo(rs.getInt("cod_vaga"));
                 vag.setNome(rs.getString("nm_vaga"));
                 vag.setQtVaga(rs.getInt("qt_vaga"));
                 vag.setPreRequisito(rs.getString("pre_requisitos"));
                 vag.setFuncao(rs.getString("funcao"));
                 vag.setfaixaSalaria(rs.getDouble("faixa_salarial"));
                 
                 
            vaga.add(vag);
       } 
        ConnectionFactory.closeConnection(conn, pstm);
       
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Dados não enviados!" + e.getMessage());
            
          
        }return vaga;   
        
        }
        

    }
       
