package br.senai.sc.testes;

import br.senai.sc.model.negocio.ProdutosPedidoVenda;
import javax.swing.JOptionPane;

/**
 *
 * @author Patricia Gageiro
 * @version 1.0 25/09/2013
 */
public class TesteProdutosPedidoVenda {
    public static void main(String[] args) {
        
        //Instanciando primeiro produto pedido venda
        ProdutosPedidoVenda ppv = new ProdutosPedidoVenda();
        ppv.setNome(JOptionPane.showInputDialog("Informe seu nome"));
        ppv.setQtProduto(JOptionPane.showInputDialog("Informe a quantidade de produto"));
        
        //Instanciando o segundo produto pedido venda
        ProdutosPedidoVenda ppv2 = new ProdutosPedidoVenda();
        ppv2.setNome(JOptionPane.showInputDialog("Informe seu nome"));
        ppv2.setQtProduto(JOptionPane.showInputDialog("Informe a quantidade de produto"));
    }
}
