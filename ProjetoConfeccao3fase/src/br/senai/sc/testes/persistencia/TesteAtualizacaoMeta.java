/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.Meta;
import br.senai.sc.model.persistencia.MetaDaoJDBC;
import br.senai.sc.persistencia.dao.MetaDAO;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author douglas_ghisleri
 */
public class TesteAtualizacaoMeta {

    public static void main(String[] args) {

        Meta m = new Meta();
        
        m.setCod_meta(Integer.parseInt(JOptionPane.showInputDialog("Informe o Codigo meta:")));
         try {
            String dataIn = JOptionPane.showInputDialog("Data Inicio:");

            m.setDataInicio(new SimpleDateFormat("dd/mm/yyyy").parse(dataIn));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Data incorreta" + ex);
        }
        
        try {
            String dataFim = JOptionPane.showInputDialog("Data Fim:");

            m.setDataFim(new SimpleDateFormat("dd/mm/yyyy").parse(dataFim));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Data incorreta" + ex);
        }
        m.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Quantidade:")));
        m.setValor(Integer.parseInt(JOptionPane.showInputDialog("Valor:")));

        MetaDAO dao = new MetaDaoJDBC();
        dao.update(m);
    }
}
