/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.Transportadora;
import br.senai.sc.model.persistencia.TransportadoraDaoJDBC;
import br.senai.sc.persistencia.dao.TransportadoraDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author wesley_s
 */
public class TesteConexaoTransportadoraAtualizacao {

//------------------------------------------------------------------------------
    public static void main(String[] args) {
        Transportadora t = new Transportadora();

        t.setNmFantasia(JOptionPane.showInputDialog("Informe o nome "
                + "fantasia: "));
        t.setRazaoSocial(JOptionPane.showInputDialog("Informe a razão "
                + "social: "));
        t.setCnpj(JOptionPane.showInputDialog("Informe o cnpj: "));
        t.setEndereco(JOptionPane.showInputDialog("Informe o endereço: "));
        t.setTelefone(JOptionPane.showInputDialog("Informe o telefone: "));
        t.setContato(JOptionPane.showInputDialog("Informe um nome para "
                + "contato: "));
        t.setEmail(JOptionPane.showInputDialog("Informe um e-mail: "));
        t.setPaginaWeb(JOptionPane.showInputDialog("Informe uma página "
                + "web: "));
        String dtCadastro = JOptionPane.showInputDialog("Informe a data de "
                + "cadastro: ");
        try {
            t.setDtCadastro(new SimpleDateFormat("dd/MM/yyyy").parse(
                    dtCadastro));
        } catch (ParseException ex) {
            System.out.println("Erro ao converter a data de nascimento");
        }

        t.setCod(Integer.parseInt(JOptionPane.showInputDialog("Informe o "
                + "id da transportadora a ser alterada")));

        TransportadoraDAO daoTrans = new TransportadoraDaoJDBC();
        daoTrans.update(t);
    }
}