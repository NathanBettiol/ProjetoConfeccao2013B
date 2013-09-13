package br.senai.sc.testes;

import br.senai.sc.model.negocio.Produto;
import br.senai.sc.model.persistencia.ProdutosDaoJDBC;
import br.senai.sc.persistencia.dao.ProdutoDAO;
import javax.swing.JOptionPane;

public class TesteProduto {

    public static void main(String[] args) {
//        Produto p1 = new Produto();
//        p1.setCodProduto(1);
//        p1.setModelo(JOptionPane.showInputDialog("Informe o modelo do produto " + p1.getCodProduto()));
//        p1.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do produto " + p1.getCodProduto())));
//        p1.setTamanho(JOptionPane.showInputDialog("Informe o tamanho do produto " + p1.getCodProduto()));
//        p1.setCor(JOptionPane.showInputDialog("Informe a cor do produto " + p1.getCodProduto()));
//        p1.setQtProdutos(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do produto " + p1.getCodProduto())));
//        
//        ProdutoDAO dao01 = new ProdutosDaoJDBC();
//        dao01.insert(p1);
//        System.out.println(p1.toString());
//        
//
//        Produto p2 = new Produto();
//        p2.setCodProduto(2);
//        p2.setModelo(JOptionPane.showInputDialog("Informe o modelo do produto " + p2.getCodProduto()));
//        p2.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do produto " + p2.getCodProduto())));
//        p2.setTamanho(JOptionPane.showInputDialog("Informe o tamanho do produto " + p2.getCodProduto()));
//        p2.setCor(JOptionPane.showInputDialog("Informe a cor do produto " + p2.getCodProduto()));
//        p2.setQtProdutos(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do produto " + p2.getCodProduto())));
//
//        ProdutoDAO dao02 = new ProdutosDaoJDBC();
//        dao02.insert(p2);
//        System.out.println(p2.toString());
//        
        ProdutoDAO dao03 = new ProdutosDaoJDBC();
        dao03.delete(1);
    }
}