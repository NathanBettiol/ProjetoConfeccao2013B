
package br.senai.sc.testes;
import br.senai.sc.model.negocio.Treinamento;
import javax.swing.JOptionPane;
/**
* TesteTreinamento
* @version v1.0  28/08/2013
* @author Bruna Zakrzeski
*/

public class TesteTreinamento {
    
    public static void main(String[] args) {
        
          
        //Segunda classe instanciado TREINAMENTO
       Treinamento treina = new Treinamento ();
       
       
       treina.nome = JOptionPane.showInputDialog("Digite nome do treinamento: ");
       
       //Envoquei o SET
       treina.setCargaHoraria(150);
       treina.conteudo = "Estilo Comportamental e Como Agir Diante a Um Problema";
       
       //Imprimi os valores de VARIAVEIS e de GETS da classe TREINAMENTO
        System.out.println("Nome: " + treina.nome + "\nCarga Horária: " + treina.getCargaHoraria()
                + "\nConteúdo: " + treina.getConteudo() + 
                "\n------------------------------------------------------------------");
    }
    
}
