package br.senai.sc.model.persistencia;

import br.senai.sc.model.negocio.Produto;
import br.senai.sc.persistencia.dao.ProdutoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProdutosDaoJDBC implements ProdutoDAO {

    //private final String INSERT = "INSERT INTO produtos(cod_categoria, cod_colecao, cod_fabricante, modelo, preco, tamanho, cor) values (?,?,?,?,?,?,?)";
    //private final String UPDATE = "UPDATE produtos SET cod_categoria = ?, cod_colecao = ?, cod_fabricante = ?, modelo = ?, preco = ?, tamanho = ?, cor = ? WHERE cod_produto = ?";
    private final String INSERT = "INSERT INTO produtos(modelo, nome, preco, tamanho, cor, qt_produto) values (?,?,?,?,?,?)";
    private final String UPDATE = "UPDATE produtos SET modelo = ?, nome = ?, preco = ?, tamanho = ?, cor = ?, qt_produto = ? WHERE cod_produto = ?";
    private final String DELETE = "DELETE FROM produtos WHERE cod_produto = ?";
    private final String LIST = "SELECT * FROM produto";
    private final String LISTBYID = "SELECT * FROM produto WHERE cod_produto = ?";

    @Override
    public boolean insert(Produto p) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(INSERT);
            pstm.setString(1, p.getModelo());
            pstm.setString(2, p.getNome());
            pstm.setDouble(3, p.getPreco());
            pstm.setString(4, p.getTamanho());
            pstm.setString(5, p.getCor());
            pstm.setInt(6, p.getQtProdutos());
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Transação efetuada com sucesso");
            ConnectionFactory.closeConnection(conn, pstm);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a transação" + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean update(Produto p) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(UPDATE);
            pstm.setString(1, p.getModelo());
            pstm.setString(2, p.getNome());
            pstm.setDouble(3, p.getPreco());
            pstm.setString(4, p.getTamanho());
            pstm.setString(5, p.getCor());
            pstm.setInt(6, p.getQtProdutos());
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Transação efetuada com sucesso");
            ConnectionFactory.closeConnection(conn, pstm);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a transação");
            return false;
        }
    }

    @Override
    public boolean delete(int codProduto) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(DELETE);

            pstm.setInt(1, codProduto);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Transação efetuada com sucesso");
            ConnectionFactory.closeConnection(conn, pstm);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a transação" + e.getMessage());
            return false;
        }
    }

    @Override
    public List<Produto> listAll() {
        Connection conn;
        List<Produto> produtos = new ArrayList<>();
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(LIST);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Produto p = new Produto();
                p.setCodProduto(rs.getInt("cod_produto"));
                p.setNome(rs.getString("nome"));
                p.setModelo(rs.getString("modelo"));
                p.setPreco(rs.getDouble("preco"));
                p.setTamanho(rs.getString("tamanho"));
                p.setCor(rs.getString("cor"));
                p.setQtProdutos(rs.getInt("qt_produto"));
                produtos.add(p);
            }
            ConnectionFactory.closeConnection(conn, pstm);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a transação");
        }
        return produtos;
    }

    @Override
    public Produto listById(int codProduto) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(LISTBYID);
            pstm.setInt(1, codProduto);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Produto p = new Produto();
                p.setCodProduto(rs.getInt("cod_produto"));
                p.setNome(rs.getString("nome"));
                p.setModelo(rs.getString("modelo"));
                p.setPreco(rs.getDouble("preco"));
                p.setTamanho(rs.getString("tamanho"));
                p.setCor(rs.getString("cor"));
                p.setQtProdutos(rs.getInt("qt_produto"));
                return p;
            }
            ConnectionFactory.closeConnection(conn, pstm);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a transação");
        }
        return null;
    }
}
