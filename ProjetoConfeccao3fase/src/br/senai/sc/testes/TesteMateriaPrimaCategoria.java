
package br.senai.sc.testes;

import br.senai.sc.model.negocio.CategoriaMateriaPrima;
import br.senai.sc.model.negocio.MateriaPrima;
import javax.swing.JOptionPane;

/**
 *@version  v1 28/08/2013
 * @author leticia_jesus
 */
public class TesteMateriaPrimaCategoria {

    public static void main(String[] args) {



        CategoriaMateriaPrima cmp1 = new CategoriaMateriaPrima();
        cmp1.setCod(1);
        cmp1.setNome(JOptionPane.showInputDialog("Informe o nome da categoria: "));
        cmp1.setDescricao(JOptionPane.showInputDialog("Descreva a categoria da matéria-prima:"));

        CategoriaMateriaPrima cmp2 = new CategoriaMateriaPrima();
        cmp2.setCod(2);
        cmp2.setNome(JOptionPane.showInputDialog("Informe o nome da categoria:"));
        cmp2.setDescricao(JOptionPane.showInputDialog("Descreva a categoria da matéria-prima:"));

        JOptionPane.showMessageDialog(null, cmp1.toString());
        JOptionPane.showMessageDialog(null, cmp2.toString());
        
            MateriaPrima mp1= new MateriaPrima();
            mp1.setCodigo(1);
            mp1.setNome(JOptionPane.showInputDialog("Informe o nome da matéria-prima: "));
            mp1.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da matéria-prima:")));
            mp1.setTpUnidade(JOptionPane.showInputDialog("Digite o tipo das unidades:"));
            mp1.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de matéria-prima:")));
            CategoriaMateriaPrima cat = new CategoriaMateriaPrima();
            mp1.setCategoria(cmp2);
            
            
              MateriaPrima mp2= new MateriaPrima();
            mp2.setCodigo(2);
            mp2.setNome(JOptionPane.showInputDialog("Informe o nome da matéria-prima: "));
            mp2.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da matéria-prima:")));
            mp2.setTpUnidade(JOptionPane.showInputDialog("Digite o tipo das unidades:"));
            mp2.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de matéria-prima:")));
            mp2.setCategoria(cmp1);

            
                    
    }
}
