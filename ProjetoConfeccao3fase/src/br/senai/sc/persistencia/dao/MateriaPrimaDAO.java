
package br.senai.sc.persistencia.dao;

import br.senai.sc.model.negocio.MateriaPrima;
import java.util.List;

/**
 *
 * @author leticia_jesus
 * @version 1.0 20/09/2013
 */
public interface MateriaPrimaDAO {
    
     boolean insert(MateriaPrima mp);
    /*
     * Método responsável pela atualização de uma matéria-prima. 
     * @author LetíciaJRibeiro
     * @version 1.0 13/09/2013
     * @param p
     * @return
     */
    boolean update(MateriaPrima mp);
    /*
     * Método responsável pela remoção de uma matéria-prima.
     * @author LetíciaJRibeiro
     * @version 1.0 13/09/2013
     * @param id
     * @return
     */
    boolean delete(int codMateriaPrima);
    /*
     * Método responsável pela listagem de todas as matéria-prima. 
     * @author LetíciaJRibeiro
     * @version 1.0 13/09/2013
     * @param p
     * @return
     */
    List<MateriaPrima> listAll();
    /*
     * Método responsável pela listagem de matéria-prima  com o codigo enviado pelo parametro.
     * @author LetíciaJRibeiro
     * @version 1.0 13/09/2013
     * @param p
     * @return
     */
    MateriaPrima listById(int codMateriaPrima);
}



    


