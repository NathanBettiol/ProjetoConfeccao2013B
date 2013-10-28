/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.testes;

import br.senai.sc.model.negocio.TipoMaquinaAssistencia;
import javax.swing.JOptionPane;

/**
 * Classe TesteTipoMaquinaAssistencia * Instância de dois objetos da classe
 * TipoMaquinaAssistencia para testar sua funcionalidade.
 *
 * @version v1.0 05/09/2013
 * @author Gabriel Arsênio
 */
public class TesteTipoMaquinaAssistencia {

    public static void main(String[] args) {

        //Instância 0
        TipoMaquinaAssistencia tma = new TipoMaquinaAssistencia();
        tma.setCodTipoMaquina(0);

        //Instância 1
        TipoMaquinaAssistencia tma1 = new TipoMaquinaAssistencia();
        tma1.setCodTipoMaquina(1);

        JOptionPane.showMessageDialog(null, tma.toString() + tma1.toString());
    }
}
