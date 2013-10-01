
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.CategoriaMateriaPrima;
import br.senai.sc.model.persistencia.CategoriaMateriaPrimaDaoJDBC;
import br.senai.sc.persistencia.dao.CategoriaMateriaPrimaDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author leticia_jesus
 * @version 1.0 20/09/2013
 * Classe responsável pelo teste de atualização de uma categoria de materia-prima na base de dados.
 */
public class TesteConexaoCategoriaMateriaPrimaAtualizacao {
     public static void main(String[] args) {
        CategoriaMateriaPrima cmp = new CategoriaMateriaPrima();
        cmp.setCod(Integer.parseInt(JOptionPane.showInputDialog("Informe o "
                + "codigo da categoria da materia-prima a ser alterada")));
        cmp.setNome(JOptionPane.showInputDialog("Informe o nome "
                + "da categoria da matéria-prima: "));
        cmp.setDescricao(JOptionPane.showInputDialog("Descreva a categoria da matéria-prima : "));
        

        CategoriaMateriaPrimaDAO dao = new CategoriaMateriaPrimaDaoJDBC();
        dao.update(cmp);
    }
}

    

