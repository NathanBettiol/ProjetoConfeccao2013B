package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.Transportadora;
import br.senai.sc.model.persistencia.TransportadoraDaoJDBC;
import br.senai.sc.persistencia.dao.TransportadoraDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author wesley_s
 */
public class TesteConexaoTransportadoraListarId {

//------------------------------------------------------------------------------
    public static void main(String[] args) {
        TransportadoraDAO dao = new TransportadoraDaoJDBC();
        int cod = Integer.parseInt(JOptionPane.showInputDialog("Informe o código"
                + "da transportadora a ser listada"));
        Transportadora t = dao.listById(cod);

        JOptionPane.showMessageDialog(null, t);
    }
}