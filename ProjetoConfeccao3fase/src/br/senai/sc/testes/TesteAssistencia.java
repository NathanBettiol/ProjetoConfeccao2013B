package br.senai.sc.testes;

import br.senai.sc.model.negocio.Assistencia;
import javax.swing.JOptionPane;

/**
 * Classe TesteAssistencia * Instância de dois objetos da classe Assistencia
 * para testar sua funcionalidade.
 *
 * @version v1.0 04/09/2013
 * @author Gabriel Arsênio
 */
public class TesteAssistencia {

    public static void main(String[] args) {

        //Instância da assistência 0
        Assistencia as = new Assistencia();
        as.setCodAssistencia(0);
        as.setNomeAssistencia(JOptionPane.showInputDialog("Informe o nome da assistência"));
        as.setNomeFantasiaAssistencia(JOptionPane.showInputDialog("Informe o nome fantasia da assistência"));
        as.setCnpjAssistencia(JOptionPane.showInputDialog("Informe o CNPJ da assistência"));
        as.setRazaoSocialAssistencia(JOptionPane.showInputDialog("Informe a razão social da assistência"));
        as.setTelefoneAssistencia(JOptionPane.showInputDialog("Informe o telefone"));
        as.setEmailAssistencia(JOptionPane.showInputDialog("Informe o e-mail"));
        as.setPaginaWebAssistencia(JOptionPane.showInputDialog("Informe a página na web da assistência"));
        as.setContatoAssistencia(JOptionPane.showInputDialog("Contato"));

        JOptionPane.showMessageDialog(null, as.toString());

        //Instância do assistência 1
        Assistencia as1 = new Assistencia();
        as1.setCodAssistencia(1);
        as1.setNomeAssistencia(JOptionPane.showInputDialog("Informe o nome da assistência"));
        as1.setNomeFantasiaAssistencia(JOptionPane.showInputDialog("Informe o nome fantasia da assistência"));
        as1.setCnpjAssistencia(JOptionPane.showInputDialog("Informe o CNPJ da assistência"));
        as1.setRazaoSocialAssistencia(JOptionPane.showInputDialog("Informe a razão social da assistência"));
        as1.setTelefoneAssistencia(JOptionPane.showInputDialog("Informe o telefone"));
        as1.setEmailAssistencia(JOptionPane.showInputDialog("Informe o e-mail"));
        as1.setPaginaWebAssistencia(JOptionPane.showInputDialog("Informe a página na web da assistência"));
        as1.setContatoAssistencia(JOptionPane.showInputDialog("Contato"));

        JOptionPane.showMessageDialog(null, as1.toString());
    }
}
