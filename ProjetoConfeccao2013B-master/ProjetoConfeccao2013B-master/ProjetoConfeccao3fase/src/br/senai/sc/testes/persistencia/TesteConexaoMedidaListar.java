/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.Medida;
import br.senai.sc.model.persistencia.MedidaDaoJDBC;
import br.senai.sc.persistencia.dao.MedidaDAO;
import java.util.List;

/**
 *
 * @author gustavo_lourenco
 */
public class TesteConexaoMedidaListar {

    public static void main(String[] args) {


        MedidaDAO dao = new MedidaDaoJDBC();
        List<Medida> medidas = dao.listall();
        for (Medida medida : medidas) {
            System.out.println(medida);
        }
    }
}
