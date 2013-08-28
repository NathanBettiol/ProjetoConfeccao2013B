package br.senai.sc.model.negocio;

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
}
