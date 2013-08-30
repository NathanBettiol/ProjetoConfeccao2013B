package br.senai.sc.testes;

import br.senai.sc.model.negocio.Funcionario;
import br.senai.sc.validador.Validadores;
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
        f1.setDtAdimissao(JOptionPane.showInputDialog("Informe a data de adimissão do funcionário" + f1.getDtAdimissao()));
        f1.setDtRecisao(JOptionPane.showInputDialog("Informe a data de recisão do funcionário" + f1.getDtRecisao()));

        
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
        f2.setDtAdimissao(JOptionPane.showInputDialog("Informe a data de adimissão do funcionário" + f2.getDtAdimissao()));
        f2.setDtRecisao(JOptionPane.showInputDialog("Informe a data de recisão do funcionário" + f2.getDtRecisao()));

    }
}
