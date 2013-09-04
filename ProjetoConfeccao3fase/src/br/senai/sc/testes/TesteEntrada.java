/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes;

import br.senai.sc.model.negocio.Entrada;

/**
 *
 * @author nathan_bettiol
 */
public class TesteEntrada {
    
    public static void main(String[] args) {
        
        Entrada e1 = new Entrada();
         Entrada e2 = new Entrada();
        
         e1.setCodigo(1);
         e1.setDtEmissao("2013-10-10");
         e1.setNrNotaFiscal(10);
         e1.setProduto("batata");
         e1.setQtProduto(10);
         
          e2.setCodigo(2);
         e2.setDtEmissao("2009-11-13");
         e2.setNrNotaFiscal(101249);
         e2.setProduto("ovo");
         e2.setQtProduto(99);
         
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        
         
    }
}
