package br.senai.sc.model.persistencia;

import br.senai.sc.model.negocio.CategoriaProduto;
import br.senai.sc.model.negocio.Colecao;
import br.senai.sc.model.negocio.Fabricante;
import br.senai.sc.model.negocio.Produto;
import br.senai.sc.persistencia.dao.ProdutoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProdutoDaoJDBC implements ProdutoDAO {

    private final String INSERT = "INSERT INTO produtos (cod_categoria, cod_colecao, cod_fabricante, modelo, nome, preco, tamanho, cor, qt_produtos)VALUES(?,?,?,?,?,?,?,?,?)";
    private final String UPDATE = "UPDATE produtos SET cod_categoria = ?, cod_colecao = ?, cod_fabricante = ?, modelo = ?, nome = ?, preco = ?, tamanho = ?, cor = ?, qt_produtos = ? WHERE cod_produto = ?";
    private final String DELETE = "DELETE FROM produtos WHERE cod_produto = ?";
    private final String LIST = "SELECT p.cod_produto, p.nome, p.modelo, p.preco, p.cor, p.tamanho, p.cor, p.qt_produtos, "
            + "cp.cod_categoria, cp.nome AS categoria, cp.descricao, "
            + "f.cod_fabricante, f.nmfantasia, f.cnpj, f.telefone, f.email, f.endereco, "
            + "c.cod_colecao, c.estacao, c.ano, c.pub_alvo, c.cod_funcionario, c.categoria_colecao_cod_categoria FROM produtos p "
            + "LEFT JOIN categoria_produto cp ON (cp.cod_categoria = p.cod_categoria) "
            + "LEFT JOIN colecao c ON (c.cod_colecao = p.cod_categoria) "
            + "LEFT JOIN fabricante f ON (f.cod_fabricante = p.cod_categoria)";
    private final String LISTBYID = "SELECT p.cod_produto, p.nome, p.modelo, p.preco, p.cor, p.tamanho, p.cor, p.qt_produtos, "
            + "cp.cod_categoria, cp.nome AS categoria, cp.descricao, "
            + "f.cod_fabricante, f.nmfantasia, f.cnpj, f.telefone, f.email, f.endereco, "
            + "c.cod_colecao, c.estacao, c.ano, c.pub_alvo, c.cod_funcionario, c.categoria_colecao_cod_categoria FROM produtos p "
            + "LEFT JOIN categoria_produto cp ON (cp.cod_categoria = p.cod_categoria) "
            + "LEFT JOIN colecao c ON (c.cod_colecao = p.cod_categoria) "
            + "LEFT JOIN fabricante f ON (f.cod_fabricante = p.cod_categoria) "
            + "WHERE p.cod_produto = ?";

    @Override
    public boolean insert(Produto p) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
            pstm.setInt(1, p.getCategoria().getCodCategoriaProduto());
            pstm.setInt(2, p.getColecao().getCodColecao());
            pstm.setInt(3, p.getFabricante().getCod());
            pstm.setString(4, p.getModelo());
            pstm.setString(5, p.getNome());
            pstm.setDouble(6, p.getPreco());
            pstm.setString(7, p.getTamanho());
            pstm.setString(8, p.getCor());
            pstm.setInt(9, p.getQtProdutos());
            pstm.execute();
            try (ResultSet rs = pstm.getGeneratedKeys()) {
                if (rs.next()) {
                    p.setCodProduto(rs.getInt(1));
                }
            }
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
            pstm.setInt(1, p.getCategoria().getCodCategoriaProduto());
            pstm.setInt(2, p.getColecao().getCodColecao());
            pstm.setInt(3, p.getFabricante().getCod());
            pstm.setString(4, p.getModelo());
            pstm.setString(5, p.getNome());
            pstm.setDouble(6, p.getPreco());
            pstm.setString(7, p.getTamanho());
            pstm.setString(8, p.getCor());
            pstm.setInt(9, p.getQtProdutos());
            pstm.setInt(10, p.getCodProduto());
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
            System.out.println(LIST);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Produto p = new Produto();

                CategoriaProduto cp = new CategoriaProduto();
                cp.setCodCategoriaProduto(rs.getInt("cod_categoria"));
                cp.setNomeCategoriaProduto(rs.getString("categoria"));
                cp.setDescricaoCategoriaProduto(rs.getString("descricao"));

                Colecao c = new Colecao();
                c.setCodColecao(rs.getInt("cod_colecao"));
                c.setEstacaoColecao(rs.getString("estacao"));
                c.setAnoColecao(rs.getInt("ano"));
                c.setPubAlvoColecao(rs.getString("pub_alvo"));
                c.setFunResponsavelColecao(null);
                c.setCategoriaColecao(null);

                Fabricante f = new Fabricante();
                f.setCod(rs.getInt("cod_fabricante"));
                f.setNmFantasia(rs.getString("nmfantasia"));
                f.setCnpj(rs.getString("cnpj"));
                f.setTelefone(rs.getString("telefone"));
                f.setEmail(rs.getString("email"));
                f.setEndereco(rs.getString("endereco"));

                p.setCodProduto(rs.getInt("cod_produto"));
                p.setCategoria(cp);
                p.setColecao(c);
                p.setFabricante(f);
                p.setNome(rs.getString("nome"));
                p.setModelo(rs.getString("modelo"));
                p.setPreco(rs.getDouble("preco"));
                p.setTamanho(rs.getString("tamanho"));
                p.setCor(rs.getString("cor"));
                p.setQtProdutos(rs.getInt("qt_produtos"));

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

                CategoriaProduto cp = new CategoriaProduto();
                cp.setCodCategoriaProduto(rs.getInt("cod_categoria"));
                cp.setNomeCategoriaProduto(rs.getString("categoria"));
                cp.setDescricaoCategoriaProduto(rs.getString("descricao"));

                Colecao c = new Colecao();
                c.setCodColecao(rs.getInt("cod_colecao"));
                c.setEstacaoColecao(rs.getString("estacao"));
                c.setAnoColecao(rs.getInt("ano"));
                c.setPubAlvoColecao(rs.getString("pub_alvo"));
                c.setFunResponsavelColecao(null);
                c.setCategoriaColecao(null);

                Fabricante f = new Fabricante();
                f.setCod(rs.getInt("cod_fabricante"));
                f.setNmFantasia(rs.getString("nmfantasia"));
                f.setCnpj(rs.getString("cnpj"));
                f.setTelefone(rs.getString("telefone"));
                f.setEmail(rs.getString("email"));
                f.setEndereco(rs.getString("endereco"));

                p.setCodProduto(rs.getInt("cod_produto"));
                p.setCategoria(cp);
                p.setColecao(c);
                p.setFabricante(f);
                p.setNome(rs.getString("nome"));
                p.setModelo(rs.getString("modelo"));
                p.setPreco(rs.getDouble("preco"));
                p.setTamanho(rs.getString("tamanho"));
                p.setCor(rs.getString("cor"));
                p.setQtProdutos(rs.getInt("qt_produtos"));

                return p;
            }
            ConnectionFactory.closeConnection(conn, pstm);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a transação");
        }
        return null;
    }
}
