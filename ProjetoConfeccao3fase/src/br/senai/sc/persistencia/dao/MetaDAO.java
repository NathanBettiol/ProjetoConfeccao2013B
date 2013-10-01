package br.senai.sc.persistencia.dao;

import br.senai.sc.model.negocio.Meta;
import java.util.List;

/**
 *
 * @author douglas_ghisleri
 */
public interface MetaDAO {
    /**
     * Método responsável pela inserção de um endereço 
     * na base de dados
     * @author douglas_ghisleri
     * @version 1.0 09/09/13
     * @param m
     * @return 
     */
    boolean insert(Meta m);
    
    /**
     * Método responsável pela atualização de um endereço
     * na base de dados
     * @author douglas_ghisleri
     * @version 1.0 09/09/13
     * @param m
     * @return 
     */
    boolean update(Meta m);
    
    /**
     * Método responsável pela remoção de um endereço na
     * base de dados
     * @author douglas_ghisleri
     * @version 1.0 09/09/13
     * @param cod_meta
     * @return 
     */
    boolean delete (int cod_meta);
    
    /**
     * Método responsável pela listagem de todas os
     * endereços cadastrados na base de dados
     * @author douglas_ghisleri
     * @version 1.0 09/09/13
     * @return 
     */
    List<Meta> listAll();
    
    /**
     * Método responsável por buscar um endereço na base de
     * dados através de um id
     * @author douglas_ghisleri
     * @version 1.0 09/09/13
     * @param cod_meta
     * @return 
     */
    Meta listById(int cod_meta);
}
