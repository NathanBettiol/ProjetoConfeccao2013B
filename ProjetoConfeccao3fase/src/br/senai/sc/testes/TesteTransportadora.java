package br.senai.sc.testes;

import br.senai.sc.model.negocio.Transportadora;
import javax.swing.JOptionPane;

/**
 *
 * @author wesley_s
 */
public class TesteTransportadora {

    public static void main(String[] args) {
        //Teste da classe transportadora
        Transportadora trans1 = new Transportadora();
        Transportadora trans2 = new Transportadora();

        trans1.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Informe um código: ")));
        trans1.setNmFantasia(JOptionPane.showInputDialog("Informe o nome fantasia: "));
        trans1.setCnpj(JOptionPane.showInputDialog("Informe o cnpj: "));
        trans1.setEndereco(JOptionPane.showInputDialog("Informe o endereço: "));
        trans1.setRazaoSocial(JOptionPane.showInputDialog("Informe a razão social: "));
        trans1.setTelefone(JOptionPane.showInputDialog("Informe o telefone: "));
        trans1.setEmail(JOptionPane.showInputDialog("Informe o e-mail: "));
        trans1.setPaginaWeb(JOptionPane.showInputDialog("Informe o endereço da página web: "));
        trans1.setContato(JOptionPane.showInputDialog("Informe o nome para contato: "));
        JOptionPane.showMessageDialog(null, trans1.toString());

        trans2.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Informe um código: ")));
        trans2.setNmFantasia(JOptionPane.showInputDialog("Informe o nome fantasia: "));
        trans2.setCnpj(JOptionPane.showInputDialog("Informe o cnpj: "));
        trans2.setEndereco(JOptionPane.showInputDialog("Informe o endereço: "));
        trans2.setRazaoSocial(JOptionPane.showInputDialog("Informe a razão social: "));
        trans2.setTelefone(JOptionPane.showInputDialog("Informe o telefone: "));
        trans2.setEmail(JOptionPane.showInputDialog("Informe o e-mail: "));
        trans2.setPaginaWeb(JOptionPane.showInputDialog("Informe o endereço da página web: "));
        trans2.setContato(JOptionPane.showInputDialog("Informe o nome para contato: "));
        JOptionPane.showMessageDialog(null, trans2.toString());
        //Fim do teste da classe transportadora
    }
}
