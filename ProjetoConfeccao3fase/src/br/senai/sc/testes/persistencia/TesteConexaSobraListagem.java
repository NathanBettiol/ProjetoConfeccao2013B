package br.senai.sc.testes.persistencia;

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
public class TesteConexaSobraListagem {

    public static void main(String[] args) {

        /*
         * Teste de listagem na classe sobra
         */

        try {
            Connection con = ConnectionFactory.getConnection();

            PreparedStatement pstm = con.prepareStatement("select * from sobra");

            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                System.out.println("Id "                       + rs.getInt("cod_sobra")
                        + "\nPeso: "                           + rs.getString("peso")
                        + "\nCategoria: "                      + rs.getString("categoria")
                        + "\nMateria Prima: "                  + rs.getString("materia_prima")
                        + "\nData Cadastro: "                  + rs.getString("dt_cadastro")
                        + "\nFuncionário Responsável: "        + rs.getString("cod_responsavel"));
                        
            }
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao listar contatos " + ex.getMessage());

        }

    }
}
