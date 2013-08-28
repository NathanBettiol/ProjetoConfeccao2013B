
package br.senai.sc.testes;
import br.senai.sc.model.negocio.Vagas;
import javax.swing.JOptionPane;

/**
* PrincipalVagas
* @version v1.0  28/08/2013
* @author Bruna Zakrzeski
*/

public class PrincipalVagas {
    
    public static void main(String[] args) {
        
        
        
        
        //Primeira classe instanciada VAGAS
        Vagas vaga = new Vagas();
         
       
        vaga.codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite seu código:" ));
        vaga.nome = JOptionPane.showInputDialog("Digite seu nome: ");
        vaga.preRequisito = JOptionPane.showInputDialog("Digite aqui seus requisitos pessoais: ");
        vaga.funcao = JOptionPane.showInputDialog("Digite aqui sua função: ");
        vaga.faixaSalarial = Double.parseDouble(JOptionPane.showInputDialog("Digite aqui sua faixa salarial: "));
         
         
         vaga.setQtVaga(25);
         
       //System out imprimindo os valores do método toString
        System.out.println(vaga.toString());
                
    
    
   
        
       
       
    
    }
    
}
