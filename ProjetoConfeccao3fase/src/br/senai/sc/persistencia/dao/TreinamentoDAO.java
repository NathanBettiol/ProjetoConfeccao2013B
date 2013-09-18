
package br.senai.sc.persistencia.dao;

import br.senai.sc.model.negocio.Treinamento;
import java.util.List;

 /**
 * Interface responsável pela declaração dos métodos 
 * relacionados a persistencia da classe Treinamento
 * @author Bruna Zakrzeski
 */

public interface TreinamentoDAO {
    



    
    
  /**
   * Método responsável pela inserção de um treinamento
   * @author Bruna Zakrzeski
   * @version 1.0 09/09/13
   * @param treina
   * @return 
   */
    
    boolean insert(Treinamento treina);
    
    
    
    
  /**
   * Método responsável pela alteração de um treinamento
   * @author Bruna Zakrzeski
   * @version 1.0 09/09/13
   * @param treina
   * @return 
   */
    
    boolean update(Treinamento treina);
    
    
    
    
  /**
   * Método responsável pela remoção de um treinamento
   * @author Bruna Zakrzeski
   * @version 1.0 09/09/13
   * @param treina
   * @return 
   */
    
    boolean delete(int id);
    
    
    
    
  /**
   * Método responsável pela listagem de todo treinamento
   * @author Bruna Zakrzeski
   * @version 1.0 09/09/13
   * @param treina
   * @return 
   */
    
    List<Treinamento> listAll();
    
    
    
}
    

