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
 * @version 1.0 20/09/2012
 * 
 *  Classe responsável pelo teste de inserção  de uma  categoria de materia-prima na base de dados.
 */
public class TesteConexaoCategoriaMateriaPrimaInsercao {
     public static void main(String[] args) {
        CategoriaMateriaPrima cmp = new CategoriaMateriaPrima();
        cmp.setNome(JOptionPane.showInputDialog("Informe o nome da categoria da matéria-prima"));
        cmp.setDescricao(JOptionPane.showInputDialog("Descreva a categoria da matéria-prima"));
        CategoriaMateriaPrimaDAO dao = new CategoriaMateriaPrimaDaoJDBC();
        dao.insert(cmp);
    }
}
    
    

