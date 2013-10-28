/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes;


import br.senai.sc.model.negocio.Endereco;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo_cm
 */
public class TesteCadastroEndereco {
    
     public static void main(String[] args) {
       Endereco e1 = new Endereco();
        e1.setCodigo(1);
        e1.setRua(JOptionPane.showInputDialog("Digite o nome da rua: "));
        e1.setBairro(JOptionPane.showInputDialog("Digite seu bairro: "));
        e1.setCidade(JOptionPane.showInputDialog("Digite sua cidade: "));
        e1.setCep (Integer.parseInt(JOptionPane.showInputDialog("Digite o seu Cep: ")));
        e1.setComplemento(JOptionPane.showInputDialog("Complemento: "));
        e1.setNumero(Double.parseDouble(JOptionPane.showInputDialog("Digite o numero: ")));
        
        JOptionPane.showMessageDialog(null, "Enredeço"
                + "\nNome da rua:" + e1.getRua()
                + "\nBairro: " + e1.getBairro()
                + "\nCidade: " + e1.getCidade()
                + "\nCep: " + e1.getCep()
                + "\nComplemento: " + e1.getComplemento()
                + "\nNumero: " + e1.getNumero());
        
        Endereco e2 = new Endereco();
        e2.setCodigo(1);
        e2.setRua(JOptionPane.showInputDialog("Digite o nome da rua: "));
        e2.setBairro(JOptionPane.showInputDialog("Digite seu bairro: "));
        e2.setCidade(JOptionPane.showInputDialog("Digite sua cidade: "));
        e2.setCep (Integer.parseInt(JOptionPane.showInputDialog("Digite o seu Cep: ")));
        e2.setComplemento(JOptionPane.showInputDialog("Complemento: "));
        e2.setNumero(Double.parseDouble(JOptionPane.showInputDialog("Digite o numero: ")));
        
        JOptionPane.showMessageDialog(null, "Enredeço"
                + "\nNome da rua:" + e2.getRua()
                + "\nBairro: " + e2.getBairro()
                + "\nCidade: " + e2.getCidade()
                + "\nCep: " + e2.getCep()
                + "\nComplemento: " + e2.getComplemento()
                + "\nNumero: " + e2.getNumero());
    }
}



