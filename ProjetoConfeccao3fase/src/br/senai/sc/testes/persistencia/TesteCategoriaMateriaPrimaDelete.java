/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.persistencia.CategoriaMateriaPrimaDaoJDBC;
import br.senai.sc.persistencia.dao.CategoriaMateriaPrimaDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author leticia_jesus
 */
public class TesteCategoriaMateriaPrimaDelete {
    
    public static void main(String[] args) {
        
        int cod = Integer.parseInt(JOptionPane.showInputDialog("Informe o código da matéria prima ser deletada: "));
        
        
        CategoriaMateriaPrimaDAO dao = new CategoriaMateriaPrimaDaoJDBC();
        dao.delete(cod);
        
    }
}
    

