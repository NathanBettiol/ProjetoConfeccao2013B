package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.TipoMaquinaAssistencia;
import br.senai.sc.model.persistencia.TipoMaquinaAssistenciaDaoJDBC;
import br.senai.sc.persistencia.dao.TipoMaquinaAssistenciaDAO;
import java.sql.SQLException;

/**
 * Teste de inserção de banco no banco da classe TipoMaquinaAssistencia
 *
 * @author Gabriel Arsênio
 * @version 1.0 01/10/2013
 */
public class TesteTipoMaquinaAssistenciaInsercao {
    
    public static void main(String[] args) throws SQLException {
        
        TipoMaquinaAssistencia tma = new TipoMaquinaAssistencia();
        tma.setAssistenciaTipoMaquina(null);
        
        TipoMaquinaAssistenciaDAO dao = new TipoMaquinaAssistenciaDaoJDBC();
        dao.insert(tma);
    }
}
