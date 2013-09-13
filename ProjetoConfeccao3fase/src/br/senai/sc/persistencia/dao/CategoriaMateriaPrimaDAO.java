/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.persistencia.dao;

import br.senai.sc.model.negocio.CategoriaMateriaPrima;
import java.util.List;

/**
 *
 * @author leticia_jesus
 */
public interface CategoriaMateriaPrimaDAO {
     boolean insert(CategoriaMateriaPrima mp);
    /*
     * Método responsável pela atualização de uma categoria de matéria-prima 
     * @author LetíciaJRibeiro
     * @version 1.0 13/09/2013
     * @param p
     * @return
     */
    boolean update(CategoriaMateriaPrimaDAO mp);
    /*
     * Método responsável pela remoção de uma categoria de matéria-prima 
     * @author LetíciaJRibeiro
     * @version 1.0 13/09/2013
     * @param id
     * @return
     */
    boolean delete(int codCategoriaMateriaPrima);
    /*
     * Método responsável pela listagem de todas as categoria de matéria-prima .
     * @author LetíciaJRibeiro
     * @version 1.0 13/09/2013
     * @param p
     * @return
     */
    List<CategoriaMateriaPrimaDAO> listAll();
    /*
     * Método responsável pela listagem de categoria de matéria-prima com o codigo enviado pelo parametro
     * @author LetíciaJRibeiro
     * @version 1.0 13/09/2013
     * @param p
     * @return
     */
    CategoriaMateriaPrimaDAO listById(int codCategoriaMateriaPrima);
}



    



    

