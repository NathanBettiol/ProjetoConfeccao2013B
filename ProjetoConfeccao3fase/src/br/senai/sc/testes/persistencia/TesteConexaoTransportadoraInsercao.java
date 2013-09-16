package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.Transportadora;
import br.senai.sc.model.persistencia.TransportadoraDaoJDBC;
import br.senai.sc.persistencia.dao.TransportadoraDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author wesley_s
 */
public class TesteConexaoTransportadoraInsercao {

    public static void main(String[] args) {


        Transportadora t = new Transportadora();
        
        t.setNmFantasia(JOptionPane.showInputDialog(""));
        t.String dataNascimento = JOptionPane.showInputDialog("Informe a data de nascimento: ");
        try {
            p.setDataNascimento(new SimpleDateFormat("dd/MM/yyyy").parse(dataNascimento));
        } catch (ParseException ex) {
            System.out.println("Erro ao converter a data de nascimento");
        }

        TransportadoraDAO daoTrans = new TransportadoraDaoJDBC();
        daoTrans.insert(t);
    }
}
