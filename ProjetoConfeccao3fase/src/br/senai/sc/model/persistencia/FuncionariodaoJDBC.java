package br.senai.sc.model.persistencia;

import br.senai.sc.model.negocio.Funcionario;
import br.senai.sc.persistencia.dao.FuncionarioDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * @version 1.0 16/09/2013
 * @author Patricia Gageiro
 */
public class FuncionariodaoJDBC implements FuncionarioDAO {

    private static final String INSERT = "insert into funcionario( nome, cpf, rg, telefone,  dt_nascimento, endereco,  login, email, ctps, cargo, salario, dt_cadastro, dt_adimissao, dt_recisao) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    private static final String UPDATE = "update funcionario set nome = ? , cpf = ? , rg = ?,telefone = ?,  dt_nascimento = ?, login = ?, email = ?, ctps = ?, cargo = ?, salario = ?,dt-cadastro = ?,  dt_adimissao = ?, dt_recisao = ? where cod_funcionario = ?";
    private static final String DELETE = "delete from funcionario where cod_funcionario = ?";
    private static final String LIST = "select * from funcionario";
    private static final String LISTBYID = "select * from funcionario where cod_funcionario = ?";

    public boolean insert(Funcionario fun) {
        Connection con;

        try {
            con = ConnectionFactory.getConnection();
            PreparedStatement pstm = con.prepareStatement(INSERT);
            pstm.setString(1, fun.getNome());
            pstm.setString(2, fun.getCpf());
            pstm.setString(3, fun.getRg());
            pstm.setString(4, fun.getTelefone().toString());

            pstm.setDate(5, new java.sql.Date(fun.getDtNascimento().getTime()));
            pstm.setString(6, fun.getEndereco());

            pstm.setString(7, fun.getLogin());
            pstm.setString(8, fun.getEmail());
            pstm.setString(9, fun.getCtps());
            pstm.setString(10, fun.getCargo());
            pstm.setString(11, Double.toString(fun.getSalario()));
            pstm.setDate(12, new java.sql.Date(fun.getDtCadastro().getTime()));
            pstm.setDate(13, new java.sql.Date(fun.getDtAdimissao().getTime()));
            pstm.setDate(14, new java.sql.Date(fun.getDtRecisao().getTime()));
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Transação efetuada com sucesso");
            ConnectionFactory.closeConnection(con, pstm);
            return true;

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a transação" + ex.getMessage());
            return false;
        }
    }

    public boolean update(Funcionario fun) {
        Connection con;

        try {
            con = ConnectionFactory.getConnection();
            PreparedStatement pstm = con.prepareStatement(UPDATE);

            pstm.setString(1, fun.getNome());
            pstm.setString(2, fun.getCpf());
            pstm.setString(3, fun.getRg());
            pstm.setString(4, fun.getTelefone().toString());
            pstm.setDate(5, new java.sql.Date(fun.getDtNascimento().getTime()));
            pstm.setString(6, fun.getLogin());
            pstm.setString(7, fun.getEmail());
            pstm.setString(8, fun.getCtps());
            pstm.setString(9, fun.getCargo());
            pstm.setString(10, Double.toString(fun.getSalario()));
            pstm.setDate(11, new java.sql.Date(fun.getDtCadastro().getTime()));
            pstm.setDate(12, new java.sql.Date(fun.getDtAdimissao().getTime()));
            pstm.setDate(13, new java.sql.Date(fun.getDtRecisao().getTime()));
            pstm.setInt(14, fun.getCod());
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Transação efetuada com sucesso");
            return true;

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a transação" + ex.getMessage());
            return false;
        }
    }

    public boolean delete(Funcionario fun) {
        Connection con;

        try {
            con = ConnectionFactory.getConnection();
            PreparedStatement pstm = con.prepareStatement(DELETE);
            pstm.setInt(1, fun.getCod());
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Transação efetuada com sucesso");
            return true;

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a transação" + ex.getMessage());
            return false;
        }
    }

    public Funcionario listById(int id) {
        Connection con;

        try {

            con = ConnectionFactory.getConnection();
            PreparedStatement pstm = con.prepareStatement(LISTBYID);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Funcionario fun = new Funcionario();
                fun.setCod(rs.getInt("cod_funcionario"));
                fun.setLogin(rs.getString("Login"));
                fun.setEmail(rs.getString("Email"));
                fun.setCtps(rs.getString("Ctps"));
                fun.setCargo(rs.getString("Cargo"));
                fun.setSalario(rs.getDouble("Salário"));
                fun.setDtAdimissao(rs.getDate("Data de adimissão"));
                fun.setDtRecisao(rs.getDate("Data de recisão"));
                return fun;

            }

            ConnectionFactory.closeConnection(con, pstm);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a transação" + ex.getMessage());
        }

        return null;

    }

    @Override
    public List<Funcionario> listAll() {
        Connection con;
        List<Funcionario> funcionarios = new ArrayList<>();


        try {
            con = ConnectionFactory.getConnection();
            PreparedStatement pstm = con.prepareStatement(LIST);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Funcionario fun = new Funcionario();
                fun.setCod(rs.getInt("cod_funcionario"));
                fun.setNome(rs.getString("nome"));
                fun.setEmail(rs.getString("email"));
                fun.setTelefone(rs.getString("telefone"));
                

                funcionarios.add(fun);

            }
            ConnectionFactory.closeConnection(con, pstm);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar a transação" + ex.getMessage());

        }
        return funcionarios;
    }
}
