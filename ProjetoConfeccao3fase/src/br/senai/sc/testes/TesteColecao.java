/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes;

import br.senai.sc.model.negocio.CategoriaColecao;
import br.senai.sc.model.negocio.Colecao;
import javax.swing.JOptionPane;

/**
 * Classe TesteColecao * Instância de dois objetos da classe Colecao para testar
 * seu funcionamento
 *
 * @version v1.0 30/08/2013
 * @author Gabriel Arsênio
 */
public class TesteColecao {

    public static void main(String[] args) {
        //Instância de Colecao 0
        Colecao c = new Colecao();
        c.setCod(0);
        c.setEstacao(JOptionPane.showInputDialog("Informe a estação dessa coleção"));
        c.setAno(Integer.parseInt(JOptionPane.showInputDialog("Informe o ano dessa coleção")));
        c.setPubAlvo(JOptionPane.showInputDialog("Informe o público alvo dessa coleção"));
        c.setFunResponsavel(JOptionPane.showInputDialog("Informe o funcionário responsável por essa coleção"));

        JOptionPane.showMessageDialog(null, c.toString());

        //Instância de Colecao 1
        Colecao c1 = new Colecao();
        c1.setCod(1);
        c1.setEstacao(JOptionPane.showInputDialog("Informe a estação dessa coleção"));
        c1.setAno(Integer.parseInt(JOptionPane.showInputDialog("Informe o ano dessa coleção")));
        c1.setPubAlvo(JOptionPane.showInputDialog("Informe o público alvo dessa coleção"));
        c1.setFunResponsavel(JOptionPane.showInputDialog("Informe o funcionário responsável por essa coleção"));

        JOptionPane.showMessageDialog(null, c1.toString());
    }
}
