package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.Funcionario;
import br.senai.sc.model.persistencia.FuncionariodaoJDBC;
import br.senai.sc.persistencia.dao.FuncionarioDAO;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 * @version 1.0 21/09/2013
 * @author patricia_gageiro
 * @param p
 * @return
 *
 */
public class TesteConexaoFuncionarioInsercao {

    public static void main(String[] args) {

        /*
         * Teste de inserção da classe funcionário
         */

        Funcionario fun = new Funcionario();
        fun.setCod(1);
        fun.setNome(JOptionPane.showInputDialog("Nome: "));
        fun.setCpf(JOptionPane.showInputDialog("Cpf: "));
        fun.setRg(JOptionPane.showInputDialog("Rg: "));
         try {
            String data = JOptionPane.showInputDialog("Data Nascimento");

            fun.setDtNascimento(new SimpleDateFormat("dd/mm/yyyy").parse(data));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Data incorreta" + ex);
        }
        fun.setEndereco(JOptionPane.showInputDialog("Endereco: "));
        fun.setTelefone(JOptionPane.showInputDialog("Telefone: "));
        try {
            String data = JOptionPane.showInputDialog("Data Cadastro");

            fun.setDtCadastro(new SimpleDateFormat("dd/mm/yyyy").parse(data));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Data incorreta" + ex);
        }
        fun.setLogin(JOptionPane.showInputDialog("Login: "));
        fun.setEmail(JOptionPane.showInputDialog("Email: "));
        fun.setCtps(JOptionPane.showInputDialog("Ctps: "));
        fun.setCargo(JOptionPane.showInputDialog("Cargo: "));
        fun.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Salário: ")));
        try {
            String data = JOptionPane.showInputDialog("Data Adimissão");

            fun.setDtAdimissao(new SimpleDateFormat("dd/mm/yyyy").parse(data));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Data incorreta" + ex);
        }

        try {
            String data = JOptionPane.showInputDialog("Data Recisão");

            fun.setDtRecisao(new SimpleDateFormat("dd/mm/yyyy").parse(data));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Data incorreta" + ex);
        }
         



        FuncionarioDAO dao = new FuncionariodaoJDBC();
        dao.insert(fun);
    }
}