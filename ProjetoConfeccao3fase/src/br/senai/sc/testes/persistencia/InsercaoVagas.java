
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.Vagas;
import br.senai.sc.model.persistencia.VagasDaoJDBC;
import br.senai.sc.persistencia.dao.VagasDAO;
;


import javax.swing.JOptionPane;
import javax.swing.JOptionPane;

/*
 * Classe responsavel pela execução do teste de inserção
 * @author Bruna Zakrzeski
 * @version 1.0 09/09/2013
 */

public class InsercaoVagas {
    
    public static void main(String[] args) {
        
        
        Vagas vaga = new Vagas();
        
        
        vaga.setNome(JOptionPane.showInputDialog("Informe o nome da vaga: "));
        vaga.setQtVaga(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade da vaga: ")));
        vaga.setPreRequisito(JOptionPane.showInputDialog("Informe o pré - requisito da vaga: "));
        vaga.setFuncao(JOptionPane.showInputDialog("Informe a função da vaga: "));
        vaga.setfaixaSalaria(Double.parseDouble(JOptionPane.showInputDialog("Informe a faixa salarial da vaga: ")));
        
        
        VagasDAO dao = new VagasDaoJDBC();
        
        dao.insert(vaga);
        
        
        
        
    }

  
    }
   
