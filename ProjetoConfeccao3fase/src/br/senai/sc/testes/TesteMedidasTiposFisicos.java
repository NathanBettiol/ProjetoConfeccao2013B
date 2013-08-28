/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes;

import br.senai.sc.model.negocio.Medidas;
import br.senai.sc.model.negocio.TiposFisicos;
import javax.swing.JOptionPane;

/**
 * @version 1.0 28/08/2013
 * @author gustavo_lourenco
 */
public class TesteMedidasTiposFisicos {

    public static void main(String[] args) {

        //Teste Classe Medidas
        Medidas t1 = new Medidas();
        t1.setCodigo(1);
        t1.setNomeUsuario(JOptionPane.showInputDialog("Informe seu nome: "));
        t1.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: ")));
        t1.setMdBusto(Double.parseDouble(JOptionPane.showInputDialog("Digite a medida do busto: ")));
        t1.setMdCintura(Double.parseDouble(JOptionPane.showInputDialog("Digite a medida da cintura: ")));
        t1.setMdOmbros(Double.parseDouble(JOptionPane.showInputDialog("Digite a medida dos ombros: ")));
        t1.setMdQuadril(Double.parseDouble(JOptionPane.showInputDialog("Digite a medida do quadril: ")));

        JOptionPane.showMessageDialog(null, t1.toString());

        //Teste Classe TiposFisicos
        TiposFisicos t2 = new TiposFisicos();
        t2.setCodigo(1);
        t2.setNome(JOptionPane.showInputDialog("Informe o nome: "));
        t2.setGenero(JOptionPane.showInputDialog("Informe o genero: "));
        t2.setDescicao(JOptionPane.showInputDialog("Descrição: "));

        JOptionPane.showMessageDialog(null, t2.toString());

    }
}
