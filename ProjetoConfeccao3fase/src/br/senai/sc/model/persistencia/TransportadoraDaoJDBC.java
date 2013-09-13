package br.senai.sc.model.persistencia;

import br.senai.sc.model.negocio.Transportadora;
import br.senai.sc.persistencia.dao.TransportadoraDAO;
import java.util.List;

/**
 * Classe responsável pela persistência da entidade transportadora na base de
 * dados
 *
 * @author wesley_s
 */
public class TransportadoraDaoJDBC implements TransportadoraDAO {

    private final String INSERT = "insert into transportadora(nmFantasia, "
            + "razaoSocial, cnpj, endereco, telefone, contato, email, paginaWeb)"
            + " values (?, ?, ?)";
    private final String UPDATE = "update transportadora set nmFantasia = ?, "
            + "razaoSocial = ?, cnpj = ?, endereco = ?, telefone = ?, "
            + "contato = ?, email = ?, paginaWeb = ? where cod = ?";
    private final String DELETE = "delete from transportadora where cod = ?";
    private final String LIST = "select * from transportadora";
    private final String LISTBYID = "select * from transportadora "
            + "where cod = ?";

    @Override
    public boolean insert(Transportadora t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Transportadora t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Transportadora> listAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Transportadora listById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
