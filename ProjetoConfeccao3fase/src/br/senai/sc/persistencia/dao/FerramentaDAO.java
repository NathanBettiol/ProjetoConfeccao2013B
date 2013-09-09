/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.persistencia.dao;

import br.senai.sc.model.negocio.Ferramenta;
import br.senai.sc.model.negocio.Pessoa;
import java.util.List;

/**
 *
 * @author ariane_souza
 */
public interface FerramentaDAO {
     /*
     * Método responsável pela inserção de uma ferramenta
     * @author Ariane Souza da Silva
     * @version 1.0 09/09/2013
     * @param p
     * @return
     */
    boolean insert(Ferramenta f);
    /*
     * Método responsável pela atualização de uma ferramenta
     * @author Ariane Souza da Silva
     * @version 1.0 09/09/2013
     * @param p
     * @return
     */
    boolean update(Ferramenta f);
    /*
     * Método responsável pela remoção de uma ferramenta
     * @author Ariane Souza da Silva
     * @version 1.0 09/09/2013
     * @param id
     * @return
     */
    boolean delete(int codFerramenta);
    /*
     * Método responsável pela listagem de todas as ferramentas
     * @author Ariane Souza da Silva
     * @version 1.0 09/09/2013
     * @param p
     * @return
     */
    List<Pessoa> listAll();
    /*
     * Método responsável pela listagem de ferramnetas com o codigo enviado pelo parametro
     * @author Ariane Souza da Silva
     * @version 1.0 09/09/2013
     * @param p
     * @return
     */
    Pessoa listById(int codFerramenta);
}


