package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.CategoriaColecao;
import br.senai.sc.model.persistencia.CategoriaColecaoDaoJDBC;
import br.senai.sc.persistencia.dao.CategoriaColecaoDAO;
import java.sql.SQLException;

/**
 * Teste de inserção de banco da classe CategoriaColecao
 *
 * @author Gabriel Arsênio
 * @version 1.0 01/10/2013
 */
public class TesteCategoriaColecaoInsercao {

    public static void main(String[] args) throws SQLException {

        CategoriaColecao cc = new CategoriaColecao();
        cc.setDescricaoCategoriaColecao("Descrição da categoria de verão");
        cc.setNomeCategoriaColecao("Verão");

        CategoriaColecaoDAO dao = new CategoriaColecaoDaoJDBC();
        dao.insert(cc);
    }
}
