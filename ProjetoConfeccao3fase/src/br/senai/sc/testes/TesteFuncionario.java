package br.senai.sc.testes;

import br.senai.sc.model.negocio.Funcionario;
import br.senai.sc.validador.Validadores;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *@version 1.0 28/06/2013
 * @author patricia_gageiro
 */
public class TesteFuncionario {
    public static void main(String[] args) {
        
    //Instanciando o primeiro funcionário
     Funcionario f1 = new Funcionario();
        String cargo;                     
        
        f1.setLogin(JOptionPane.showInputDialog("Informe o login do funcionário" + f1.getLogin()));
        f1.setEmail(JOptionPane.showInputDialog("Informe o e-mail do funcionário" + f1.getEmail()));
        
         do{
            cargo = JOptionPane.showInputDialog("Informe o cargo do funcionário" + f1.getCargo());
        }while(!Validadores.somenteLetras(cargo));
         f1.setCargo(cargo);
          
        f1.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do funcionário" + f1.getSalario())));
        f1.setCtps(JOptionPane.showInputDialog("Informe o Ctps do funcionário" + f1.getCtps()));                               
       try {
            String data = JOptionPane.showInputDialog("Data Adimissão");

            f1.setDtAdimissao(new SimpleDateFormat("dd/mm/yyyy").parse(data));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Data incorreta" + ex);
        }
        try {
            String data = JOptionPane.showInputDialog("Data Recisão");

            f1.setDtAdimissao(new SimpleDateFormat("dd/mm/yyyy").parse(data));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Data incorreta" + ex);
        }
        
        

        
        //Instanciando o segundo Funcionário
        Funcionario f2 = new Funcionario();
        
        f2.setLogin(JOptionPane.showInputDialog("Informe o login do funcionário" + f2.getLogin()));
        f2.setEmail(JOptionPane.showInputDialog("Informe o e-mail do funcionário" + f2.getEmail()));
        
         do{
            cargo = JOptionPane.showInputDialog("Informe o cargo do funcionário" + f2.getCargo());
        }while(!Validadores.somenteLetras(cargo));
         f2.setCargo(cargo);
          
        f2.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do funcionário" + f2.getSalario())));
        f2.setCtps(JOptionPane.showInputDialog("Informe o Ctps do funcionário" + f2.getCtps()));                               
      try {
            String data = JOptionPane.showInputDialog("Data Adimissão");

            f2.setDtAdimissao(new SimpleDateFormat("dd/mm/yyyy").parse(data));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Data incorreta" + ex);
        }
       try {
            String data = JOptionPane.showInputDialog("Data Recisão");

            f2.setDtAdimissao(new SimpleDateFormat("dd/mm/yyyy").parse(data));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Data incorreta" + ex);
        }
    }
}
