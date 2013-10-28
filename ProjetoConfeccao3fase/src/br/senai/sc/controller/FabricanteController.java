package br.senai.sc.controller;

import br.senai.sc.model.negocio.Fabricante;
import br.senai.sc.model.persistencia.FabricanteDaoJDBC;
import br.senai.sc.persistencia.dao.FabricanteDAO;
import java.util.List;

/**
 *
 * @author Mateus Generoso
 * @version 1.0 28/10/2013
 */
public class FabricanteController {
    
        public List<Fabricante> listAll() {
        FabricanteDAO dao = new FabricanteDaoJDBC();
        return dao.listAll();
    }

    public boolean insert(Fabricante fab) {
        FabricanteDAO dao = new FabricanteDaoJDBC();
        return dao.insert(fab);
    }

    public boolean update(Fabricante fab) {
        FabricanteDAO dao = new FabricanteDaoJDBC();
        return dao.update(fab);
    }

    public boolean delete(int codFabricante) {
        FabricanteDAO dao = new FabricanteDaoJDBC();
        return dao.delete(codFabricante);
    }
}
