
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.persistencia.DevolucaoDaoJDBC;
import br.senai.sc.persistencia.dao.DevolucaoDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author douglas_ghisleri
 */
public class TesteRemocaoDevolucao {
  public static void main(String[] args) {
     	  	 
    	int codDelete = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID a ser deletado: "));
        
        DevolucaoDAO dao = new DevolucaoDaoJDBC();
        
        dao.delete(codDelete);
        
	}  
}
