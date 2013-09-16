/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.Entrada;

import br.senai.sc.model.persistencia.EntradaDaoJDBC;
import br.senai.sc.persistencia.dao.EntradaDAO;
import java.util.List;

/**
 *
 * @author nathan_bettiol
 */
public class TesteListaEntrada {
    
     public static void main(String[] args) {
       
         EntradaDAO dao = new EntradaDaoJDBC();
        List<Entrada> entradas = dao.listAll();
        for (Entrada entrada : entradas) {
            System.out.println(entradas);
        }
         
        EntradaDAO daoPes = new EntradaDaoJDBC();
        daoPes.listAll();
    }
}
