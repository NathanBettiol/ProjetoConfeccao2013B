
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.persistencia.CategoriaMateriaPrimaDaoJDBC;
import br.senai.sc.model.persistencia.MateriaPrimaDaoJDBC;
import br.senai.sc.persistencia.dao.CategoriaMateriaPrimaDAO;
import br.senai.sc.persistencia.dao.MateriaPrimaDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author leticia_jesus
 * @version 1.0 20/09/2013
 * 
 *  Classe responsável por deletar uma materia-prima na base de dados.
 */
public class TesteConexaoMateriaPrimaDelete {
    
    public static void main(String[] args) {
        
        int cod = Integer.parseInt(JOptionPane.showInputDialog("Informe o código da matéria prima ser deletada: "));
        
        
      MateriaPrimaDAO dao = new MateriaPrimaDaoJDBC();
        dao.delete(cod);
        
    }
}
    

