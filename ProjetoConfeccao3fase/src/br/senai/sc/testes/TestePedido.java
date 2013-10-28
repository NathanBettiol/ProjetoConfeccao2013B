/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes;

import br.senai.sc.model.negocio.Pedido;
import javax.swing.JOptionPane;


public class TestePedido {
     public static void main(String[] args) {

        //Instanciando
        Pedido p1 = new Pedido();

        p1.codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto: "));
        p1.formaPagamento = JOptionPane.showInputDialog(null, "Forma de pagamento: ");
        p1.dataPrevistaEntrega = Integer.parseInt(JOptionPane.showInputDialog("Digite a data de entrega:"));
        p1.dataPedido = Integer.parseInt(JOptionPane.showInputDialog("Data do Pedido: "));
        p1.preco = Integer.parseInt(JOptionPane.showInputDialog("Digite o preço do produto: "));
        p1.qtProduto = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto: "));
        p1.status = JOptionPane.showInputDialog(null, "Status: ");
        p1.fornecedor = JOptionPane.showInputDialog(null, "Fornecedor: ");
        p1.produto = JOptionPane.showInputDialog(null, "Nome do produto: ");

        //Imprime na tela
        System.out.println(p1.toString());
                
        
        
    }
}


