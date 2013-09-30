
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes.persistencia;

import br.senai.sc.testes.*;
import br.senai.sc.model.negocio.TipoFisico;
import br.senai.sc.model.persistencia.TipoFisicoDaoJDCB;
import br.senai.sc.persistencia.dao.TipoFisicoDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo_lourenco
 */
public class TesteConexaoTipoFisicoInsercao {
    
    public static void main(String[] args) {
        
        /*
         * Teste de inserção na Classe Tipo Fisico
         */
        TipoFisico tf = new TipoFisico();
        
        tf.setCodigo(1);
        tf.setNome(JOptionPane.showInputDialog("Nome: "));
        tf.setGenero(JOptionPane.showInputDialog("Genero: "));
        tf.setDescicao(JOptionPane.showInputDialog("Descrição: "));
        TipoFisicoDAO dao = new TipoFisicoDaoJDCB();
        dao.insert(tf);
    }
}
