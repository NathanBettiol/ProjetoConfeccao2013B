package br.senai.sc.testes;

//------------------------------------------------------------------------------
import br.senai.sc.model.negocio.Assistencia;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

//------------------------------------------------------------------------------
/**
 * Classe para testar a classe Assistencia
 *
 * @version v1.0 04/09/2013
 * @author wesley_s
 */
public class TesteAssistencia {

//------------------------------------------------------------------------------
    public static void main(String[] args) {

        //----------------------------------------------------------------------
        Assistencia a1 = new Assistencia();
        a1.setCod(Integer.parseInt(JOptionPane.showInputDialog("Informe um "
                + "códgio: ")));
        a1.setNmFantasia(JOptionPane.showInputDialog("Informe o nome "
                + "fantasia: "));
        a1.setRazaoSocial(JOptionPane.showInputDialog("Informe a razão "
                + "social: "));
        a1.setCnpj(JOptionPane.showInputDialog("Informe o CNPJ: "));
        a1.setEndereco(JOptionPane.showInputDialog("Informe o endereço: "));
        a1.setTelefone(JOptionPane.showInputDialog("Informe o telefone: "));
        a1.setContato(JOptionPane.showInputDialog("Informe um nome para "
                + "contato: "));
        a1.setEmail(JOptionPane.showInputDialog("Informe o e-mail: "));
        a1.setPaginaWeb(JOptionPane.showInputDialog("Informe a página na "
                + "web: "));
        try {
            String data = JOptionPane.showInputDialog("Informe a data de "
                    + "cadastro: ");
            a1.setDtCadastro((Date) new SimpleDateFormat("dd/MM/yyyy").
                    parse(data));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data incorreta: " + e);
        }

        JOptionPane.showMessageDialog(null, a1.toString());

        //----------------------------------------------------------------------
        Assistencia a2 = new Assistencia();
        a2.setCod(Integer.parseInt(JOptionPane.showInputDialog("Informe um "
                + "códgio: ")));
        a2.setNmFantasia(JOptionPane.showInputDialog("Informe o nome "
                + "fantasia: "));
        a2.setRazaoSocial(JOptionPane.showInputDialog("Informe a razão "
                + "social: "));
        a2.setCnpj(JOptionPane.showInputDialog("Informe o CNPJ: "));
        a2.setEndereco(JOptionPane.showInputDialog("Informe o endereço: "));
        a2.setTelefone(JOptionPane.showInputDialog("Informe o telefone: "));
        a2.setContato(JOptionPane.showInputDialog("Informe um nome para "
                + "contato: "));
        a2.setEmail(JOptionPane.showInputDialog("Informe o e-mail: "));
        a2.setPaginaWeb(JOptionPane.showInputDialog("Informe a página na "
                + "web: "));
        try {
            String data = JOptionPane.showInputDialog("Informe a data de "
                    + "cadastro: ");
            a2.setDtCadastro((Date) new SimpleDateFormat("dd/MM/yyyy").
                    parse(data));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data incorreta: " + e);
        }
        JOptionPane.showMessageDialog(null, a2.toString());
    }
}
