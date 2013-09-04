package br.senai.sc.testes;

import br.senai.sc.model.negocio.NotaFiscal;
import javax.swing.JOptionPane;

public class TesteNotaFiscal {

    public static void main(String[] args) {

        NotaFiscal n1 = new NotaFiscal();
        n1.setCodNumero(Integer.parseInt(JOptionPane.showInputDialog("digite o numero da nota fiscal:")));
        n1.setDataEmissao(JOptionPane.showInputDialog("digite a data da emissão:"));
        n1.setProdutos(JOptionPane.showInputDialog("digite qual é o produto:"));

        n1.setValorTotal(Double.parseDouble(JOptionPane.showInputDialog("digite o valor total:")));
        n1.setFuncionarioResponsavel(JOptionPane.showInputDialog("digite o nome do funcionario responsavel:"));
        n1.setDestinatario(JOptionPane.showInputDialog("digite o destinatario:"));
        n1.setRemetente(JOptionPane.showInputDialog("digite o remetente:"));

        JOptionPane.showMessageDialog(null, "NOTA FISCAL"
                + "\nNumero da nota:" + n1.getCodNumero()
                + "\nData da emissão:" + n1.getDataEmissao()
                + "\nProdutos:" + n1.getProdutos()
                + "\nFuncionario Responsavel:" + n1.getFuncionarioResponsavel()
                + "\nDestinatario:" + n1.getDestinatario()
                + "\nRemetente:" + n1.getRemetente());

        NotaFiscal n2 = new NotaFiscal();
        n2.setCodNumero(Integer.parseInt(JOptionPane.showInputDialog("digite o numero da nota fiscal:")));
        n2.setDataEmissao(JOptionPane.showInputDialog("digite a data da emissão:"));
        n2.setProdutos(JOptionPane.showInputDialog("digite qual é o produto:"));
        n2.setValorTotal(Double.parseDouble(JOptionPane.showInputDialog("digite o valor total:")));
        n2.setFuncionarioResponsavel(JOptionPane.showInputDialog("digite o nome do funcionario responsavel:"));

        n1.setValorTotal(Double.parseDouble(JOptionPane.showInputDialog("digite o valor total:")));        
        n1.setDestinatario(JOptionPane.showInputDialog("digite o destinatario:"));
        n1.setRemetente(JOptionPane.showInputDialog("digite o remetente:"));
        JOptionPane.showMessageDialog(null, "NOTA FISCAL"
                + "\nNumero da nota:" + n1.getCodNumero()
                + "\nData da emissão:" + n1.getDataEmissao()
                + "\nProdutos:" + n1.getProdutos()
                + "\nFuncionario Responsavel:" + n1.getFuncionarioResponsavel()
                + "\nDestinatario:" + n1.getDestinatario()
                + "\nRemetente:" + n1.getRemetente());

    }
}
