/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.persistencia.dao;

import br.senai.sc.model.negocio.TipoFisico;
import java.util.List;

/**
 * Interface responsável pela declaração dos métodos relacionados a persistência
 * da classe TipoFisico
 *
 * @author gustavo_lourenco
 * @version 1.0 16/09/2013
 */
public interface TipoFisicoDAO {

    /*
     * Método responsável pela inserção de um tipo fisico na base de dados
     * @author gustavo_lourenco
     * @version 1.0 16/09/2013
     */
    boolean insert(TipoFisico tf);

    /*
     * Método responsável pela atualização de um tipo fisico na base de dados
     * @author gustavo_lourenco
     * @version 1.0 16/09/2013
     */
    boolean update(TipoFisico tf);

    /*
     * Método responsável pela remoção de um tipo fisico na base de dados
     * @author gustavo_lourenco
     * @version 1.0 16/09/2013
     */
    boolean delete(int id);

    /*
     * Método responsável pela listagem dos tipos fisicos na base de dados
     * @author gustavo_lourenco
     * @version 1.0 16/09/2013
     */
    List<TipoFisico> listall();
}
