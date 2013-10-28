package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.Sobra;
import br.senai.sc.model.persistencia.SobradaoJDBC;
import br.senai.sc.persistencia.dao.SobraDAO;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 * @version 1.0 23/09/2013
 * @author patricia_gageiro
 * @param p
 * @return
 */
public class TesteConexaoSobraUpdate {
    public static void main(String[] args) {
        
        /*
         * Teste de atualização da classe funcionário
         */
        
        Sobra sob = new Sobra();
        sob.setCodSobra(1);
        sob.setPeso(JOptionPane.showInputDialog("Peso: "));
        sob.setCategoria(JOptionPane.showInputDialog("Categoria: "));
        sob.setMateriaPrima(JOptionPane.showInputDialog("Materia Prima: "));
       
         try {
            String data = JOptionPane.showInputDialog("Data Cadastro");

            sob.setDtCadastro(new SimpleDateFormat("dd/mm/yyyy").parse(data));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Data incorreta" + ex);
        }
        
        sob.setFuncionarioResponsavel(JOptionPane.showInputDialog("Funcionário Responsável: "));
        SobraDAO dao = new SobradaoJDBC();
        dao.update(sob);
    }
}
