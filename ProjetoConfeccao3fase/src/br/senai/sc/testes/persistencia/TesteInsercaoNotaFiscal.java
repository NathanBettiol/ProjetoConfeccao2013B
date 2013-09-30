/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.NotaFiscal;

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
        e.setProdutos(JOptionPane.showInputDialog("Produtos: "));
        e.setValorTotal(Double.parseDouble(JOptionPane.showInputDialog("Valor Total: ")));
        e.setDestinatario(JOptionPane.showInputDialog("Destinatário"));
        e.setRemetente(JOptionPane.showInputDialog("Remetente"));
        e.setFuncionarioResponsavel(JOptionPane.showInputDialog("codigo Funcionario: "));
        
        try {
             String data = JOptionPane.showInputDialog("Data:");
            e.setDataEmissao((Date)new SimpleDateFormat("dd/mm/yyyy").parse(data));
     
        } catch (ParseException ex) {
            System.out.println("Erro ao converter a data de nascimento" + ex.getMessage());
        }




        NotaFiscalDaoJDBC dao = new NotaFiscalDaoJDBC();
        dao.insert(e);
    }
}
