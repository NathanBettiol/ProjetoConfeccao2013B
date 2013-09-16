/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes.persistencia;

import br.senai.sc.model.negocio.Medida;
import br.senai.sc.model.persistencia.MedidaDaoJDBC;
import br.senai.sc.persistencia.dao.MedidaDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo_lourenco
 */
public class TesteConexaoMedidaUpdate {

    public static void main(String[] args) {

        Medida m = new Medida();

        m.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: ")));
        m.setMdBusto(Double.parseDouble(JOptionPane.showInputDialog("Digite a medida do busto: ")));
        m.setMdCintura(Double.parseDouble(JOptionPane.showInputDialog("Digite a medida da cintura: ")));
        m.setMdOmbros(Double.parseDouble(JOptionPane.showInputDialog("Digite a medida dos ombros: ")));
        m.setMdQuadril(Double.parseDouble(JOptionPane.showInputDialog("Digite a medida do quadril: ")));
        m.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Informe o ID da pessoa a ser alterada")));
        MedidaDAO dao = new MedidaDaoJDBC();
        dao.update(m);
    }
}
