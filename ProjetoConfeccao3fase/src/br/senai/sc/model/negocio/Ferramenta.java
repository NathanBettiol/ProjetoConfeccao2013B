/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.model.negocio;

import java.util.Objects;

/**
 * Classe de representação da ferramenta
 * @version 1.0 28/08/2013
 * @author ariane_souza
 */
public class Ferramenta {

    //Atributos da classe

    private int codFerramenta;
    private String nome;
    private String descricao;
    private String nmFabricante;
    private String dtCadastro;
    private boolean status;

    //Métodos Get e Set
    public int getIdFerramenta() {
        return codFerramenta;
    }

    public void setIdFerramenta(int idFerramenta) {
        this.codFerramenta = idFerramenta;
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

    public String getNmFabricante() {
        return nmFabricante;
    }

    public void setNmFabricante(String nmFabricante) {
        this.nmFabricante = nmFabricante;
    }

    public String getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(String dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //Equals
    @Override
    public int hashCode() {
        int hash = 7;
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
        final Ferramenta other = (Ferramenta) obj;
        if (this.codFerramenta != other.codFerramenta) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.nmFabricante, other.nmFabricante)) {
            return false;
        }
        if (!Objects.equals(this.dtCadastro, other.dtCadastro)) {
            return false;
        }
        if (this.status != other.status) {
            return false;
        }
        return true;
    }

    
    //Construtor vazio

    public Ferramenta() {
    }
        
    //toString
    @Override
    public String toString() {
        return "Ferramenta: " + nome + 
                "\nDescricao: " + descricao +
                "\nNome do Fabricante: " + nmFabricante +
                "\nData do Cadastro: " + dtCadastro +
                "\nStatus: " + status+
                "\nCódigo: " + codFerramenta;
    }
}
