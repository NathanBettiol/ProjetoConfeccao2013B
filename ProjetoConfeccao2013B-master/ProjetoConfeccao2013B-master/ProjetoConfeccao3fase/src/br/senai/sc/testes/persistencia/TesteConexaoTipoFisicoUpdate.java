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
public class TesteConexaoTipoFisicoUpdate {

    public static void main(String[] args) {

        TipoFisico tf = new TipoFisico();

        tf.setCodigo(1);
        tf.setNome(JOptionPane.showInputDialog("Nome: "));
        tf.setGenero(JOptionPane.showInputDialog("Genero: "));
        tf.setDescicao(JOptionPane.showInputDialog("Descrição: "));
        tf.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Informe o ID a ser modificado: ")));
        TipoFisicoDAO dao = new TipoFisicoDaoJDCB();
        dao.update(tf);
    }
}
