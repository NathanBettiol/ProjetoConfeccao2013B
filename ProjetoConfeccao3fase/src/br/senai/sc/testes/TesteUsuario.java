/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes;

import br.senai.sc.model.negocio.Usuario;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author larissa_mezari
 */
public class TesteUsuario {

	public static void main(String[] args) {

    	//Instancia do usuario 1  
    	Usuario u1 = new Usuario();
    	u1.setCod(Integer.parseInt(JOptionPane.showInputDialog("Informe o código: " + u1.getCod())));
    	u1.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
    	u1.setCpf(JOptionPane.showInputDialog("Informe o cpf: "));
    	try {
        	String data = JOptionPane.showInputDialog("Data de Cadastro: ");
        	u1.setDtCadastro((Date) new SimpleDateFormat("dd/MM/yyyy").parse(data));
    	} catch (Exception e) {
        	JOptionPane.showMessageDialog(null, "Data incorreta: " + e);
    	}
    	try {
        	String data = JOptionPane.showInputDialog("Data de Cadastro: ");
        	u1.setDataNascimento((Date) new SimpleDateFormat("dd/MM/yyyy").parse(data));
    	} catch (Exception e) {
        	JOptionPane.showMessageDialog(null, "Data incorreta: " + e);
    	}
   	 
    	u1.setEmail(JOptionPane.showInputDialog("Informe seu E-mail: "));
    	u1.setEndereco(JOptionPane.showInputDialog("Informe o endereço: "));
    	u1.setLogin(JOptionPane.showInputDialog("Entre com o login: "));
    	u1.setSenha(JOptionPane.showInputDialog("Digite sua senha: "));


    	//Instancia do usuario 2
    	Usuario u2 = new Usuario();
    	u2.setCod(Integer.parseInt(JOptionPane.showInputDialog("Informe o código: " + u1.getCod())));
    	u2.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
    	u2.setCpf(JOptionPane.showInputDialog("Informe o cpf: "));
    	try {
        	String data = JOptionPane.showInputDialog("Data de Cadastro: ");
        	u2.setDtCadastro((Date) new SimpleDateFormat("dd/MM/yyyy").parse(data));
    	} catch (Exception e) {
        	JOptionPane.showMessageDialog(null, "Data incorreta: " + e);
    	}
    	try {
        	String data = JOptionPane.showInputDialog("Data de Cadastro: ");
        	u2.setDataNascimento((Date) new SimpleDateFormat("dd/MM/yyyy").parse(data));
    	} catch (Exception e) {
        	JOptionPane.showMessageDialog(null, "Data incorreta: " + e);
    	}
    	u2.setEmail(JOptionPane.showInputDialog("Informe seu E-mail: "));
    	u2.setEndereco(JOptionPane.showInputDialog("Informe o endereço: "));
    	u2.setLogin(JOptionPane.showInputDialog("Entre com o login: "));
    	u2.setSenha(JOptionPane.showInputDialog("Digite sua senha: "));

	}
}


