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

/**
 *
 * @author larissa_mezari
 */
public class TesteInsercaoUsuario {
	public static void main(String[] args) {

    	Usuario u  = new Usuario();
    	u.setLogin(JOptionPane.showInputDialog("Digite seu login: "));
    	u.setSenha(JOptionPane.showInputDialog("Digite sua senha: "));
    	u.setNome(JOptionPane.showInputDialog("Informe o nome do usuario: "));
    	u.setCpf(JOptionPane.showInputDialog("Digite seu cpf: "));
    	u.setEmail(JOptionPane.showInputDialog("Digite seu e-mail: "));
    	String dtNascimento = JOptionPane.showInputDialog("Informe a data de nascimento: ");
    	try {
        	u.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse(dtNascimento));
    	} catch (ParseException ex) {
   	 
   	 
            	System.out.println("Erro ao converter a data de nascimento");
    	}
        u.setRg(JOptionPane.showInputDialog("Digite seu rg: "));
        u.setEndereco(JOptionPane.showInputDialog("Digite seu endereço: "));
        u.setTelefone(JOptionPane.showInputDialog("Digite seu telefone: "));
        String dtCadastro = JOptionPane.showInputDialog("Informe a data de cadastro: ");
    	try {
        	u.setDtCadastro(new SimpleDateFormat("dd/MM/yyyy").parse(dtCadastro));
    	} catch (ParseException ex) {
   	 
   	 
            	System.out.println("Erro ao converter a data de nascimento");
    	}
   	 

    	UsuarioDAO dao = new UsuarioDaoJDBC();
    	dao.insert(u);


	}
}

