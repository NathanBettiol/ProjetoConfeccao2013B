
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.CategoriaMateriaPrima;
import br.senai.sc.model.negocio.MateriaPrima;
import br.senai.sc.model.persistencia.CategoriaMateriaPrimaDaoJDBC;
import br.senai.sc.model.persistencia.MateriaPrimaDaoJDBC;
import br.senai.sc.persistencia.dao.CategoriaMateriaPrimaDAO;
import br.senai.sc.persistencia.dao.MateriaPrimaDAO;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author leticia_jesus
 * @version 1.0 20/09/2013
 * 
 * Classe responsavel pelo teste de listagem de matéria-prima na base de dados.
 */
public class TesteConexaoMateriaPrimaListar {
    
     public static void main(String[] args) {
       
     MateriaPrimaDAO dao = new MateriaPrimaDaoJDBC();
        List<MateriaPrima> materiasprima = dao.listAll();
        for (MateriaPrima materiaprima : materiasprima) {
            System.out.println(materiaprima);
        }
    }
}


