
package br.senai.sc.testes;
import br.senai.sc.model.negocio.Treinamento;
import javax.swing.JOptionPane;
/**
* PrincipalTreinamento
* @version v1.0  28/08/2013
* @author Bruna Zakrzeski
*/

public class PrincipalTreinamento {
    
    public static void main(String[] args) {
        
          
        //Segunda classe instanciado TREINAMENTO
       Treinamento treina = new Treinamento ();
       
       
       treina.nome = JOptionPane.showInputDialog("Digite nome do treinamento: ");
       
       
       //Envoquei o SET
       treina.setCargaHoraria(150);
       treina.conteudo = "Estilo Comportamental e Como Agir Diante a Um Problema";
       
       //Imprimi os valores com op método toString de VARIAVEIS e de GETS da classe TREINAMENTO
        System.out.println(treina.toString());
    
}
}