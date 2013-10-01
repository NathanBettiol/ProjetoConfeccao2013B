package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.CategoriaMateriaPrima;
import br.senai.sc.model.negocio.MateriaPrima;
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
 * Classe responsável pelo teste de atualização de uma materia-prima na base de dados.
 */
public class TesteConexaoMateriaPrimaAtualizacao {

    public static void main(String[] args) {
        MateriaPrima mp = new MateriaPrima();

        mp.setNome(JOptionPane.showInputDialog("Informe o nome "
                + "da categoria da matéria-prima: "));
        mp.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Informe o preço da matéria prima:")));
        mp.setTpUnidade(JOptionPane.showInputDialog("Informe o tipo das unidades de materia-prima:"));
        mp.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de materia-prima:")));
//        mp.setFornecedor(JOptionPane.showInputDialog("Informe o fornecedor da matéria-prima:"));
        mp.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Informe o "
                + "codigo da categoria da materia-prima a ser alterada")));

        MateriaPrimaDAO dao = new MateriaPrimaDaoJDBC();
        dao.update(mp);
    }
}
