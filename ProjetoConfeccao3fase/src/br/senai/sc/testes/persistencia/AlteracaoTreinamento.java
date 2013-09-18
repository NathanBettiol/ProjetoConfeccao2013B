
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.Treinamento;
import br.senai.sc.model.persistencia.TreinamentoDaoJDBC;
import br.senai.sc.persistencia.dao.TreinamentoDAO;

import javax.swing.JOptionPane;

/*
 * Classe responsavel pela execução do teste de atualização
 * @author Bruna Zakrzeski
 * @version 1.0 09/09/2013
 */

public class AlteracaoTreinamento {
    
    public static void main(String[] args) {
        
        Treinamento treina = new Treinamento();
        
        treina.setNome(JOptionPane.showInputDialog("Digite o novo nome para alteração: "));
        treina.setCargaHoraria(Integer.parseInt(JOptionPane.showInputDialog("Digite a nova carga horária para alteração: ")));
        treina.setConteudo(JOptionPane.showInputDialog("Digite o novo conteúdo para alteração: "));
        treina.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o id para que a alteração seja feita: ")));
            
        
            TreinamentoDAO dao = new TreinamentoDaoJDBC();
            
            dao.update(treina);
        }
        
        
    }
   

