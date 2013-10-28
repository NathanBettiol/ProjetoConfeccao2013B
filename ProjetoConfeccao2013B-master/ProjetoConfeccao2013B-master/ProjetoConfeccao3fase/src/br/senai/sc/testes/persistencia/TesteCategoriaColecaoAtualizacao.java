package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.CategoriaColecao;
import br.senai.sc.model.persistencia.CategoriaColecaoDaoJDBC;
import br.senai.sc.persistencia.dao.CategoriaColecaoDAO;
import java.sql.SQLException;
import java.util.List;

/**
 * Teste de atualização de banco da classe CategoriaColecao
 *
 * @author Gabriel Arsênio
 * @version 1.0 04/10/2013
 */
public class TesteCategoriaColecaoAtualizacao {

    public static void main(String[] args) throws SQLException {
        CategoriaColecao cc = new CategoriaColecao();
        cc.setNomeCategoriaColecao("Outono");
        cc.setDescricaoCategoriaColecao("Categoria de outono");
        cc.setCodCategoriaColecao(2);

        CategoriaColecaoDAO dao = new CategoriaColecaoDaoJDBC();
        dao.update(cc);
    }
}
