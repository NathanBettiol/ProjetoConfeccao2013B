package br.senai.sc.testes;

import br.senai.sc.model.negocio.CategoriaProduto;
import br.senai.sc.persistencia.dao.CategoriaProdutoDAO;
import br.senai.sc.model.persistencia.CategoriaProdutoDaoJDBC;
import br.senai.sc.persistencia.dao.ProdutoDAO;
import javax.swing.JOptionPane;

public class TesteCategoriaProduto {

    public static void main(String[] args) {

        CategoriaProduto CT1 = new CategoriaProduto();
        CT1.setNomeCategoriaProduto(JOptionPane.showInputDialog("Informe o nome da categoria "));
        CT1.setDescricaoCategoriaProduto(JOptionPane.showInputDialog("Informe a decrição da categoria "));

        CategoriaProdutoDAO dao01 = new CategoriaProdutoDaoJDBC();
        dao01.insert(CT1);

        CT1.setNomeCategoriaProduto(JOptionPane.showInputDialog("Informe o nome da categoria" + CT1.getCodCategoriaProduto(), CT1.getNomeCategoriaProduto()));
        CT1.setDescricaoCategoriaProduto(JOptionPane.showInputDialog("Informe a decrição da categoria" + CT1.getCodCategoriaProduto(), CT1.getDescricaoCategoriaProduto()));

        CategoriaProdutoDAO dao02 = new CategoriaProdutoDaoJDBC();
        dao02.update(CT1);

        CategoriaProdutoDAO dao04 = new CategoriaProdutoDaoJDBC();
        System.out.println(dao04.listAll());

        CategoriaProdutoDAO dao05 = new CategoriaProdutoDaoJDBC();
        System.out.println(dao05.listById(Integer.parseInt(JOptionPane.showInputDialog("Informe o ID da categoria a ser listado!"))));

        CategoriaProdutoDAO dao03 = new CategoriaProdutoDaoJDBC();
        dao03.delete(Integer.parseInt(JOptionPane.showInputDialog("Informe o ID da categoria a ser excluida!")));
    }
}