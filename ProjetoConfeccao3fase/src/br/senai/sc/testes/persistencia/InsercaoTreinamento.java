
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.Treinamento;
import br.senai.sc.model.persistencia.TreinamentoDaoJDBC;
import br.senai.sc.persistencia.dao.TreinamentoDAO;

import javax.swing.JOptionPane;

/*
 * Classe responsavel pela execução do teste de inserção
 * @author Bruna Zakrzeski
 * @version 1.0 09/09/2013
 */


public class InsercaoTreinamento {
    
    public static void main(String[] args) {
        
        Treinamento treina =  new Treinamento();
        
        treina.setNome(JOptionPane.showInputDialog("Informe o nome do treinamento: "));
        treina.setCargaHoraria(Integer.parseInt(JOptionPane.showInputDialog("Informe a carga horária do treinamento: ")));
        treina.setConteudo(JOptionPane.showInputDialog("Informe o conteúdo do treinamento: "));
        
        
        
        TreinamentoDAO dao = new TreinamentoDaoJDBC();
        
        dao.insert(treina);
        
        
        }
        
        
    }
    

