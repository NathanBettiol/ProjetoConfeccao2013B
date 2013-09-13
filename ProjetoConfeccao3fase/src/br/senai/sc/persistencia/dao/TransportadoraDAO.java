package br.senai.sc.persistencia.dao;

import br.senai.sc.model.negocio.Transportadora;
import java.util.List;

/**
 * Interface responsável pela declaração dos métodos relacionados
 *
 * @author wesley_s
 */
public interface TransportadoraDAO {

    /*
     * Método responsável pela inserção de uma transportadora na base de dados
     * @author Wesley Batista
     * @version 1.0 09/09/13
     * @param t
     * @return
     */
    boolean insert(Transportadora t);

    /*
     * Método responsável pela atualização de uma transportadora na base de 
     * dados
     * @author Wesley Batista
     * @version 1.0 09/09/13
     * @param t
     * @return
     */
    boolean update(Transportadora t);

    /*
     * Método responsável pela remoção de uma transportadora na base de dados
     * @author Wesley Batista
     * @version 1.0 09/09/13
     * @param id
     * @return
     */
    boolean delete(int id);

    /*
     * Método responsável pela listagem de todas as transportadoras cadastradas 
     * na base de dados
     * @author Wesley Batista
     * @version 1.0 09/09/13
     * @param
     * @return
     */
    List<Transportadora> listAll();

    /*
     * Método responsável por buscar uma transportadora na base de dados
     * através de um id
     * @author Wesley Batista
     * @version 1.0 09/09/13
     * @param id
     * @return
     */
    Transportadora listById(int id);
}
