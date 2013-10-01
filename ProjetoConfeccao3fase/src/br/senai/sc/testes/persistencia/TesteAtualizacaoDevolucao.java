/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.Devolucao;
import br.senai.sc.model.persistencia.DevolucaoDaoJDBC;
import br.senai.sc.persistencia.dao.DevolucaoDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author douglas_ghisleri
 */
public class TesteAtualizacaoDevolucao {
    public static void main(String[] args) {

        Devolucao d = new Devolucao();
        
        d.setCod_devolucao(Integer.parseInt(JOptionPane.showInputDialog("Informe o Codigo da devolução:")));
        d.setDataDevolucao(JOptionPane.showInputDialog("Data devolução:"));
        d.setPeca(JOptionPane.showInputDialog("Peça:"));
        d.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Quantidade")));

        DevolucaoDAO dao = (DevolucaoDAO) new DevolucaoDaoJDBC();
        dao.update(d);
    }
}
