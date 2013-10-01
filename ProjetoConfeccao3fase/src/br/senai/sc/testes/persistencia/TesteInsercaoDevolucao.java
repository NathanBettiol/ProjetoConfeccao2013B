/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.Devolucao;
import br.senai.sc.model.persistencia.DevolucaoDaoJDBC;
import br.senai.sc.persistencia.dao.DevolucaoDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author douglas_ghisleri
 */

public class TesteInsercaoDevolucao {
     
public static void main(String[] args) {

    	Devolucao d  = new Devolucao();
    	d.setPeca(JOptionPane.showInputDialog("Digite o nome da peça: "));
    	
    	String dataDev = JOptionPane.showInputDialog("Informe a data de inicio: ");
    	try {
        	d.setDataDevolucao(new SimpleDateFormat("dd/MM/yyyy").parse(dataDev));
    	} catch (ParseException ex) {
   	 
   	 
            	System.out.println("Erro ao converter a data");
    	} 
        d.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Quantidade:")));
    	DevolucaoDAO dao = (DevolucaoDAO) new DevolucaoDaoJDBC();
    	dao.insert(d);


	}   
}
