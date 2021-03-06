/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.Funcionario;
import br.senai.sc.model.negocio.NotaFiscal;
import br.senai.sc.model.negocio.Produto;
import br.senai.sc.model.persistencia.NotaFiscalDaoJDBC;
import br.senai.sc.persistencia.dao.NotaFiscalDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author elivelton_sipriano
 */
public class TesteAtualizacaoNotaFiscal {

    public static void main(String[] args) {

        NotaFiscal e = new NotaFiscal();
        int id = Integer.parseInt(JOptionPane.showInputDialog("digite o codigo a ser alterado"));
        e.setCodNumero(id);
        Produto p = new Produto();
        Funcionario f = new Funcionario();
        e.setProdutos(p);
        e.setValorTotal(Double.parseDouble(JOptionPane.showInputDialog("Valor Total: ")));
        e.setDestinatario(JOptionPane.showInputDialog("Destinatário"));
        e.setRemetente(JOptionPane.showInputDialog("Remetente"));
        e.setFuncionarioResponsavel(f);


        try {
            String data = JOptionPane.showInputDialog("Data:");
            e.setDataEmissao((Date) new SimpleDateFormat("dd/mm/yyyy").parse(data));

        } catch (ParseException ex) {
            System.out.println("Erro ao converter a data de emissao" + ex.getMessage());
        }

        NotaFiscalDAO dao = new NotaFiscalDaoJDBC();
        dao.update(e);
    }
}
