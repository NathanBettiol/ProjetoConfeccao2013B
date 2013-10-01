package br.senai.sc.persistencia.dao;

import br.senai.sc.model.negocio.Colecao;
import java.sql.SQLException;
import java.util.List;

/**
 * Interface da classe ColecaoDaoJDBC.
 * 
 * @author Gabriel Arsênio
 * @version 1.0 01/10/2013
 */
public interface ColecaoDAO {
    
    /**
     * Método para cadastrar uma nova coleção.
     *
     * @author Gabriel Arsênio
     * @version 1.0 01/10/2013
     * @param c
     * @return
     */
    boolean insert(Colecao c) throws SQLException;
    
    /**
     * Método para atualizar coleção.
     *
     * @author Gabriel Arsênio
     * @version 1.0 01/10/2013
     * @param c
     * @return
     */
    boolean update(Colecao c) throws SQLException;
    
    /**
     * Método para deletar uma coleção.
     *
     * @author Gabriel Arsênio
     * @version 1.0 01/10/2013
     * @param cod
     * @return
     */
    boolean delete(int cod) throws SQLException;
    
    /**
     * Método para listar todas as coleções.
     *
     * @author Gabriel Arsênio
     * @version 1.0 01/10/2013
     * @param c
     * @return
     */
    List<Colecao> listAll() throws SQLException;
}
