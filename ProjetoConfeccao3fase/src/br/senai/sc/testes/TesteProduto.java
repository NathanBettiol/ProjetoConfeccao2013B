package br.senai.sc.testes;

import br.senai.sc.model.negocio.Produto;
import javax.swing.JOptionPane;

public class TesteProduto {

    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.setCodigo(1);
        p1.setFabricante(JOptionPane.showInputDialog("Informe o fabricante do produto " + p1.getCodigo()));
        p1.setModelo(JOptionPane.showInputDialog("Informe o modelo do produto " + p1.getCodigo()));
        p1.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do produto " + p1.getCodigo())));
        p1.setTamanho(JOptionPane.showInputDialog("Informe o tamanho do produto " + p1.getCodigo()));
        p1.setCor(JOptionPane.showInputDialog("Informe a cor do produto " + p1.getCodigo()));
        System.out.println(p1.toString());

        Produto p2 = new Produto();
        p2.setCodigo(2);
        p2.setFabricante(JOptionPane.showInputDialog("Informe o fabricante do produto " + p2.getCodigo()));
        p2.setModelo(JOptionPane.showInputDialog("Informe o modelo do produto " + p2.getCodigo()));
        p2.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do produto " + p2.getCodigo())));
        p2.setTamanho(JOptionPane.showInputDialog("Informe o tamanho do produto " + p2.getCodigo()));
        p2.setCor(JOptionPane.showInputDialog("Informe a cor do produto " + p2.getCodigo()));

        System.out.println(p2.toString());
    }
}