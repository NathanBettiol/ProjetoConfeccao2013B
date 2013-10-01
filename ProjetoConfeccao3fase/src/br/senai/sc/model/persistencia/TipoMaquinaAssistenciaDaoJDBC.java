/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.model.persistencia;

import br.senai.sc.model.negocio.TipoFisico;
import br.senai.sc.persistencia.dao.TipoFisicoDAO;
import java.util.List;

/**
 *
 * @author gabriel_arsenio
 */
public class TipoMaquinaAssistenciaDaoJDBC implements TipoFisicoDAO{

    @Override
    public boolean insert(TipoFisico tf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(TipoFisico tf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TipoFisico> listall() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
