
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.CategoriaMateriaPrima;
import br.senai.sc.model.negocio.MateriaPrima;
import br.senai.sc.model.persistencia.CategoriaMateriaPrimaDaoJDBC;
import br.senai.sc.model.persistencia.ConnectionFactory;
import br.senai.sc.model.persistencia.MateriaPrimaDaoJDBC;
import br.senai.sc.persistencia.dao.CategoriaMateriaPrimaDAO;
import br.senai.sc.persistencia.dao.MateriaPrimaDAO;
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
 * Classe responsavel pelo teste de listagem de matéria-prima na base de dados.
 */
public class TesteConexaoMateriaPrimaListar {
    
     public static void main(String[] args) {
       
  

        try {
            Connection con = ConnectionFactory.getConnection();

            PreparedStatement pstm = con.prepareStatement("select * from materia_prima");

            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                System.out.println("Código da matéria-prima" + rs.getInt("cod_materia_prima")
                        + "\nNome da matéria-prima: "     + rs.getString("nm_materia_prima")
                        +"\nPreço" + rs.getDouble("preco")
                        + "\nTipo das unidades de matéria-prima: "+ rs.getString("tipo_unidade")
                        + "\nQuantidade de matéria-prima: "+ rs.getString("qt_materiaprima")
                         + "\nFornededor: "+ rs.getInt("fornecedor") );
                      
            }
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao listar contatos " + ex.getMessage());

        }

    }
}


