/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes;

import br.senai.sc.model.negocio.Usuario;
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
    u1.setCodUsuario(Integer.parseInt(JOptionPane.showInputDialog("Informe o cógigo do usuario: ")));
    u1.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
    u1.setCpf(JOptionPane.showInputDialog("Informe o cpf: "));
    u1.setDataCadastro(JOptionPane.showInputDialog("Informe a data de cadastro: "));
    u1.setDataNascimento(JOptionPane.showInputDialog("Informe a data de nascimento: "));
    u1.setEmail(JOptionPane.showInputDialog("Informe seu E-mail: "));
    u1.setEndereco(JOptionPane.showInputDialog("Informe o endereço: "));
    u1.setLogin(JOptionPane.showInputDialog("Entre com o login: "));
    u1.setSenha(JOptionPane.showInputDialog("Digite sua senha: "));
    
    
        //Instancia do usuario 2
     Usuario u2 = new Usuario();
    u2.setCod(Integer.parseInt(JOptionPane.showInputDialog("Informe o código: " + u1.getCod())));
    u2.setCodUsuario(Integer.parseInt(JOptionPane.showInputDialog("Informe o cógigo do usuario: ")));
    u2.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
    u2.setCpf(JOptionPane.showInputDialog("Informe o cpf: "));
    u2.setDataCadastro(JOptionPane.showInputDialog("Informe a data de cadastro: "));
    u2.setDataNascimento(JOptionPane.showInputDialog("Informe a data de nascimento: "));
    u2.setEmail(JOptionPane.showInputDialog("Informe seu E-mail: "));
    u2.setEndereco(JOptionPane.showInputDialog("Informe o endereço: "));
    u2.setLogin(JOptionPane.showInputDialog("Entre com o login: "));
    u2.setSenha(JOptionPane.showInputDialog("Digite sua senha: "));
    
    }
    
}
