
package br.senai.sc.model.persistencia;

import br.senai.sc.model.negocio.Treinamento;
import br.senai.sc.persistencia.dao.TreinamentoDAO;

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
 * Classe responsável pela persistência da entidade treinamento
 * na base de dados
 * @author Bruna Zakrzeski
 * @version 1.0 09/09/2013
 */


public class TreinamentoDaoJDBC implements TreinamentoDAO {
    
    //Declarando os métodos de INSERT, DELETE, LISTAR POR ID, UPDATE E LISTAR TODOS de TREINAMENTO
    private final String INSERT = "insert into treinamento (nm_treinamento, carga_horaria, conteudo, id_treinamento) values (?,?,?,?)";
    
    private final String UPDATE = "update treinamento set nm_treinamento = ?, carga_horaria = ?, conteudo = ? where id_treinamento = ?";
    
    private final String DELETE = "delete from treinamento where" + " id_treinamento = ?";
    
    private final String LIST = "select * from treinamento where treinamento.id_treinamento = id_treinamento";
    

    
    
    
     /*
     * Método que realiza a inserção de um treinamento
     * e seus dados
     * 
     */
  

    public boolean insert(Treinamento treina) {
        Connection conn;
        try{
            
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(INSERT);
            
            
            pstm.setString(1, treina.getNome());
            pstm.setInt(2, treina.getCargaHoraria());
            pstm.setString(3, treina.getConteudo());
            pstm.setLong(4, treina.getId());
            
            pstm.execute();
            
            JOptionPane.showMessageDialog(null, "Dados enviados com sucesso!");
            ConnectionFactory.closeConnection(conn, pstm);
            
            return true;
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Dados não enviados!" + e.getMessage());
            
          }
        return false;
    }
    
   
    
    
     /*
     * Método que realiza a alteração de um treinamento
     * e seus dados
     * 
     */
    
    public boolean update(Treinamento treina) {
         Connection conn;
         
        try{
            conn = ConnectionFactory.getConnection(); 
            PreparedStatement pstm = conn.prepareStatement(UPDATE);
            
            
            pstm.setString(1, treina.getNome());
            pstm.setInt(2, treina.getCargaHoraria());
            pstm.setString(3, treina.getConteudo());
            pstm.setLong(4, treina.getId());
            
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
     * Método que realiza a remoção de um treinamento
     * e seus dados
     * 
     */
    
    
    public boolean delete(int id) {
         Connection conn;
         
        try{
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(DELETE);
        
            pstm.setInt(1, id);
            
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
     * Método que realiza a listagem todos os dados de um treinamento
     * e seus dados
     * 
     */

    public List<Treinamento> listAll() {
         Connection conn;
         
         List<Treinamento> treino = new ArrayList<>();
         
        try{
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(LIST);
            
            
            ResultSet rs = pstm.executeQuery();
             while (rs.next()){
                 
            Treinamento treina = new Treinamento();
            
            treina.setId(rs.getInt("id_treinamento"));
            treina.setNome(rs.getString("nm_treinamento"));
            treina.setCargaHoraria(rs.getInt("carga_horaria"));
            treina.setConteudo(rs.getString("conteudo"));
            
            treino.add(treina);
       } 
        ConnectionFactory.closeConnection(conn, pstm);
       
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Dados não enviados!" + e.getMessage());
            
          
        }return treino;   
        
        }
        

    }
