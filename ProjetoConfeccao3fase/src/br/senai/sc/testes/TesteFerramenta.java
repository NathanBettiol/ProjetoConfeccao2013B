/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes;

import br.senai.sc.model.negocio.Ferramenta;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 * Classe que testa Ferramenta
 * @author ariane_souza
 */
public class TesteFerramenta {
    public static void main(String[] args) throws ParseException {
                //Instanciando ferramenta
        Ferramenta f1 = new Ferramenta();
        f1.setCodFerramenta(Integer.parseInt(JOptionPane.showInputDialog("Informe o código " + f1.getCodFerramenta())));
        f1.setNome(JOptionPane.showInputDialog("Informe o nome da ferramenta " + f1.getNome()));
        f1.setDescricao(JOptionPane.showInputDialog("Informe uma descrição da ferramenta " + f1.getDescricao()));
        f1.setNmFabricante(JOptionPane.showInputDialog("Informe o nome do fabricante " + f1.getNmFabricante()));
        String Data = JOptionPane.showInputDialog("Informe a data do cadastro: ");
        f1.setDtCadastro((Date) new SimpleDateFormat("dd/MM/yyyy").parse(Data));
        
        
        Ferramenta f2 = new Ferramenta();
        f2.setCodFerramenta(Integer.parseInt(JOptionPane.showInputDialog("Informe o código " + f2.getCodFerramenta())));
        f2.setNome(JOptionPane.showInputDialog("Informe o nome da ferramenta " + f2.getNome()));
        f2.setDescricao(JOptionPane.showInputDialog("Informe uma descrição da ferramenta " + f2.getDescricao()));
        f2.setNmFabricante(JOptionPane.showInputDialog("Informe o nome do fabricante " + f2.getNmFabricante()));
        String data = JOptionPane.showInputDialog("Informe a data do cadastro: ");
        f2.setDtCadastro((Date) new SimpleDateFormat("dd/MM/yyyy").parse(data));
    }
    
}
