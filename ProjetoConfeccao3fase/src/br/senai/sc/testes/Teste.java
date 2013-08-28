/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes;

import br.senai.sc.model.negocio.CategoriaProduto;
import br.senai.sc.model.negocio.Colecao;
import javax.swing.JOptionPane;

/**
 *
 * @author rosicleia.souza
 */
public class Teste {

    public static void main(String[] args) {

        //Teste da classe CategoriaProduto
        CategoriaProduto cc1 = new CategoriaProduto();
        cc1.setCod(1);
        cc1.setNome(JOptionPane.showInputDialog("Informe o nome da categoria " + cc1.getCod()));
        cc1.setDescricao(JOptionPane.showInputDialog("Dê uma descrição dessa categoria"));

        CategoriaProduto cc2 = new CategoriaProduto();
        cc2.setCod(2);
        cc2.setNome(JOptionPane.showInputDialog("Informe o nome da categoria " + cc2.getCod()));
        cc2.setDescricao(JOptionPane.showInputDialog("Dê uma descrição dessa categoria"));

        JOptionPane.showMessageDialog(null, cc1.toString());
        JOptionPane.showMessageDialog(null, cc2.toString());
        //Fim teste CategoriaProduto

        //Teste da classe Colecao
        Colecao c1 = new Colecao();
        c1.setCod(1);
        c1.setEstacao(JOptionPane.showInputDialog("Informe a estação da coleção " + c1.getCod()));
        c1.setAno(Integer.parseInt(JOptionPane.showInputDialog("Informe o ano da coleção " + c1.getCod())));
        c1.setPubAlvo(JOptionPane.showInputDialog("Informe o público alvo da coleção " + c1.getCod()));
        c1.setFunResponsavel(JOptionPane.showInputDialog("Informe o funcionário responsável pela coleção " + c1.getCod()));

        Colecao c2 = new Colecao();
        c2.setCod(2);
        c2.setEstacao(JOptionPane.showInputDialog("Informe a estação da coleção " + c2.getCod()));
        c2.setAno(Integer.parseInt(JOptionPane.showInputDialog("Informe o ano da coleção " + c2.getCod())));
        c2.setPubAlvo(JOptionPane.showInputDialog("Informe o público alvo da coleção " + c2.getCod()));
        c2.setFunResponsavel(JOptionPane.showInputDialog("Informe o funcionário responsável pela coleção " + c2.getCod()));

        JOptionPane.showMessageDialog(null, c1.toString());
        JOptionPane.showMessageDialog(null, c1.toString());
        //Fim teste Colecao
        

    }
}
