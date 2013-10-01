/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes.persistencia;


import br.senai.sc.model.negocio.Entrada;
import br.senai.sc.model.persistencia.EntradaDaoJDBC;
import br.senai.sc.persistencia.dao.EntradaDAO;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author nathan_bettiol
 * Classe responsavel por atualizar um registro na base de dados
 */
public class TesteInsercaoEntrada {

    public static void main(String[] args) {




        Entrada e = new Entrada();

        
        e.setProduto(JOptionPane.showInputDialog("Digite o nome do produto :"));
        e.setQtProduto(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto")));
        e.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto")));
        e.setFuncionario(JOptionPane.showInputDialog("Digite o nome do funcionario"));
        e.setNrNotaFiscal(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da nota Fiscal")));
        String dataEmissao = JOptionPane.showInputDialog("Informe a data de Emissao: ");
        
        try {
            e.setDtEmissao(new SimpleDateFormat("dd/MM/yyyy").parse(dataEmissao));
        } catch (Exception ex) {
            System.out.println("Erro ao converter a data de Emissão");
        }
        
        EntradaDAO daoPes = new EntradaDaoJDBC();
        daoPes.insert(e);


    }
}
