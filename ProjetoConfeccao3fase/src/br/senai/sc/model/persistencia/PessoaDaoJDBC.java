package br.senai.sc.model.persistencia;


import br.senai.sc.model.negocio.Pessoa;
import br.senai.sc.persistencia.dao.PessoaDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author patricia_gageiro
 */
public class PessoaDaoJDBC implements PessoaDAO {
    private static final String LIST = "select * from pessoa";
    
    public List<Pessoa> listAll(){
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<Pessoa> pessoas = new ArrayList<>();
        
        try{
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(LIST);
            rs = pstm.executeQuery();
            
            while(rs.next()){
//                Pessoa p = new Pessoa();
//                p.setCodigo(rs.getInt("codigo"));
//                p.setNome(rs.getString("nome"));
//                p.setTelefone(rs.getString("Telefone"));
//                pessoas.add(p);
            }
        }catch(Exception e ){
            JOptionPane.showMessageDialog(null, "Erro ao listar as pessoas " + e.getMessage());
        }finally{
            try{                   
            ConnectionFactory.closeConnection(con, pstm, rs);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão" + e.getMessage());
            }
    }
        return pessoas;
    }
}
