/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.model.persistencia;

import br.senai.sc.model.negocio.Usuario;
import br.senai.sc.persistencia.dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author larissa_mezari
 */
public class UsuarioDaoJDBC implements UsuarioDAO {
    
	private final String INSERT = "insert into usuario(login, senha, nm_usuario, cpf, email, dt_nascimento) "
        	+ "values (?, ?, ?, ?, ?, ?)";
	private final String UPDATE = "update usuario set login = ?, senha = ?, nm_usuario = ?, cpf = ?, email = ? "
        	+ "dtnascimento = ?,  where cod_usuario = ?";
	private final String DELETE = "delete from usuario where id = ?";
	private final String LIST = "select * from usuario, endereco where "
        	+ "usuario.id_endereco = endereco.id";
	private final String LISTBYID = "select * from usuario, endereco"
        	+ "where usuario.id_endereco = endereco.id and id = ?";
	/*
 	* Método que realiza a inserção de uma pessoa na base de dados
 	*/

    	public boolean insert(Usuario u) {
    	Connection conn;
    	try {
        	conn = ConnectionFactory.getConnection();
        	PreparedStatement pstm = conn.prepareStatement(INSERT);

        	pstm.setString(1, u.getLogin());
        	pstm.setString(2, u.getSenha());
        	pstm.setString(3, u.getNome());
        	pstm.setString(4, u.getCpf());
        	pstm.setString(5, u.getEmail());
        	pstm.setDate(6, new java.sql.Date(u.getDataNascimento().getTime()));
        	pstm.execute();
        	JOptionPane.showMessageDialog(null, "Usuario cadastrado com "
                	+ "sucesso");
        	ConnectionFactory.closeConnection(conn, pstm);
        	return true;
    	} catch (Exception e) {
        	JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o "
                	+ "usuario" + e.getMessage());
        	return false;
    	}
	}

	/*
 	* Método responsável por atualizar uma pessoa na base de dados
 	*/
    	public boolean update(Usuario u) {
    	Connection conn;
    	try {
        	conn = ConnectionFactory.getConnection();
        	PreparedStatement pstm = conn.prepareStatement(UPDATE);

       	pstm.setString(1, u.getLogin());
        	pstm.setString(2, u.getSenha());
        	pstm.setString(3, u.getNome());
        	pstm.setString(4, u.getCpf());
        	pstm.setString(5, u.getEmail());
        	pstm.setDate(6, new java.sql.Date(u.getDataNascimento().getTime()));
        	pstm.setInt(7, u.getCod());
        	pstm.execute();
        	JOptionPane.showMessageDialog(null, "Usuario atualizado com "
                	+ "sucesso");
        	ConnectionFactory.closeConnection(conn, pstm);
        	return true;
       	 
    	} catch (Exception e) {
        	JOptionPane.showMessageDialog(null, "Não foi possível atualizar o "
                	+ "usuario" + e.getMessage()) ;
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
        	JOptionPane.showMessageDialog(null, "Transação efetuada com "
                	+ "sucesso");
        	ConnectionFactory.closeConnection(conn, pstm);
        	return true;
    	} catch (Exception e) {
        	JOptionPane.showMessageDialog(null, "Não foi possível efetuar a "
                	+ "transação");
        	return false;
    	}
	}

	/*
 	* Método responsável por trazer as pessoas da base de dados
 	*/
	public List<Usuario> listAll() {
    	Connection conn;
    	List<Usuario> usuarios = new ArrayList<>();
    	try {
        	conn = ConnectionFactory.getConnection();
        	PreparedStatement pstm = conn.prepareStatement(LIST);

        	ResultSet rs = pstm.executeQuery();
        	while (rs.next()) {
            	Usuario u = new Usuario();
            	u.setCod(rs.getInt("codigo"));
                u.setCpf(rs.getString("cpf"));
                u.setDataNascimento(rs.getDate("datanascimento"));
                u.setDtCadastro(rs.getDate("datacadastro"));
                u.setEmail(rs.getString("email"));
                u.setLogin(rs.getString("login"));
                u.setNome(rs.getString("nome"));
                u.setSenha(rs.getString("senha"));
                u.setTelefone(rs.getString("telefone"));
            	
            	
                usuarios.add(u);

        	}
        	ConnectionFactory.closeConnection(conn, pstm);
    	} catch (Exception e) {
        	JOptionPane.showMessageDialog(null, "Não foi possível efetuar a "
                	+ "transação: " + e.getMessage());
    	}
    	return null;
	}

   
}


