
package br.senai.sc.testes;
import br.senai.sc.model.negocio.Instrutor;
import javax.swing.JOptionPane;

/**
* PrincipalInstrutor
* @version v1.0  28/08/2013
* @author Bruna Zakrzeski
*/

public class PrincipalInstrutor {
    
    public static void main(String[] args) {
        
        
        //Terceira classe instanciada INSTRUTOR
        Instrutor inst = new Instrutor();
        
        
        inst.codTreinamento = Integer.parseInt(JOptionPane.showInputDialog("Digite o código: "));
        inst.nmfuncionario = JOptionPane.showInputDialog("Digite o nome: ");
        inst.treinamento = JOptionPane.showInputDialog("Digite o treinamento: ");
        
        
        //Imprimi os valores das VARIAVEIS da classe INSTRUTOR
        System.out.println("Número do Código: " + inst.codTreinamento + "\nNome do Funcionário: " + inst.nmfuncionario +
                "\nTipo de Treinamento: " + inst.treinamento);
        
        
    }
    
}
