package br.senai.sc.model.negocio;

/**
 * @version 1.00
 * @author douglas_ghisleri
 */

public class Devolucao {
    public int cod_devolucao;

    public String peca;
    public String dataDevolucao;
    public int quantidade;

    public int getCod_devolucao() {
        return cod_devolucao;
    }

    public void setCod_devolucao(int cod_devolucao) {
        this.cod_devolucao = cod_devolucao;
    }
    
    public String getPeca() {
        return peca;
    }

    public void setPeca(String peca) {
        this.peca = peca;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    @Override
    public String toString() {
        return "Codigo devolução - " + cod_devolucao + " ,Peça - " + peca + " ,Data devolução - " + dataDevolucao + " ,Quantidade - " + quantidade ;
    }
}
