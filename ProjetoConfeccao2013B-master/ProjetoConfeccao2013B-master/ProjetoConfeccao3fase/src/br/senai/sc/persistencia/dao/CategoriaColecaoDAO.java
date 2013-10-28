package br.senai.sc.persistencia.dao;

import br.senai.sc.model.negocio.CategoriaColecao;
import java.sql.SQLException;
import java.util.List;

/**
 * Interface da classe CategoriaColecaoDaoJDBC.
 *
 * @version 1.0 01/10/2013
 * @author Gabriel Arsênio
 */
public interface CategoriaColecaoDAO {

    /**
     * Método para atualizar categoria de coleção.
     *
     * @author Gabriel Arsênio
     * @version 1.0 01/10/2013
     * @param cc
     * @return
     */
    boolean update(CategoriaColecao cc) throws SQLException;

    /**
     * Método para deletar categoria de coleção.
     *
     * @author Gabriel Arsênio
     * @version 1.0 01/10/2013
     * @param cod
     * @return
     */
    boolean delete(int cod) throws SQLException;

    /**
     * Método para listar todas as categorias de coleção.
     *
     * @author Gabriel Arsênio
     * @version 1.0 01/10/2013
     * @param cc
     * @return
     */
    List<CategoriaColecao> listAll() throws SQLException;

    /**
     * Método para cadastrar uma nova categoria de coleção.
     *
     * @author Gabriel Arsênio
     * @version 1.0 01/10/2013
     * @param cc
     * @return
     */
    boolean insert(CategoriaColecao cc) throws SQLException;
}
