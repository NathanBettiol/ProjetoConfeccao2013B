/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.Usuario;
import br.senai.sc.model.persistencia.UsuarioDaoJDBC;
import br.senai.sc.persistencia.dao.UsuarioDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;


public class TesteAtualizacaoUsuario {
	public static void main(String[] args) {
    	Usuario u = new Usuario();
   	 
    	u.setLogin(JOptionPane.showInputDialog("Digite seu login: "));
    	u.setSenha(JOptionPane.showInputDialog("Digite sua senha: "));
    	u.setNome(JOptionPane.showInputDialog("Informe o nome do usuario: "));
    	u.setCpf(JOptionPane.showInputDialog("Digite seu cpf: "));
    	u.setEmail(JOptionPane.showInputDialog("Digite seu e-mail: "));
    	String dataNascimento = JOptionPane.showInputDialog("Informe a data de nascimento: ");
    	try {
        	u.setDataNascimento(new SimpleDateFormat("dd/MM/yyyy").parse(dataNascimento));
    	} catch (ParseException ex) {
    	u.setCod(Integer.parseInt(JOptionPane.showInputDialog("Informe o "
            	+ "id da pessoa a ser alterada")));
   	 
       	 
        	UsuarioDAO dao = new UsuarioDaoJDBC();
    	dao.update(u);
	}
	}
}

