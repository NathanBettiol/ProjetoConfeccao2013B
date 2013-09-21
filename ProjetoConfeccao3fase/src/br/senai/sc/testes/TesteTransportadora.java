package br.senai.sc.testes;

//------------------------------------------------------------------------------
import br.senai.sc.model.negocio.Transportadora;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

//------------------------------------------------------------------------------
/**
 * Classe para testar a classe Transportadora
 *
 * @author wesley_s
 */
public class TesteTransportadora {

//------------------------------------------------------------------------------
    public static void main(String[] args) {
        //Teste da classe transportadora
        Transportadora t1 = new Transportadora();
        Transportadora t2 = new Transportadora();

        //----------------------------------------------------------------------
        t1.setCod(Integer.parseInt(JOptionPane.showInputDialog("Informe um "
                + "código: ")));
        t1.setNmFantasia(JOptionPane.showInputDialog("Informe o nome "
                + "fantasia: "));
        t1.setRazaoSocial(JOptionPane.showInputDialog("Informe a razão "
                + "social: "));
        t1.setCnpj(JOptionPane.showInputDialog("Informe o cnpj: "));
        t1.setEndereco(JOptionPane.showInputDialog("Informe o endereço: "));
        t1.setTelefone(JOptionPane.showInputDialog("Informe o telefone: "));
        t1.setContato(JOptionPane.showInputDialog("Informe o nome para "
                + "contato: "));
        t1.setEmail(JOptionPane.showInputDialog("Informe o e-mail: "));
        t1.setPaginaWeb(JOptionPane.showInputDialog("Informe o endereço da "
                + "página web: "));
        try {
            String data = JOptionPane.showInputDialog("Informe a data de "
                    + "cadastro: ");
            t1.setDtCadastro((Date) new SimpleDateFormat("dd/MM/yyyy").
                    parse(data));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data incorreta: " + e);
        }
        JOptionPane.showMessageDialog(null, t1.toString());

        //----------------------------------------------------------------------
        t2.setCod(Integer.parseInt(JOptionPane.showInputDialog("Informe um "
                + "código: ")));
        t2.setNmFantasia(JOptionPane.showInputDialog("Informe o nome "
                + "fantasia: "));
        t2.setRazaoSocial(JOptionPane.showInputDialog("Informe a razão "
                + "social: "));
        t2.setCnpj(JOptionPane.showInputDialog("Informe o cnpj: "));
        t2.setEndereco(JOptionPane.showInputDialog("Informe o endereço: "));
        t2.setTelefone(JOptionPane.showInputDialog("Informe o telefone: "));
        t2.setContato(JOptionPane.showInputDialog("Informe o nome para "
                + "contato: "));
        t2.setEmail(JOptionPane.showInputDialog("Informe o e-mail: "));
        t2.setPaginaWeb(JOptionPane.showInputDialog("Informe o endereço da "
                + "página web: "));
        try {
            String data = JOptionPane.showInputDialog("Informe a data de "
                    + "cadastro: ");
            t2.setDtCadastro((Date) new SimpleDateFormat("dd/MM/yyyy").
                    parse(data));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data incorreta: " + e);
        }
        JOptionPane.showMessageDialog(null, t2.toString());
        //Fim do teste da classe transportadora
    }
}
