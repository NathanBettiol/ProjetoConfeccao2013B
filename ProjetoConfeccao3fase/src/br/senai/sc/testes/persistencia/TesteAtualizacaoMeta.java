/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.Meta;
import br.senai.sc.model.persistencia.MetaDaoJDBC;
import br.senai.sc.persistencia.dao.MetaDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author douglas_ghisleri
 */
public class TesteAtualizacaoMeta {

    public static void main(String[] args) {

        Meta m = new Meta();
        
        m.setCod_meta(Integer.parseInt(JOptionPane.showInputDialog("Informe o Codigo meta")));
        m.setDataInicio(JOptionPane.showInputDialog("Data inicio:"));
        m.setDataFim(JOptionPane.showInputDialog("Data fim:"));
        m.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Quantidade")));
        m.setValor(Integer.parseInt(JOptionPane.showInputDialog("Valor")));

        MetaDAO dao = (MetaDAO) new MetaDaoJDBC();
        dao.update(m);
    }
}
