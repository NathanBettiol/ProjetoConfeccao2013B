package br.senai.sc.testes.persistencia;

import br.senai.sc.model.persistencia.MetaDaoJDBC;
import br.senai.sc.persistencia.dao.MetaDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author douglas_ghisleri
 */
public class TesteRemocaoMeta {

    public static void main(String[] args) {

        int codDelete = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID a ser deletado: "));

        MetaDAO dao = new MetaDaoJDBC();

        dao.delete(codDelete);

    }
}
