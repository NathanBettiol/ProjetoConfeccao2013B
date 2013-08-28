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
        String nome;
        String cargo;
        
        f1.setCod(Integer.parseInt(JOptionPane.showInputDialog("Informe o código do funcionário" + f1.getCod())));
        do{
            nome = JOptionPane.showInputDialog("Informe o nome do funcionário" + f1.getNome());
        }while(!Validadores.somenteLetras(nome));
        f1.setNome(nome);
        
        f1.setCpf(JOptionPane.showInputDialog("Informe o cpf do funcionário" + f1.getCpf()));
        f1.setRg(JOptionPane.showInputDialog("Informe o RG do funcionário" + f1.getRg()));
        f1.setDtNascimento(JOptionPane.showInputDialog("Informe a data de nascimento do funcionário" + f1.getDtNascimento()));   
        f1.setTelefone(JOptionPane.showInputDialog("Informe o telefone do funcionário" + f1.getTelefone()));
        f1.setEndereco(JOptionPane.showInputDialog("Informe o endereço do funcionário" + f1.getEndereco()));
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
        
        f2.setCod(Integer.parseInt(JOptionPane.showInputDialog("Informe o código do funcionário" + f2.getCod())));
         do{
            nome = JOptionPane.showInputDialog("Informe o nome do funcionário" + f2.getNome());
        }while(!Validadores.somenteLetras(nome));
        f2.setNome(nome);
        
        f2.setCpf(JOptionPane.showInputDialog("Informe o cpf do funcionário" + f2.getCpf()));
        f2.setRg(JOptionPane.showInputDialog("Informe o RG do funcionário" + f2.getRg()));
        f2.setDtNascimento(JOptionPane.showInputDialog("Informe a data de nascimento do funcionário" + f2.getDtNascimento()));
        f2.setTelefone(JOptionPane.showInputDialog("Informe o telefone do funcionário" + f2.getTelefone() ));
        f2.setEndereco(JOptionPane.showInputDialog("Informe o endereço do funcionário" + f2.getEndereco()));
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
