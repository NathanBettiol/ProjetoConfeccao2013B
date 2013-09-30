/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.Entrada;
import br.senai.sc.model.negocio.Pessoa;
import br.senai.sc.model.persistencia.EntradaDaoJDBC;
import br.senai.sc.persistencia.dao.EntradaDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author nathan_bettiol
 * 
 * Classe de teste da atualização do banco de dados da tabela entrada
 */
public class TesteAtualizacaoEntrada {
    
public static void main(String[] args) {
        
        
        Entrada e = new Entrada();
        
        e.setProduto(JOptionPane.showInputDialog("Informe o nome do produto: "));
        String dataEmissao = JOptionPane.showInputDialog("Informe a data de Emissao: DD/MM/YYYY ");
        try {
            e.setDtEmissao(new SimpleDateFormat("dd/MM/yyyy").parse(dataEmissao));
        } catch (Exception ex) {
            System.out.println("Erro ao converter a data de Emissão");
        }
        e.setFuncionario(JOptionPane.showInputDialog("Digite o nome Funcionario: "));
        e.setNrNotaFiscal(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da nota fiscal: ")));
        e.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço: ")));
        e.setQtProduto(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto: ")));
        
        e.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Informe o "
                + "id do produto a ser alterado")));
        EntradaDAO dao = new EntradaDaoJDBC();
        dao.update(e);
    }
}
