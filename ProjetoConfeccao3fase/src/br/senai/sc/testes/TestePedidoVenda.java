package br.senai.sc.testes;

import br.senai.sc.model.negocio.PedidoVenda;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Patricia Gageiro
 * @version 1.0 25/09/2013
 */
public class TestePedidoVenda {
    public static void main(String[] args) {
        
        //Instanciando o primeiro pedido venda
        PedidoVenda pv = new PedidoVenda();
        pv.setCodPedidoVenda(Integer.parseInt(JOptionPane.showInputDialog("Informe o código de pedido")));
        pv.setNumPedido(Integer.parseInt(JOptionPane.showInputDialog("Informe o número do pedido")));
        pv.setCliente(JOptionPane.showInputDialog("Informe o nome do cliente"));
        try {
            String data = JOptionPane.showInputDialog("Data Cadastro");

            pv.setDtCadastro(new SimpleDateFormat("dd/mm/yyyy").parse(data));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Data incorreta" + ex);
        }
        try {
            String data = JOptionPane.showInputDialog("Data Entrega");

            pv.setDtEntrega(new SimpleDateFormat("dd/mm/yyyy").parse(data));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Data incorreta" + ex);
        }
        pv.setValorTotal(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor total")));
        pv.setFormaPagamento(JOptionPane.showInputDialog("Informe a forma de pagamento"));
        pv.setTransportadoraResp(JOptionPane.showInputDialog("Informe a transportadora responsável"));
        pv.setNotaFiscal(Integer.parseInt(JOptionPane.showInputDialog("Informe o número da nota fiscal")));
        
        //Instanciando o segundo pedido venda
        PedidoVenda pv2 = new PedidoVenda();
        pv2.setCodPedidoVenda(Integer.parseInt(JOptionPane.showInputDialog("Informe o código de pedido")));
        pv2.setNumPedido(Integer.parseInt(JOptionPane.showInputDialog("Informe o número do pedido")));
        pv2.setCliente(JOptionPane.showInputDialog("Informe o nome do cliente"));
        try {
            String data = JOptionPane.showInputDialog("Data Cadastro");

            pv2.setDtCadastro(new SimpleDateFormat("dd/mm/yyyy").parse(data));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Data incorreta" + ex);
        }
        try {
            String data = JOptionPane.showInputDialog("Data Entrega");

            pv2.setDtEntrega(new SimpleDateFormat("dd/mm/yyyy").parse(data));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Data incorreta" + ex);
        }
        pv2.setValorTotal(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor total")));
        pv2.setFormaPagamento(JOptionPane.showInputDialog("Informe a forma de pagamento"));
        pv2.setTransportadoraResp(JOptionPane.showInputDialog("Informe a transportadora responsável"));
        pv2.setNotaFiscal(Integer.parseInt(JOptionPane.showInputDialog("Informe o número da nota fiscal")));
        
          }
}
