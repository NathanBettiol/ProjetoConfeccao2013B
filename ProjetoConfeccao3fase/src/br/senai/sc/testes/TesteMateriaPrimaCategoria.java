/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes;

import br.senai.sc.model.negocio.CategoriaMateriaPrima;
import javax.swing.JOptionPane;

/**
 *
 * @author leticia_jesus
 */
public class TesteMateriaPrimaCategoria {

    public static void main(String[] args) {



        CategoriaMateriaPrima cmp1 = new CategoriaMateriaPrima();
        cmp1.setCod(1);
        cmp1.setMateriaPrima(JOptionPane.showInputDialog("Digite o nome da matéria-prima;"));
        cmp1.setNome(JOptionPane.showInputDialog("Informe o nome da categoria: "));
        cmp1.setDescricao(JOptionPane.showInputDialog("Descreva a categoria da matéria-prima:"));

        CategoriaMateriaPrima cmp2 = new CategoriaMateriaPrima();
        cmp2.setCod(2);
        cmp2.setMateriaPrima(JOptionPane.showInputDialog("Digite o nome da matéria-prima:"));
        cmp2.setNome(JOptionPane.showInputDialog("Informe o nome da categoria:"));
        cmp2.setDescricao(JOptionPane.showInputDialog("Descreva a categoria da matéria-prima:"));

        JOptionPane.showMessageDialog(null, cmp1.toString());
        JOptionPane.showMessageDialog(null, cmp2.toString());
    }
}
