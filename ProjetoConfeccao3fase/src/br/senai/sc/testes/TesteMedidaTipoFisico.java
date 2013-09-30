/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes;

import br.senai.sc.model.negocio.Medida;
import br.senai.sc.model.negocio.TipoFisico;
import br.senai.sc.model.negocio.Usuario;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 * @version 1.0 28/08/2013
 * @author gustavo_lourenco
 */
public class TesteMedidaTipoFisico {

    public static void main(String[] args) {

        //Teste Classe Medida

        //Instancia da classe medida
        Medida t1 = new Medida();

        //Instancia da classe Usuario
        Usuario usuario = new Usuario();

        usuario.setCod(Integer.parseInt(JOptionPane.showInputDialog("Informe o código: ")));
        usuario.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
        usuario.setCpf(JOptionPane.showInputDialog("Informe o cpf: "));
        try {
            String data = JOptionPane.showInputDialog("Data de Cadastro: ");
            usuario.setDtCadastro((Date) new SimpleDateFormat("dd/MM/yyyy").parse(data));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data incorreta: " + e);
        }
        try {
            String data = JOptionPane.showInputDialog("Data de Nascimento: ");
            usuario.setDataNascimento((Date) new SimpleDateFormat("dd/MM/yyyy").parse(data));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data incorreta: " + e);
        }
        usuario.setEmail(JOptionPane.showInputDialog("Informe seu E-mail: "));
        usuario.setEndereco(JOptionPane.showInputDialog("Informe o endereço: "));
        usuario.setLogin(JOptionPane.showInputDialog("Entre com o login: "));
        usuario.setSenha(JOptionPane.showInputDialog("Digite sua senha: "));

        t1.setCodigo(1);
        t1.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: ")));
        t1.setMdBusto(Double.parseDouble(JOptionPane.showInputDialog("Digite a medida do busto: ")));
        t1.setMdCintura(Double.parseDouble(JOptionPane.showInputDialog("Digite a medida da cintura: ")));
        t1.setMdOmbros(Double.parseDouble(JOptionPane.showInputDialog("Digite a medida dos ombros: ")));
        t1.setMdQuadril(Double.parseDouble(JOptionPane.showInputDialog("Digite a medida do quadril: ")));

        //Mostra valores
        JOptionPane.showMessageDialog(null, t1.toString());

        //Teste Classe TipoFisico

        //Instancia da classe TipoFisico
        TipoFisico t2 = new TipoFisico();

        t2.setCodigo(1);
        t2.setNome(JOptionPane.showInputDialog("Informe o nome: "));
        t2.setGenero(JOptionPane.showInputDialog("Informe o genero: "));
        t2.setDescicao(JOptionPane.showInputDialog("Descrição: "));

        //Mostra valores
        JOptionPane.showMessageDialog(null, t2.toString());

    }
}
