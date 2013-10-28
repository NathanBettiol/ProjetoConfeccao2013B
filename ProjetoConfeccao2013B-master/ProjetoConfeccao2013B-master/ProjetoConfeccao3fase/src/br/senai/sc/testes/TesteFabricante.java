/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes;

import br.senai.sc.model.negocio.Fabricante;

/**
 *Teste da classe Fabricante
 * @author mateus_aguiar
 * 
 */

public class TesteFabricante {
    public static void main(String[] args) {
     
    
    // 2 testes de instancias da classe Fabricante
    Fabricante f1 = new Fabricante();
    f1.setCod(1);
    f1.setCnpj(null);
    f1.setDataCadastro(null);
    f1.setEmail(null);
    f1.setEndereco(null);
    f1.setNmFantasia(null);
    f1.setRazaoSocial(null);
    f1.setTelefone(null);
        System.out.println(f1.toString());
    
    Fabricante f2 = new Fabricante();
    f2.setCod(2);
    f2.setCnpj(null);
    f2.setDataCadastro(null);
    f2.setEmail(null);
    f2.setEndereco(null);
    f2.setNmFantasia(null);
    f2.setRazaoSocial(null);
    f2.setTelefone(null);
    System.out.println(f2.toString());
    
    
    
    }
  
}
