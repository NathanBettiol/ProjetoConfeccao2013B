/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.Ferias;
import br.senai.sc.model.persistencia.FeriasDaoJDBC;
import br.senai.sc.persistencia.dao.FeriasDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author larissa
 */
public class TesteAtualizacaoFerias {
    public static void main(String[] args) {
    	Ferias f = new Ferias();
   	 
    	f.setFuncionario(JOptionPane.showInputDialog("Informe o nome do funcionario "));
    	String dataFim = JOptionPane.showInputDialog("Informe a data de fim: ");
        try {
            f.setDataFim((new SimpleDateFormat("dd/MM/yyy").parse(dataFim)));
        }catch (ParseException ex) {
    	
    	   	String dataInicio = JOptionPane.showInputDialog("Informe a data de inicio: ");
    	try {
        	f.setDataInicio(new SimpleDateFormat("dd/MM/yyyy").parse(dataInicio));
    	} catch (ParseException e) {
    	
   	 
       	 
        	FeriasDAO dao = new FeriasDaoJDBC();
    	dao.update(f);
	}
	}
}



}
