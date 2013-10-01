package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.Colecao;
import br.senai.sc.model.persistencia.ColecaoDaoJDBC;
import br.senai.sc.persistencia.dao.ColecaoDAO;
import java.sql.SQLException;

/**
 * Teste de inserção de banco no banco da classe Colecao
 *
 * @author Gabriel Arsênio
 * @version 1.0 01/10/2013
 */
public class TesteInsercaoColecao {

    public static void main(String[] args) throws SQLException {

        Colecao c = new Colecao();
        c.setAnoColecao(2013);
        c.setCategoriaColecao(null);
        c.setEstacaoColecao("Verão");
        c.setFunResponsavelColecao(null);
        c.setPubAlvoColecao("Jovens");

        ColecaoDAO dao = new ColecaoDaoJDBC();
        dao.insert(c);
    }
}
