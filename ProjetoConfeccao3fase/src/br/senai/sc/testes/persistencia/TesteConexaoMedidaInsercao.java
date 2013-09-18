/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.Medida;
import br.senai.sc.model.negocio.Usuario;
import br.senai.sc.model.persistencia.MedidaDaoJDBC;
import br.senai.sc.persistencia.dao.MedidaDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo_lourenco
 */
public class TesteConexaoMedidaInsercao {

    public static void main(String[] args) {


        Medida m = new Medida();

        m.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: ")));
        m.setMdBusto(Double.parseDouble(JOptionPane.showInputDialog("Digite a medida do busto: ")));
        m.setMdCintura(Double.parseDouble(JOptionPane.showInputDialog("Digite a medida da cintura: ")));
        m.setMdOmbros(Double.parseDouble(JOptionPane.showInputDialog("Digite a medida dos ombros: ")));
        m.setMdQuadril(Double.parseDouble(JOptionPane.showInputDialog("Digite a medida do quadril: ")));

//        m.getUsuario().setCod(1);
//
//        UsuarioDAO daou = new UsuarioDaoJDBC();
//        Usuario u = daou;

        MedidaDAO dao = new MedidaDaoJDBC();
        dao.insert(m);
    }
}
