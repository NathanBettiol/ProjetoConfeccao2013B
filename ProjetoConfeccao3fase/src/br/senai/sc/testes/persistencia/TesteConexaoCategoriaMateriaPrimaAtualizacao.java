/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.CategoriaMateriaPrima;
import br.senai.sc.model.persistencia.CategoriaMateriaPrimaDaoJDBC;
import br.senai.sc.persistencia.dao.CategoriaMateriaPrimaDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author leticia_jesus
 */
public class TesteConexaoCategoriaMateriaPrimaAtualizacao {
     public static void main(String[] args) {
        CategoriaMateriaPrima cmp = new CategoriaMateriaPrima();

        cmp.setNome(JOptionPane.showInputDialog("Informe o nome "
                + "da categoria da matéria-prima: "));
        cmp.setDescricao(JOptionPane.showInputDialog("Descreva a categoria da matéria-prima : "));
        cmp.setCod(Integer.parseInt(JOptionPane.showInputDialog("Informe o "
                + "codigo da categoria da materia-prima a ser alterada")));

        CategoriaMateriaPrimaDAO dao = new CategoriaMateriaPrimaDaoJDBC();
        dao.update(cmp);
    }
}
    

