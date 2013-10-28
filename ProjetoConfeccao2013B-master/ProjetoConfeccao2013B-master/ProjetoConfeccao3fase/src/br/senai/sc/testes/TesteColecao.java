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
        c.setCodColecao(0);
        c.setEstacaoColecao(JOptionPane.showInputDialog("Informe a estação dessa coleção"));
        c.setAnoColecao(Integer.parseInt(JOptionPane.showInputDialog("Informe o ano dessa coleção")));
        c.setPubAlvoColecao(JOptionPane.showInputDialog("Informe o público alvo dessa coleção"));
        c.setFunResponsavelColecao(JOptionPane.showInputDialog("Informe o funcionário responsável por essa coleção"));

        JOptionPane.showMessageDialog(null, c.toString());

        //Instância de Colecao 1
        Colecao c1 = new Colecao();
        c1.setCodColecao(1);
        c1.setEstacaoColecao(JOptionPane.showInputDialog("Informe a estação dessa coleção"));
        c1.setAnoColecao(Integer.parseInt(JOptionPane.showInputDialog("Informe o ano dessa coleção")));
        c1.setPubAlvoColecao(JOptionPane.showInputDialog("Informe o público alvo dessa coleção"));
        c1.setFunResponsavelColecao(JOptionPane.showInputDialog("Informe o funcionário responsável por essa coleção"));

        JOptionPane.showMessageDialog(null, c1.toString());
    }
}
