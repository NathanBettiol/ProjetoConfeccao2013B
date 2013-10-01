/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.model.persistencia;

import br.senai.sc.model.negocio.CategoriaProduto;
import br.senai.sc.model.negocio.Entrada;
import br.senai.sc.model.negocio.Fabricante;
import br.senai.sc.model.negocio.Funcionario;
import br.senai.sc.model.negocio.NotaFiscal;
import br.senai.sc.model.negocio.Produto;
import br.senai.sc.persistencia.dao.EntradaDAO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author nathan_bettiol
 */
 
 /* classe EntradaDaoJDBC que sera responsavel pela inserção, atualização, remoção, e lista dos registros  */
public class EntradaDaoJDBC implements EntradaDAO {


//Comando SLQ que insere um registro no banco de dados 
     private final String INSERT = "insert into entrada(data_emissao, id_funcionario, id_produto ,quantidade, preco , id_notaFiscal) "
            + "values (?, ?, ?, ?, ?, ?)";

//Comando SLQ que atualiza um registro no banco de dados           
    private final String UPDATE = "update entrada set data_emissao = ?, id_funcionario = ?, id_produto = ?, quantidade = ?, preco = ?, id_notaFiscal = ? where cod_entrada = ?";

//Comando SLQ que remove um registro no banco de dados    
    private final String DELETE = "delete from entrada where cod_entrada = ?";

//Comando SLQ que lista os registro do banco de dados
    private final String LIST = "select * from entrada,funcionario"
            + "where id_funcionario = cod_funcionario";
           
    
    
    
 //inserir um registro no banco de dados   
    @Override
    public boolean insert(Entrada e) {
        Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(INSERT);

            
            pstm.setDate(1, new java.sql.Date(e.getDtEmissao().getTime()));
            pstm.setInt(2, e.getFuncionario().getCod());
            pstm.setInt(3, e.getProduto().getCodProduto());
            pstm.setInt(4, e.getQtProduto());
            pstm.setDouble(5, e.getPreco());
            pstm.setInt(6, e.getNotaFiscal().getCodNumero());
            
           
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Inserção efetuada com "
                    + "sucesso");
            ConnectionFactory.closeConnection(conn, pstm);
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a "
                    + "Inserção" + ex.getMessage());
            return false;
        }
    }


//atualiza um registro no banco de dados
    @Override
    public boolean update(Entrada e) {
          Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(UPDATE);

            
            pstm.setDate(1, (Date) new java.sql.Date(e.getDtEmissao().getTime()));
            pstm.setInt(2, e.getFuncionario().getCod());
            pstm.setInt(3, e.getProduto().getCodProduto());
            pstm.setInt(4, e.getQtProduto());
            pstm.setDouble(5, e.getPreco());
            pstm.setInt(6, e.getNotaFiscal().getCodNumero());
            pstm.setInt(7, e.getCodigo());
            
           
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Atualização efetuada com "
                    + "sucesso");
            ConnectionFactory.closeConnection(conn, pstm);
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a "
                    + "Atualização" + ex.getMessage());
            return false;
        }
    }

//remove um registro no banco de dados
    @Override
    public boolean delete(int codigoEntrada) {
            Connection conn;
        try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(DELETE);

            pstm.setInt(1, codigoEntrada);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Mudança efetuada com "
                    + "sucesso");
            ConnectionFactory.closeConnection(conn, pstm);
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a "
                    + "mudança");
            return false;
        }
    }

//inserir um registro no banco de dados
    @Override
    public List<Entrada> listAll() {
      List<Entrada> entradas = new ArrayList<>();
         Connection conn;
          try {
            conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(LIST);
                
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Entrada e = new Entrada();
                e.setDtEmissao(rs.getDate("data_emissao"));
                
                Funcionario f = new Funcionario();
                
                f.setCod(rs.getInt("id_funcionario"));
                f.setLogin(rs.getString("login"));
                f.setEmail(rs.getString("email"));
                f.setCtps(rs.getString("ctps"));
                f.setCargo(rs.getString("cargo"));
                f.setSalario(rs.getDouble("salario"));
                f.setDtAdimissao(new java.sql.Date(e.getDtEmissao().getTime()));
                f.setDtRecisao(new java.sql.Date(e.getDtEmissao().getTime()));
                
                NotaFiscal n = new NotaFiscal();
                
                n.setCodNumero(rs.getInt("cod_nota_fiscal"));
                n.setDataEmissao(new java.sql.Date(e.getDtEmissao().getTime()));
                n.setProdutos(rs.getString("produtos"));
                n.setValorTotal(rs.getDouble("vl_total"));
                n.setDestinatario(rs.getString("destinatario"));
                n.setRemetente(rs.getString("remetente"));
                n.setFuncionarioResponsavel(rs.getInt("cod_funcionario"));
                
           
                e.setFuncionario(f);
                e.setNotaFiscal(n);
                e.setPreco(rs.getDouble("preco"));
                
                Produto p = new Produto();
                p.setCodProduto(rs.getInt("cod_produto"));
                
                CategoriaProduto c = new CategoriaProduto();
                c.setCodCategoriaProduto(Integer.parseInt("Digite o Codigo da categoria :")); 
                p.setCategoria(c);

                Fabricante fa = new Fabricante();
                fa.setCod(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do Fabricante: ")));
                
                p.setFabricante(fa);
                p.setModelo(rs.getString("modelo"));
                p.setPreco(rs.getDouble("preco"));
                p.setTamanho(rs.getString("tamanho"));
                p.setCor(rs.getString("descricao"));
                e.setProduto(p);
                e.setQtProduto(rs.getInt("quantidade"));
                
                entradas.add(e);
                 }
            ConnectionFactory.closeConnection(conn, pstm);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a "
                    + "transação: " + e.getMessage());
        }
        return entradas;
    }
    
}
