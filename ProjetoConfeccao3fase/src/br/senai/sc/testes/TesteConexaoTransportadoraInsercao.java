package br.senai.sc.testes;

import br.senai.sc.model.negocio.Transportadora;
import br.senai.sc.model.persistencia.TransportadoraDaoJDBC;
import br.senai.sc.persistencia.dao.TransportadoraDAO;

/**
 *
 * @author wesley_s
 */
public class TesteConexaoTransportadoraInsercao {

    public static void main(String[] args) {


        Transportadora t = new Transportadora();
        
        t.set
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
