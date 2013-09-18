/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.NotaFiscal;
import br.senai.sc.model.persistencia.NotaFiscalDaoJDBC;
import br.senai.sc.persistencia.dao.NotaFiscalDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author elivelton_sipriano
 */
public class TesteAtualizacaoNotaFiscal {
     public static void main(String[] args) {

        NotaFiscal e = new  NotaFiscal();
         e.setDataEmissao(JOptionPane.showInputDialog("Data Emissão: "));
        e.setProdutos(JOptionPane.showInputDialog("Produtos: "));
        e.setValorTotal(Integer.parseInt(JOptionPane.showInputDialog("Valor Total: ")));
        e.setDestinatario(JOptionPane.showInputDialog("Destinatário"));
        e.setRemetente(JOptionPane.showInputDialog("Remetente"));
         e.setFuncionarioResponsavel(JOptionPane.showInputDialog("Funcionario: "));
      

        NotaFiscalDAO dao = new  NotaFiscalDaoJDBC();
        dao.update(e);
    }
    
}
//    private int codNumero;
//    private String dataEmissao;
//    private String produtos;
//    private double valorTotal;
//    private String funcionarioResponsavel;
//    private String destinatario;
//    private String remetente;