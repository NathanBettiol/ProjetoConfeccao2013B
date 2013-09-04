/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes;

import br.senai.sc.model.negocio.Ferias;
import javax.swing.JOptionPane;

/**
 *
 * @author larissa_mezari
 */
public class TesteFerias {
    public static void main(String[] args) {
        
    Ferias f1 = new Ferias();
    f1.setDataFim(JOptionPane.showInputDialog("Informe a data do fim: " + f1.getDataFim()));
    f1.setDataInicio(JOptionPane.showInputDialog("Informe a data de inicio: " + f1.getDataInicio()));
    f1.setFuncionario("Informe o nome do funcionario: " + f1.getFuncionario());
    
    
    
    Ferias f2 = new Ferias();
    f2.setDataFim(JOptionPane.showInputDialog("Informe a data do fim: " + f1.getDataFim()));
    f2.setDataInicio(JOptionPane.showInputDialog("Informe a data de inicio: " + f1.getDataInicio()));
    f2.setFuncionario("Informe o nome do funcionario: " + f1.getFuncionario());
  
  
            }
    
    
    
    
    
}
