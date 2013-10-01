/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.Devolucao;
import br.senai.sc.model.persistencia.DevolucaoDaoJDBC;
import br.senai.sc.persistencia.dao.DevolucaoDAO;
import java.util.List;

/**
 *
 * @author douglas_ghisleri
 */
public class TesteListaTodosDevolucao {
     public static void main(String[] args) {
        
        DevolucaoDAO dao = (DevolucaoDAO) new DevolucaoDaoJDBC();
        List<Devolucao> devolucoes = dao.listAll();
        for (Devolucao devolucao : devolucoes) {
            System.out.println(devolucao);
            
        }
    }
}
