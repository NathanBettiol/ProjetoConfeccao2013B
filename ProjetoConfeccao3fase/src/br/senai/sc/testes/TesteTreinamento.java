package br.senai.sc.testes;

import br.senai.sc.model.negocio.Treinamento;
import javax.swing.JOptionPane;

public class TesteTreinamento {

    public static void main(String[] args) {


        //Segunda classe instanciado TREINAMENTO
        Treinamento treina = new Treinamento();


        treina.nome = JOptionPane.showInputDialog("Digite nome do treinamento: ");


        //Envoquei o SET
        treina.setCargaHoraria(150);
        treina.conteudo = "Estilo Comportamental e Como Agir Diante a Um Problema";

        //Imprimi os valores com op método toString de VARIAVEIS e de GETS da classe TREINAMENTO
        System.out.println(treina.toString());

    }
}
