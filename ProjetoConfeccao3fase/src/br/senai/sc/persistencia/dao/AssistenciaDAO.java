package br.senai.sc.persistencia.dao;

import br.senai.sc.model.negocio.Assistencia;
import java.util.List;

/**
 * Interface responsável pela declaração dos métodos relacionados a manipulação
 * da classe Assistencia no banco de dados
 *
 * @author wesley_s
 */
public interface AssistenciaDAO {

//------------------------------------------------------------------------------
    /**
     * Método responsável pela inserção de uma assistência na base de dados
     *
     * @author Wesley Batista
     * @version 1.0 09/09/13
     * @param a
     * @return
     */
    boolean insert(Assistencia a);

//------------------------------------------------------------------------------
    /**
     * Método responsável pela atualização de uma assistência na base de dados
     *
     * @author Wesley Batista
     * @version 1.0 09/09/13
     * @param a
     * @return
     */
    boolean update(Assistencia a);

//------------------------------------------------------------------------------
    /**
     * Método responsável pela remoção de uma assistência na base de dados
     *
     * @author Wesley Batista
     * @version 1.0 09/09/13
     * @param cod
     * @return
     */
    boolean delete(int cod);

//------------------------------------------------------------------------------
    /**
     * Método responsável pela listagem de todas as assistências cadastradas na
     * base de dados
     *
     * @author Wesley Batista
     * @version 1.0 09/09/13
     * @param
     * @return
     */
    List<Assistencia> listAll();
}