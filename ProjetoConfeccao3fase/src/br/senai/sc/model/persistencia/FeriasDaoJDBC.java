/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.model.persistencia;

import br.senai.sc.model.negocio.Ferias;
import br.senai.sc.persistencia.dao.FeriasDAO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author larissa_mezari
 */
public class FeriasDaoJDBC implements FeriasDAO {
   
    
	private final String INSERT = "insert into ferias(cod_funcionario, dt_inicio, dt_fim) "
        	+ "values (?, ?, ?)";
	private final String UPDATE = "update ferias set cod_funcionario = ?, "
        	+ "dt_inicio = ?, dt_fim  where id = ?";
	private final String DELETE = "delete from ferias where id = ?";
	private final String LIST = "select * from ferias, cod_funcionario where ";
        	
	/*
 	* Método que realiza a inserção de uma pessoa na base de dados
 	*/

    	public boolean insert(Ferias f) {
    	Connection conn;
    	try {
        	conn = ConnectionFactory.getConnection();
        	PreparedStatement pstm = conn.prepareStatement(INSERT);

        	pstm.setString(1, f.getFuncionario());
        	pstm.setDate(2, (Date) new java.sql.Date(f.getDataFim().getTime()));
        	pstm.setDate(2, (Date) new java.sql.Date(f.getDataInicio().getTime()));
       	pstm.execute();
        	JOptionPane.showMessageDialog(null, "Inserido com sucesso ");
        	ConnectionFactory.closeConnection(conn, pstm);
        	return true;
    	} catch (Exception e) {
        	JOptionPane.showMessageDialog(null, "Erro ao inserir "
                	 + e.getMessage());
        	return false;
    	}
	}

	/*
 	* Método responsável por atualizar uma pessoa na base de dados
 	*/
    	public boolean update(Ferias f) {
    	Connection conn;
    	try {
        	conn = ConnectionFactory.getConnection();
        	PreparedStatement pstm = conn.prepareStatement(UPDATE);

       	pstm.setString(1, f.getFuncionario());
        	pstm.setDate(2, (Date) new java.sql.Date(f.getDataFim().getTime()));
        	pstm.setDate(3, (Date) new java.sql.Date(f.getDataInicio() .getTime()));
        	pstm.execute();
        	JOptionPane.showMessageDialog(null, "Atualização feita com"
                	+ "sucesso");
        	ConnectionFactory.closeConnection(conn, pstm);
        	return true;
    	} catch (Exception e) {
        	JOptionPane.showMessageDialog(null, "Não foi possível fazer a "
                	+ "atualização");
        	return false;
    	}
	}

	/*
 	* Método responsável por remover uma pessoa da base de dados
 	*/
    	public boolean delete(int id) {
    	Connection conn;
    	try {
        	conn = ConnectionFactory.getConnection();
        	PreparedStatement pstm = conn.prepareStatement(DELETE);

        	pstm.setInt(1, id);
        	pstm.execute();
        	JOptionPane.showMessageDialog(null, "Deletado com "
                	+ "sucesso");
        	ConnectionFactory.closeConnection(conn, pstm);
        	return true;
    	} catch (Exception e) {
        	JOptionPane.showMessageDialog(null, "Não foi possível deletar ");
        	return false;
    	}
	}

	/*
 	* Método responsável por trazer as pessoas da base de dados
 	*/
	public List<Ferias> listAll() {
    	Connection conn;
    	List<Ferias> ferias = new ArrayList<>();
    	try {
        	conn = ConnectionFactory.getConnection();
        	PreparedStatement pstm = conn.prepareStatement(LIST);

        	ResultSet rs = pstm.executeQuery();
        	while (rs.next()) {
            	Ferias f = new Ferias();
            	f.setFuncionario(rs.getString("funcionario"));
            	f.setDataInicio(rs.getDate("datainicio"));
            	f.setDataFim(rs.getDate("datafim"));
                Ferias.add(f);

        	}
        	ConnectionFactory.closeConnection(conn, pstm);
    	} catch (Exception e) {
        	JOptionPane.showMessageDialog(null, "Não foi possível listar "
                	 + e.getMessage());
    	}
    	return null;
	}
}
 


