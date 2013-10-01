/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.Meta;
import br.senai.sc.model.persistencia.MetaDaoJDBC;
import br.senai.sc.persistencia.dao.MetaDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author douglas_ghisleri
 */
public class TesteInsercaoMeta {

    public static void main(String[] args) {

        Meta m = new Meta();

        String dataInicio = JOptionPane.showInputDialog("Informe a data de inicio");
        try {
            m.setDataInicio((Date) new SimpleDateFormat("dd/MM/yyyy").parse(dataInicio));
        } catch (ParseException ex) {
            System.out.println("Erro ao converter a data de cadastro");
        }
        String dataFim = JOptionPane.showInputDialog("Informe a data de inicio");
        try {
            m.setDataFim((Date) new SimpleDateFormat("dd/MM/yyyy").parse(dataFim));
        } catch (ParseException ex) {
            System.out.println("Erro ao converter a data de cadastro");
        }
        m.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Quantidade:")));
        m.setValor(Integer.parseInt(JOptionPane.showInputDialog("Valor")));

        MetaDAO dao = (MetaDAO) new MetaDaoJDBC();
        dao.insert(m);


    }
}
