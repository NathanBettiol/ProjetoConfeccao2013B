package br.senai.sc.testes;

import br.senai.sc.model.persistencia.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * @version 1.0 16/09/2013
 * @author patricia_gageiro
 * @param p
 * @return
 */
public class TesteConexaoFuncionarioList {

    public static void main(String[] args) {

        /*
         * Teste de listagem na classe funcionário
         */

        try {
            Connection con = ConnectionFactory.getConnection();

            PreparedStatement pstm = con.prepareStatement("select * from funcionario");

            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                System.out.println("Id "       + rs.getInt("cod_funcionario")
                        + "\nLogin: "          + rs.getString("login")
                        + "\nEmail: "          + rs.getString("email")
                        + "\nCtps: "           + rs.getString("ctps")
                        + "\nCargo: "          + rs.getString("cargo")
                        + "\nSalário: "        + rs.getString("salario")
                        + "\nData Adimissão: " + rs.getString("dt_adimissao")
                        + "\nData Recisão: "   + rs.getString("dt_recisao"));
            }
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao listar contatos " + ex.getMessage());

        }

    }
}
