package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.Sobra;
import br.senai.sc.model.persistencia.SobradaoJDBC;
import br.senai.sc.persistencia.dao.SobraDAO;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Patricia Gageiro
 * @version 1.0 23/09/2013
 */
public class TesteConexaoSobraInsert {
    public static void main(String[] args) {
        /*
         * Teste da classe Sobra com o método de inserção
         */
        Sobra sob = new Sobra();
        sob.setCodSobra(1);
        sob.setPeso(JOptionPane.showInputDialog("peso"));
        sob.setCategoria(JOptionPane.showInputDialog("categoria"));
        sob.setMateriaPrima(JOptionPane.showInputDialog("materiaPrima"));
       try {
            String data = JOptionPane.showInputDialog("Data Cadastro");

            sob.setDtCadastro(new SimpleDateFormat("dd/mm/yyyy").parse(data));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Data incorreta" + ex);
        }
        sob.setFuncionarioResponsavel(JOptionPane.showInputDialog("funcionarioResponsavel"));
        
        SobraDAO dao = new SobradaoJDBC();
        dao.insert(sob);
        
        
    }
}
