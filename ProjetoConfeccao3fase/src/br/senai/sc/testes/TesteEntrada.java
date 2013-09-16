/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes;

import br.senai.sc.model.negocio.Entrada;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author nathan_bettiol
 */
public class TesteEntrada {
    
    public static void main(String[] args) {
        
        Entrada e1 = new Entrada();
         Entrada e2 = new Entrada();
        
         /*
         try{
           String data = JOptionPane.showInputDialog("Data admissão");
        e1.setDtEmissao(new SimpleDateFormat("dd/MM/yyyy").parse(data));
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Data incorreta" + e);
       };
         e1.setNrNotaFiscal(10);
         e1.setProduto("batata");
         e1.setQtProduto(10);
         
          e2.setCodigo(2);
           try{
           String data = JOptionPane.showInputDialog("Data admissão");
        e2.setDtEmissao(new SimpleDateFormat("dd/MM/yyyy").parse(data));
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Data incorreta" + e);
       };
         e2.setNrNotaFiscal(101249);
         e2.setProduto("ovo");
         e2.setQtProduto(99);
         
        System.out.println(e1.toString());
        System.out.println(e2.toString());*/
        
        e1.insert(Entrada e);
         
    }
}
