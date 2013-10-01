package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.CategoriaColecao;
import br.senai.sc.model.negocio.CategoriaProduto;
import br.senai.sc.model.negocio.Colecao;
import br.senai.sc.model.negocio.Fabricante;
import br.senai.sc.model.negocio.Funcionario;
import br.senai.sc.model.negocio.Produto;
import br.senai.sc.model.persistencia.ProdutosDaoJDBC;
import br.senai.sc.persistencia.dao.ProdutoDAO;
import javax.swing.JOptionPane;

public class TesteProduto {

    public static void main(String[] args) {
//        CategoriaProduto cp = new CategoriaProduto();
//        cp.setCodCategoriaProduto(1);
//        cp.setNomeCategoriaProduto("Teste");
//        cp.setDescricaoCategoriaProduto("Testando");
//
//        CategoriaColecao cc = new CategoriaColecao();
//        cc.setCodCategoriaColecao(1);
//        cc.setNomeCategoriaColecao("Teste");
//        cc.setDescricaoCategoriaColecao("Testando");
//
//        Funcionario fn = new Funcionario();
//        fn.setCod(1);
//        fn.setNome("Gustavo");
//
//        Fabricante f = new Fabricante();
//        f.setCod(1);
//        f.setCnpj("00.000.000/0000-00");
//        f.setTelefone("(48)3045 3045");
//        f.setEmail("teste@teste.com.br");
//        f.setEndereco("Av. Centenário 505- Criciúma/SC");
//
//        Colecao c = new Colecao();
//        c.setCodColecao(1);
//        c.setCategoriaColecao(cc);
//        c.setAnoColecao(2013);
//        c.setEstacaoColecao("Verão");
//        c.setFunResponsavelColecao(fn);
//        c.setPubAlvoColecao("Adolescentes");
//
//        Produto p1 = new Produto();
//
//        p1.setCategoria(cp);
//        p1.setColecao(c);
//        p1.setFabricante(f);
//        p1.setModelo(JOptionPane.showInputDialog("Informe o modelo do produto:"));
//        p1.setNome(JOptionPane.showInputDialog("Informe o nome do produto:"));
//        p1.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do produto:")));
//        p1.setTamanho(JOptionPane.showInputDialog("Informe o tamanho do produto:"));
//        p1.setCor(JOptionPane.showInputDialog("Informe a cor do produto:"));
//        p1.setQtProdutos(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do produto:")));
//
//        ProdutoDAO dao01 = new ProdutosDaoJDBC();
//        dao01.insert(p1);
//        System.out.println(p1.toString());
//
//        Produto p2 = new Produto();
//        p2.setCategoria(cp);
//        p2.setColecao(c);
//        p2.setFabricante(f);
//        p2.setCodProduto(Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo do produto a ser alterado:")));
//        p2.setModelo(JOptionPane.showInputDialog("Informe o modelo do produto:"));
//        p2.setNome(JOptionPane.showInputDialog("Informe o nome do produto:"));
//        p2.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do produto:")));
//        p2.setTamanho(JOptionPane.showInputDialog("Informe o tamanho do produto:"));
//        p2.setCor(JOptionPane.showInputDialog("Informe a cor do produto:"));
//        p2.setQtProdutos(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do produto:")));
//
//        ProdutoDAO dao02 = new ProdutosDaoJDBC();
//        dao02.update(p2);
//        System.out.println(p2.toString());
//
//        ProdutoDAO dao03 = new ProdutosDaoJDBC();
//        dao03.delete(Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo do produto a ser excluido:")));

//        ProdutoDAO dao04 = new ProdutosDaoJDBC();
//        System.out.println(dao04.listAll());
//Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo do produto a ser listado:")
        ProdutoDAO dao05 = new ProdutosDaoJDBC();
        System.out.println(dao05.listById(2));

    }
}