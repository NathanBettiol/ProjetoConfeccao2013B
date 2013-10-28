package br.senai.sc.persistencia.dao;

import br.senai.sc.model.negocio.Funcionario;
import java.util.List;

/**
 * @version 1.0 21/09/2013
 * @author patricia_gageiro
 */
public interface FuncionarioDAO {

    /*
     * Método responsável pela inserção de um funcionário.
     * @version 1.0 16/09/2013
     * @author Patricia Gageiro
     * @param p
     * @return
     * 
     */
    boolean insert(Funcionario fun);

    /*
     * Método responsável pela atualização de um funcionário.
     * @version 1.0 16/09/2013
     * @author Patricia Gageiro
     * @param p
     * @return
     * 
     */
    boolean update(Funcionario fun);


    /*
     * Método responsável pela deleção de um funcionário.
     * @version 1.0 16/06/2013
     * @author Patricia Gageiro
     * @param p
     * @return
     */
    boolean delete(Funcionario fun);

    
    /*
     * Método responsável pela listagem por id dos funcionários.
     * @version 1.0 16/09/2013
     * @author Patricia Gageiro
     * @param p
     * @return
     */
    Funcionario listById(int id);

    public List<Funcionario> listAll();
    
    List<Funcionario> ListPesquisa(String texto);

}
