/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.persistencia.dao;

import br.senai.sc.model.negocio.TipoFisico;
import java.util.List;

/**
 *
 * @author gustavo_lourenco
 */
public interface TipoFisicoDAO {
    
    boolean insert (TipoFisico tf);
    
    boolean update (TipoFisico tf);
    
    boolean delete (int id);
    
    List<TipoFisico> listall();
    
}
