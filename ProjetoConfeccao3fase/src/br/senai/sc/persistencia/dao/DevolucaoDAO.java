/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.persistencia.dao;

import br.senai.sc.model.negocio.Devolucao;
import java.util.List;

/**
 *
 * @author douglas_ghisleri
 */
public interface DevolucaoDAO {
    
     /**
     * Método responsável pela inserção de uma pessoa 
     * na base de dados
     * @author Rosicléia Frasson
     * @version 1.0 09/09/13
     * @param d
     * @return 
     */
    boolean insert(Devolucao d);
    
    /**
     * Método responsável pela atualização de uma pessoa
     * na base de dados
     * @author Rosicléia Frasson
     * @version 1.0 09/09/13
     * @param d
     * @return 
     */
    boolean update(Devolucao d);
    
    /**
     * Método responsável pela remoção de uma pessoa na
     * base de dados
     * @author Rosicléia Frasson
     * @version 1.0 09/09/13
     * @param id
     * @return 
     */
    boolean delete (int id);
    
    /**
     * Método responsável pela listagem de todas as 
     * pessoas cadastradas na base de dados
     * @author Rosicléia Frasson
     * @version 1.0 09/09/13
     * @return 
     */
    List<Devolucao> listAll();
    
    /**
     * Método responsável por buscar uma pessoa na base de
     * dados através de um id
     * @author Rosicléia Frasson
     * @version 1.0 09/09/13
     * @param id
     * @return 
     */
    Devolucao listById(int id);
    
    
}
