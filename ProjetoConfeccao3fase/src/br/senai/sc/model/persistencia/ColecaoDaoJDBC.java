/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.model.persistencia;

import br.senai.sc.model.negocio.CategoriaColecao;
import br.senai.sc.model.negocio.Colecao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author gabriel_arsenio
 */
public class ColecaoDaoJDBC {

    //Strings com os comandos SQL
    private static final String INSERT = "INSERT INTO colecao VALUES "
            + "(null, ?, ?, ? ,? ,?)";
    private static final String UPDATE = "UPDATE colecao set estacao = ?, ano = ?, "
            + "pub_alvo = ?, cod_funcionario = ?, categoria_colecao_cod_categoria = ? "
            + "where cod_colecao = ?";
    private static final String DELETE = "DELETE FROM categoria_colecao "
            + "WHERE cod_categoria = ?";
    private static final String SELECT = "select * from categoria_colecao";

    //Método de inserção de valores da tabela categoria_colecao
    public boolean insert(Colecao c) throws SQLException {
        //Cria uma nova conexão
        Connection con = null;
        try {
            //Abre a conexão 'conn'
            con = ConnectionFactory.getConnection();
            //Recebe a String com o comando SQL, no caso, o comando INSERT
            PreparedStatement pstm = con.prepareStatement(INSERT);
            //Subustitui os pontos de interrogação do comando
            pstm.setString(1, c.getEstacaoColecao());
            pstm.setInt(2, c.getAnoColecao());
            pstm.setString(3, c.getPubAlvoColecao());
            pstm.setInt(4, c.getFunResponsavelColecao().getCod());
            pstm.setInt(5, c.getCategoriaColecao().getCodCategoriaColecao());
            pstm.setInt(6, c.getCodColecao());
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

    //Método para atualizar valores da tabela categoria_colecao
    public boolean update(Colecao c) throws SQLException {
        //Cria uma nova conexão
        Connection con = null;
        try {
            //Abre a conexão
            con = ConnectionFactory.getConnection();
            //Prepara o comando SQL
            PreparedStatement pstm = con.prepareStatement(UPDATE);
            //Substitui os pontos de interrogação do comando
            pstm.setString(1, c.getEstacaoColecao());
            pstm.setInt(2, c.getAnoColecao());
            pstm.setString(3, c.getPubAlvoColecao());
            pstm.setInt(4, c.getFunResponsavelColecao().getCod());
            pstm.setInt(5, c.getCategoriaColecao().getCodCategoriaColecao());
            pstm.setInt(6, c.getCodColecao());
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
                Colecao c = new Colecao();
                //Pega os valores da coluna Int com o nome de "cod_colecao" da tabela
                c.setCodColecao(rs.getInt("cod_colecao"));
                //Pega os valores que estão no campo "estacao" da tabela
                c.setEstacaoColecao(rs.getString("estacao"));
                //pega os valores que estão no campo "ano" da tabela
                c.setAnoColecao(rs.getInt("ano"));
                //Pega os valores que estão no campo "pub_alvo" da tabela
                c.setPubAlvoColecao(rs.getString("pub_alvo"));
                c.setFunResponsavelColecao(rs.getInt("cod_funcionario"));
                //Adiciona os valores na lista
                listaCategoriasColecao.add(c);
            }
            //Fecha a conexão e o statement
            ConnectionFactory.closeConnection(con, pstm);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro  no busca: " + ex.getMessage());
            ConnectionFactory.closeConnection(con);
        }
        return listaCategoriasColecao;
    }
}