/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.persistencia.dao;

import br.senai.sc.model.negocio.Medida;
import java.util.List;

/**
 *
 * @author gustavo_lourenco
 */
public interface MedidaDAO {
    
    /*
     * Método responsável pela inserção de uma medida na base de dados
     * @author gustavo_lourenco
     * @version 1.0 16/09/2013
     */
    boolean insert(Medida m);

    /*
     * Método responsável pela atualização de uma medida na base de dados
     * @author gustavo_lourenco
     * @version 1.0 16/09/2013
     */
    boolean update(Medida m);

    /*
     * Método responsável pela remoção de uma medida na base de dados
     * @author gustavo_lourenco
     * @version 1.0 16/09/2013
     */
    boolean delete(int id);

    /*
     * Método responsável pela listagem das medida na base de dados
     * @author gustavo_lourenco
     * @version 1.0 16/09/2013
     */
    List<Medida> listall();
}
