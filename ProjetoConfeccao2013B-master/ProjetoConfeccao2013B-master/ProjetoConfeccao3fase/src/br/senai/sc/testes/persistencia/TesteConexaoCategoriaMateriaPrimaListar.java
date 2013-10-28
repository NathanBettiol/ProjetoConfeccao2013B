
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.CategoriaMateriaPrima;
import br.senai.sc.model.persistencia.CategoriaMateriaPrimaDaoJDBC;
import br.senai.sc.model.persistencia.ConnectionFactory;
import br.senai.sc.persistencia.dao.CategoriaMateriaPrimaDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author leticia_jesus
 * @version 1.0 20/09/2013
 * 
 * Classe responsavel pelo teste de listagem de uma categoria de matéria-prima na base de dados.
 */
public class TesteConexaoCategoriaMateriaPrimaListar {
    
     public static void main(String[] args) {
       

        try {
            Connection con = ConnectionFactory.getConnection();

            PreparedStatement pstm = con.prepareStatement("select * from categoria_materia_prima");

            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                System.out.println("Codigo da categoria matéria-prima " + rs.getInt("cod_categoria_materia_prima")
                        + "\nNome da categoria da matéria-prima: "     + rs.getString("nm_categoria_materia_prima")
                        + "\nDescrição da categoria da matéria-prima: "+ rs.getString("descricao"));
                      
            }
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao listar contatos " + ex.getMessage());

        }

    }
}

