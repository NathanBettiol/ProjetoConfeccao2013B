/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.Funcionario;
import br.senai.sc.model.negocio.NotaFiscal;
import br.senai.sc.model.negocio.Produto;

import br.senai.sc.model.persistencia.NotaFiscalDaoJDBC;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author elivelton_sipriano
 */
public class TesteInsercaoNotaFiscal {

    public static void main(String[] args) {
        NotaFiscal e = new NotaFiscal();
        Funcionario f = new Funcionario();
        Produto p = new Produto();
        p.setCodProduto(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do produto:")));
        e.setProdutos(p);
        e.setValorTotal(Double.parseDouble(JOptionPane.showInputDialog("Valor Total: ")));
        e.setDestinatario(JOptionPane.showInputDialog("Destinatário"));
        e.setRemetente(JOptionPane.showInputDialog("Remetente"));
        f.setCod(2);
        e.setFuncionarioResponsavel(f);
        String data = JOptionPane.showInputDialog("Data:");
        try {
            e.setDataEmissao((Date) new SimpleDateFormat("dd/mm/yyyy").parse(data));

        } catch (ParseException ex) {
            System.out.println("Erro ao converter a data de nascimento" + ex.getMessage());
        }
        NotaFiscalDaoJDBC dao = new NotaFiscalDaoJDBC();

        dao.insert(e);
    }
}
