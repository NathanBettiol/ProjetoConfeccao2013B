/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.Ferramenta;
import br.senai.sc.model.persistencia.FerramentaDaoJDBC;
import br.senai.sc.persistencia.dao.FerramentaDAO;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;


/**
 *
 * @author ariane_souza
 */
public class TesteConexaoFerramenta {
        public static void main(String[] args) {
        Ferramenta f = new Ferramenta();
        f.setNome(JOptionPane.showInputDialog("Informe o nome da pessoa"));
        String dataCadastro = JOptionPane.showInputDialog("Informe a data de nascimento");
        try {
            f.setDtCadastro((Date) new SimpleDateFormat("dd/MM/yyyy").parse(dataCadastro));
        } catch (ParseException ex) {
            System.out.println("Erro ao converter a data de nascimento");
        }
        
        FerramentaDAO dao = new FerramentaDaoJDBC();
        dao.insert(f);
    }
}
