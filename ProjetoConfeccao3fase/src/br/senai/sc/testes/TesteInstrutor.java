
package br.senai.sc.testes;


import br.senai.sc.model.negocio.Instrutor;
import javax.swing.JOptionPane;

public class TesteInstrutor {
    
    /**
* PrincipalInstrutor
* @version v1.0  28/08/2013
* @author Bruna Zakrzeski
*/
    
    public static void main(String[] args) {
        
        
        //Terceira classe instanciada INSTRUTOR
        Instrutor inst = new Instrutor();
        
        
        inst.codTreinamento = Integer.parseInt(JOptionPane.showInputDialog("Digite o código: "));
        inst.nmfuncionario = JOptionPane.showInputDialog("Digite o nome: ");
        inst.treinamento = JOptionPane.showInputDialog("Digite o nome do treinamento: ");
        
        //Imprimi os valores no método toString das VARIAVEIS da classe INSTRUTOR
        System.out.println(inst.toString());
        
        
    }
    
}

    

