/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.model.persistencia;

import br.senai.sc.model.negocio.CategoriaColecao;
import br.senai.sc.persistencia.dao.CategoriaColecaoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * @version v1.0 30/08/2013
 * @author Gabriel Arsênio
 */
public class CategoriaColecaoDaoJDBC implements CategoriaColecaoDAO{

    //Strings com os comandos SQL
    private static final String INSERT = "INSERT INTO categoria_colecao VALUES (null, ?, ?)";
    private static final String UPDATE = "UPDATE categoria_colecao set nm_categoria_colecao = ?, descricao = ? where cod_categoria = ?";
    private static final String DELETE = "DELETE FROM categoria_colecao WHERE cod_categoria = ?";
    private static final String SELECT = "select * from categoria_colecao";

    //Método para atualizar valores da tabela categoria_colecao
    @Override
    public boolean update(CategoriaColecao cc) throws SQLException {
        //Cria uma nova conexão
        Connection con = null;
        try {
            //Abre a conexão
            con = ConnectionFactory.getConnection();
            //Prepara o comando SQL
            PreparedStatement pstm = con.prepareStatement(UPDATE);
            //Substitui os pontos de interrogação do comando
            pstm.setString(1, cc.getNomeCategoriaColecao());
            pstm.setString(2, cc.getDescricaoCategoriaColecao());
            pstm.setInt(3, cc.getCodCategoriaColecao());
            //Executa o comando
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
            //Fecha a conexão
            ConnectionFactory.closeConnection(con, pstm);
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex.getMessage());
            ConnectionFactory.closeConnection(con);
            return false;
        }
    }

    //Método para deletar valores da tabela categoria_colecao
    @Override
    public boolean delete(int cod) throws SQLException {
        //Cria uma nova conexão
        Connection con = null;
        try {
            //Abre a conexão
            con = ConnectionFactory.getConnection();
            //Executa o comando SQL
            PreparedStatement pstm = con.prepareStatement(DELETE);
            //Substitui os pontos de interrogação do comando            
            pstm.setInt(1, cod);
            //Executa o comando
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
            //Fecha a conexão e o statement
            ConnectionFactory.closeConnection(con, pstm);
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex.getMessage());
            //Fecha a conexão
            ConnectionFactory.closeConnection(con);
            return false;
        }
    }

    //Método para procurar valores da tabela categoria_colecao
    @Override
    public List<CategoriaColecao> listAll() throws SQLException {
        //Cria uma nova conexão
        Connection con = null;
        //Cria lista onde vai ser colocado os resultados da busca
        List<CategoriaColecao> listaCategoriasColecao = new ArrayList();
        try {
            //Abre a conexão
            con = ConnectionFactory.getConnection();
            //Executa o comando SQL, no caso o comando SELECT
            PreparedStatement pstm = con.prepareStatement(SELECT);
            //Executa o comando SQL dentro do ResultSet rs
            ResultSet rs = pstm.executeQuery();
            //Percorre a lista colocando os resultados dentro do ResultSet rs
            while (rs.next()) {
                CategoriaColecao cc = new CategoriaColecao();
                
                cc.setCodCategoriaColecao(rs.getInt("cod_categoria"));
                //Pega os valores que estão no campo "nm_categoria_colecao" da tabela
                cc.setNomeCategoriaColecao(rs.getString("nm_categoria_colecao"));
                //pega os valores que estão no campo "descricao" da tabela
                cc.setDescricaoCategoriaColecao(rs.getString("descricao"));
                //Adiciona os valores na lista
                listaCategoriasColecao.add(cc);
            }
            //Fecha a conexão e o statement
            ConnectionFactory.closeConnection(con, pstm);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro  no busca: " + ex.getMessage());
            ConnectionFactory.closeConnection(con);
        }
        return listaCategoriasColecao;
    }

    //Método de inserção de valores da tabela categoria_colecao
    @Override
    public boolean insert(CategoriaColecao cc) throws SQLException {

        //Cria uma nova conexão
        Connection con = null;
        try {
            //Abre a conexão 'conn'
            con = ConnectionFactory.getConnection();

            //Recebe a String com o comando SQL, no caso, o comando INSERT
            PreparedStatement pstm = con.prepareStatement(INSERT);

            //Subustitui os pontos de interrogação do comando
            pstm.setString(1, cc.getNomeCategoriaColecao());
            pstm.setString(2, cc.getDescricaoCategoriaColecao());

            //Executa o comando SQL
            pstm.execute();

            //Fecha a conexão
            ConnectionFactory.closeConnection(con, pstm);

            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir: " + ex.getMessage());

            //Fecha a conxão
            ConnectionFactory.closeConnection(con);
            return false;
        }
    }
}
