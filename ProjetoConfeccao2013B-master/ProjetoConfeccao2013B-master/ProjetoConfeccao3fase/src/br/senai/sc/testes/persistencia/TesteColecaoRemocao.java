package br.senai.sc.testes.persistencia;

import br.senai.sc.model.persistencia.ColecaoDaoJDBC;
import br.senai.sc.persistencia.dao.ColecaoDAO;
import java.sql.SQLException;

/**
 * Teste de remoção de banco da classe Colecao
 *
 * @author Gabriel Arsênio
 * @version 1.0 07/10/2013
 */
public class TesteColecaoRemocao {
    
    public static void main(String[] args) throws SQLException {
        ColecaoDAO dao = new ColecaoDaoJDBC();
        dao.delete(2);
        
    }
}
