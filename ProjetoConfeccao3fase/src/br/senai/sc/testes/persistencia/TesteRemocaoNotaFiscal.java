/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.persistencia.NotaFiscalDaoJDBC;
import br.senai.sc.persistencia.dao.NotaFiscalDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author elivelton_sipriano
 */
public class TesteRemocaoNotaFiscal {

    public static void main(String[] args) {
        int codNumero = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID a ser deletado: "));
        NotaFiscalDAO dao = new NotaFiscalDaoJDBC();
        dao.delete(codNumero);
    }
}
