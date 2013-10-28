package br.senai.sc.persistencia.dao;
import br.senai.sc.model.negocio.Fabricante;
import java.util.List;

public interface FabricanteDAO {
    
    /*
     * Método responsável pela inserção do Fabricante
     * @author Mateus Generoso
     * @version 1.0 16/09/2013
     * @param p
     * @return
     */
    boolean insert(Fabricante fab);
    
    /*
     * Método responsável pela alteração do Fabricante
     * @author Mateus Generoso
     * @version 1.0 16/09/2013
     * @param p
     * @return
     */
    boolean update(Fabricante fab);
   
    /*
     * Método responsável pela deleção do Fabricante com base no cod recebido por parametro
     * @author Mateus Generoso
     * @version 1.0 16/09/2013
     * @param p
     * @return
     */
    boolean delete(int codFabricante);
     
    /*
     * Método responsável pela listagem de todos os Fabricantes
     * @author Mateus Generoso
     * @version 1.0 16/09/2013
     * @param p
     * @return
     */
    List<Fabricante> listAll();
    
    /*
     * Método responsável pela listagem do Fabricante com base no cod recebido por parametro
     * @author Mateus Generoso
     * @version 1.0 16/09/2013
     * @param p
     * @return
     */
    Fabricante listById(int codFabricante);
}
