package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.Funcionario;
import br.senai.sc.model.persistencia.FuncionariodaoJDBC;
import br.senai.sc.persistencia.dao.FuncionarioDAO;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 * @version 1.0 16/09/2013
 * @author patricia_gageiro
 * @param p
 * @return
 */
public class TesteConexaoFuncionarioUpdate {
    public static void main(String[] args) {
        
        /*
         * Teste de atualização da classe funcionário
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
        dao.update(fun);
    }
}