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
public class TesteInsercaoFerias {
 public static void main(String[] args) {

    	Ferias f  = new Ferias();
    	f.setFuncionario(JOptionPane.showInputDialog("Digite o nome do funcionario: "));
    	
    	String dataInicio = JOptionPane.showInputDialog("Informe a data de inicio: ");
    	try {
        	f.setDataInicio(new SimpleDateFormat("dd/MM/yyyy").parse(dataInicio));
    	} catch (ParseException ex) {
   	 
   	 
            	System.out.println("Erro ao converter a data");
    	}

   	String dataFim = JOptionPane.showInputDialog("Informe a data de térimino: ");
    	try {
        	f.setDataFim(new SimpleDateFormat("dd/MM/yyyy").parse(dataInicio));
    	} catch (ParseException ex) {
   	 
   	 
            	System.out.println("Erro ao converter a data");
    	}
 

    	FeriasDAO dao = new FeriasDaoJDBC();
    	dao.insert(f);


	}   
}
