package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.CategoriaColecao;
import br.senai.sc.model.persistencia.CategoriaColecaoDaoJDBC;
import br.senai.sc.persistencia.dao.CategoriaColecaoDAO;
import java.sql.SQLException;

/**
 * Teste de remoção de banco da classe CategoriaColecao
 *
 * @author Gabriel Arsênio
 * @version 1.0 04/10/2013
 */
public class TesteCategoriaColecaoRemocao {

    public static void main(String[] args) throws SQLException {
        CategoriaColecao cc = new CategoriaColecao();
        cc.setCodCategoriaColecao(1);

        CategoriaColecaoDAO dao = new CategoriaColecaoDaoJDBC();
        dao.delete(cc.getCodCategoriaColecao());

    }
}
