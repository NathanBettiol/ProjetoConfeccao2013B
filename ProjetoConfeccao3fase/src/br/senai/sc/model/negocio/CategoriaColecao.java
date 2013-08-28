package br.senai.sc.model.negocio;

import java.util.Objects;

/**
 * Classe CategoriaColecao * A possui atributos para cadastrar categorias de
 * coleção
 *
 * @version v1.0 28/08/2013
 * @author Gabriel Arsênio
 */
public class CategoriaColecao {

    private int cod;
    private String nome;
    private String descricao;

    @Override
    public String toString() {
        return "Categoria de coleção" + ""
                + "\nCódigo da categoria: " + cod + ""
                + "\nNome: " + nome + ""
                + "\nDescrição: " + descricao;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CategoriaColecao other = (CategoriaColecao) obj;
        if (this.cod != other.cod) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        return true;
    }

    //Getters e Setters
    public int getCod() {
        return cod;
    }

    public void setCodigo(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    //Fim Getters e Setters
}
