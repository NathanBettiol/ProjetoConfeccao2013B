/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.CategoriaMateriaPrima;
import br.senai.sc.model.persistencia.CategoriaMateriaPrimaDaoJDBC;
import br.senai.sc.persistencia.dao.CategoriaMateriaPrimaDAO;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author leticia_jesus
 */
public class TesteConexaoCategoriaMateriaPrimaListar {
    
     public static void main(String[] args) {
       
     CategoriaMateriaPrimaDAO dao = new CategoriaMateriaPrimaDaoJDBC();
        List<CategoriaMateriaPrima> categoriasmateriaprima = dao.listall();
        for (CategoriaMateriaPrima categoriamateriaprima : categoriasmateriaprima) {
            System.out.println(categoriamateriaprima);
        }
    }
}


