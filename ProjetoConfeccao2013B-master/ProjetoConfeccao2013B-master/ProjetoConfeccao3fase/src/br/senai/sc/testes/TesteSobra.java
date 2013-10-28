package br.senai.sc.testes;

import br.senai.sc.model.negocio.Sobra;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 * @version 1.004/08/2013
 * @author Patricia Gageiro
 */
public class TesteSobra {
    
    public static void main(String[] args) {
        
        //Instanciando a primeira Sobra
        Sobra s1 = new Sobra();
        s1.setPeso(JOptionPane.showInputDialog("Informe o peso" + s1.getPeso()));
        s1.setCategoria(JOptionPane.showInputDialog("Informe a categoria" + s1.getCategoria()));
        s1.setMateriaPrima(JOptionPane.showInputDialog("Informe a matéria prima" + s1.getMateriaPrima()));
        try {
                    String data = JOptionPane.showInputDialog("Data Cadastro");

                    s1.setDtCadastro(new SimpleDateFormat("dd/mm/yyyy").parse(data));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Data incorreta" + ex);
                }
        
        
        //Instanciando a segunda Sobra
        
        Sobra s2 = new Sobra();
        s2.setPeso(JOptionPane.showInputDialog("Informe o peso" + s2.getPeso()));
        s2.setCategoria(JOptionPane.showInputDialog("Informe a categoria" + s2.getCategoria()));
        s2.setMateriaPrima(JOptionPane.showInputDialog("Informe a matéria prima" + s2.getMateriaPrima()));
        try {
                    String data = JOptionPane.showInputDialog("Data Cadastro");

                    s2.setDtCadastro(new SimpleDateFormat("dd/mm/yyyy").parse(data));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Data incorreta" + ex);
                }
        
        
    }
}
