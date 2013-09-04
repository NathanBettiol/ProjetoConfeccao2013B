/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes;

import br.senai.sc.model.negocio.CategoriaColecao;
import javax.swing.JOptionPane;

/**
 * Classe TesteCategoraColecao * Instancia dois objetos da classe
 * CategoriaColecao para testar seu funcionamento
 *
 * @version v1.0 30/08/2013
 * @author Gabriel Arsênio
 */
public class TesteCategoriaColecao {

    public static void main(String[] args) {

        //Instância de CategoriaColecao 0
        CategoriaColecao cc = new CategoriaColecao();
        cc.setCod(0);
        cc.setNome(JOptionPane.showInputDialog("Informe o nome da categoria de coleção"));
        cc.setDescricao(JOptionPane.showInputDialog("Dê uma descrição dessa categoria"));

        JOptionPane.showMessageDialog(null, cc.toString());

        //Instância de CategoriaColecao 1
        CategoriaColecao cc1 = new CategoriaColecao();
        cc1.setCod(1);
        cc1.setNome(JOptionPane.showInputDialog("Informe o nome da categoria de coleção"));
        cc1.setDescricao(JOptionPane.showInputDialog("Dê uma descrição dessa categoria"));

        JOptionPane.showMessageDialog(null, cc1.toString());
    }
}