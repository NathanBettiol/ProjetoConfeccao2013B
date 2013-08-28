package br.senai.sc.model.negocio;

import java.util.Objects;

/**
 * Classe Colecao * Representa as informações de cada coleção
 *
 * @version v1.0 28/08/2013
 * @author Gabriel Arsênio
 */
public class Colecao {

    private int cod;
    private String estacao;
    private int ano;
    private String pubAlvo;
    private String funResponsavel;

    public Colecao() {
    }

    @Override
    public String toString() {
        return "\nColeção" + ""
                + "\nCódigo da coleção: " + cod + ""
                + "\nEstação: " + estacao + ""
                + "\nAno: " + ano + ""               
                + "\nPúblico alvo: " + pubAlvo + ""
                + "\nFuncionário responsável: " + funResponsavel;
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
        final Colecao other = (Colecao) obj;
        if (this.cod != other.cod) {
            return false;
        }
        if (!Objects.equals(this.estacao, other.estacao)) {
            return false;
        }
        if (this.ano != other.ano) {
            return false;
        }        
        if (!Objects.equals(this.pubAlvo, other.pubAlvo)) {
            return false;
        }
        if (!Objects.equals(this.funResponsavel, other.funResponsavel)) {
            return false;
        }
        return true;
    }

    //Getters e Setters
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getEstacao() {
        return estacao;
    }

    public void setEstacao(String estacao) {
        this.estacao = estacao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }    

    public String getPubAlvo() {
        return pubAlvo;
    }

    public void setPubAlvo(String pubAlvo) {
        this.pubAlvo = pubAlvo;
    }

    public String getFunResponsavel() {
        return funResponsavel;
    }

    public void setFunResponsavel(String funResponsavel) {
        this.funResponsavel = funResponsavel;
    }
    //Fim Getters e Setters
}
