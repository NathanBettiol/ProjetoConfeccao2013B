package br.senai.sc.testes;

import br.senai.sc.model.negocio.Funcionario;
import br.senai.sc.model.negocio.NotaFiscal;
import br.senai.sc.model.negocio.Produto;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class TesteNotaFiscal {

    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        Produto p = new Produto();
        NotaFiscal n1 = new NotaFiscal();
        n1.setCodNumero(Integer.parseInt(JOptionPane.showInputDialog("digite o numero da nota fiscal:")));
        try {
            String data = JOptionPane.showInputDialog("Data:");
            n1.setDataEmissao((Date) new SimpleDateFormat("dd/mm/yyyy").parse(data));

        } catch (ParseException ex) {
            System.out.println("Erro ao converter a data de emissao" + ex.getMessage());
        }

        n1.setProdutos(p);
        n1.setValorTotal(Double.parseDouble(JOptionPane.showInputDialog("digite o valor total:")));
        n1.setFuncionarioResponsavel(f);
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
        n1.setCodNumero(Integer.parseInt(JOptionPane.showInputDialog("digite o numero da nota fiscal:")));
        try {
            String data = JOptionPane.showInputDialog("Data:");
            n1.setDataEmissao((Date) new SimpleDateFormat("dd/mm/yyyy").parse(data));

        } catch (ParseException ex) {
            System.out.println("Erro ao converter a data de emissao" + ex.getMessage());
        }

        n1.setProdutos(p);
        n1.setValorTotal(Double.parseDouble(JOptionPane.showInputDialog("digite o valor total:")));
        n1.setFuncionarioResponsavel(f);
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
