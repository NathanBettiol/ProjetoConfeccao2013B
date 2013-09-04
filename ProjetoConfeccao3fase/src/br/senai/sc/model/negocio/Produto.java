package br.senai.sc.model.negocio;

import java.util.Objects;

public class Produto {

    private int codProduto;
    private Fabricante fabricante;
    private String modelo;
    private double preco;
    private CategoriaColecao categoria;
    private String tamanho;
    private Colecao colecao;
    private String cor;
    private int qtProdutos;

    public Produto() {
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public CategoriaColecao getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaColecao categoria) {
        this.categoria = categoria;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public Colecao getColecao() {
        return colecao;
    }

    public void setColecao(Colecao colecao) {
        this.colecao = colecao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQtProdutos() {
        return qtProdutos;
    }

    public void setQtProdutos(int qtProdutos) {
        this.qtProdutos = qtProdutos;
    }

    @Override
    public String toString() {
        return "Produto{" + "codProduto=" + codProduto + ", fabricante=" + fabricante + ", modelo=" + modelo + ", preco=" + preco + ", categoria=" + categoria + ", tamanho=" + tamanho + ", colecao=" + colecao + ", cor=" + cor + ", qtProdutos=" + qtProdutos + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        if (this.codProduto != other.codProduto) {
            return false;
        }
        if (!Objects.equals(this.fabricante, other.fabricante)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (Double.doubleToLongBits(this.preco) != Double.doubleToLongBits(other.preco)) {
            return false;
        }
        if (!Objects.equals(this.categoria, other.categoria)) {
            return false;
        }
        if (!Objects.equals(this.tamanho, other.tamanho)) {
            return false;
        }
        if (!Objects.equals(this.colecao, other.colecao)) {
            return false;
        }
        if (!Objects.equals(this.cor, other.cor)) {
            return false;
        }
        if (this.qtProdutos != other.qtProdutos) {
            return false;
        }
        return true;
    }
}