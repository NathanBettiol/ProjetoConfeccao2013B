package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.Transportadora;
import br.senai.sc.model.persistencia.TransportadoraDaoJDBC;
import br.senai.sc.persistencia.dao.TransportadoraDAO;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author wesley_s
 */
public class TesteConexaoTransportadoraListar {

//------------------------------------------------------------------------------
    public static void main(String[] args) {
        TransportadoraDAO dao = new TransportadoraDaoJDBC();
        List<Transportadora> transportadoras = dao.listAll();
        for (Transportadora transportadora : transportadoras) {
            JOptionPane.showMessageDialog(null, transportadora);
        }
    }
}