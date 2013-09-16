/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes.persistencia;

import br.senai.sc.testes.*;
import br.senai.sc.model.persistencia.TipoFisicoDaoJDCB;
import br.senai.sc.persistencia.dao.TipoFisicoDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo_lourenco
 */
public class TesteConexaoTipoFisicoDelete {

    public static void main(String[] args) {
        
        int id = Integer.parseInt(JOptionPane.showInputDialog("Informe a ID a ser deletada: "));
        
        
        TipoFisicoDAO dao = new TipoFisicoDaoJDCB();
        dao.delete(id);
        
    }
}
