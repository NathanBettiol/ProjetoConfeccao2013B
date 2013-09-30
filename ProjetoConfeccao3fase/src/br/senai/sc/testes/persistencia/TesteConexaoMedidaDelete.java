/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.persistencia.MedidaDaoJDBC;
import br.senai.sc.persistencia.dao.MedidaDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo_lourenco
 */
public class TesteConexaoMedidaDelete {

    public static void main(String[] args) {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Informe a ID a ser deletada: "));

        MedidaDAO dao = new MedidaDaoJDBC();
        dao.delete(id);
    }
}
