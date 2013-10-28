package br.senai.sc.validador;

import javax.swing.JOptionPane;

/**
 *
 * @author Patricia Gageiro
 * @version 1.0 26/08/2013
 */
public abstract class Validadores {
    
    public static boolean somenteLetras(String text){
        String letra;
        for (int i = 0; i < text.length();i++){
            letra = text.substring(i, i + 1); // Letra recebe caracter atual do loop
            
            if (letra.matches("\\d")){ 
                // Se a letra estiver dentro da ER retorna FALSE, pois apenas letras são suportadas.
                JOptionPane.showMessageDialog(null, "Apenas letras são suportadas!");
                return false;
            }
        }
        return true;
        
    }
    public static boolean somenteNumeros(String text){
        String letra;
        for (int i = 0; i < text.length();i++){
            letra = text.substring(i, i + 1); // Letra recebe caracter atual do loop
            
            if (!letra.matches("\\d")){ 
                // Se a letra estiver dentro da ER retorna FALSE, pois apenas letras são suportadas.
                JOptionPane.showMessageDialog(null, "Apenas números são suportados!");
                return false;
            }
        }     
        return true;
        
    }
}
