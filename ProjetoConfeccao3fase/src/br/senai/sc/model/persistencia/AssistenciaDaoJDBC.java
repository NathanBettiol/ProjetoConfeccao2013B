package br.senai.sc.model.persistencia;

import br.senai.sc.model.negocio.Assistencia;
import br.senai.sc.persistencia.dao.AssistenciaDAO;
import java.util.List;

/**
 * Classe responsável pela persistência da entidade assistência na base de
 * dados
 * @author wesley_s
 */
public class AssistenciaDaoJDBC implements AssistenciaDAO {

    @Override
    public boolean insert(Assistencia a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Assistencia a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int cod) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Assistencia> listAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
