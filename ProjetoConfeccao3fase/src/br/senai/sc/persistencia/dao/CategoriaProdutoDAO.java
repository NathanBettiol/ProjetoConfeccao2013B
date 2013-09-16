package br.senai.sc.persistencia.dao;

import br.senai.sc.model.negocio.CategoriaProduto;
import java.util.List;

public interface CategoriaProdutoDAO {

    /**
     * Método responsável pela inserção de uma categoria de produto.
     *
     * @author Gustavo Motta
     * @version 1.0 16/09/2013
     * @param CP
     * @return
     */
    boolean insert(CategoriaProduto CP);

    /**
     * Método responsável pela atualização de uma categoria de produto.
     *
     * @author Gustavo Motta
     * @version 1.0 16/09/2013
     * @param CP
     * @return
     */
    boolean update(CategoriaProduto CP);

    /**
     * Método responsável pela remoção de uma categoria de produto.
     *
     * @author Gustavo Motta
     * @version 1.0 16/09/2013
     * @param codCategoriaProduto
     * @return
     */
    boolean delete(int codCategoriaProduto);

    /**
     * Método responsável pela listagem de todas as categoria de produto.
     *
     * @author Gustavo Motta
     * @version 1.0 16/09/2013
     * @return
     */
    List<CategoriaProduto> listAll();

    /**
     * Método responsável pela listagem de categoria de produto.
     *
     * @author Gustavo Motta
     * @version 1.0 16/09/2013
     * @param codCategoriaProduto
     * @return
     */
    CategoriaProduto listById(int codCategoriaProduto);
}
