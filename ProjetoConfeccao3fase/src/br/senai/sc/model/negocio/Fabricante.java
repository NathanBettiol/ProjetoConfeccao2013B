/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.model.negocio;

import java.util.Objects;

/**
 * Fabricante
 * @author mateus_aguiar
 * @version v1.0 28/08/2013
 */
public class Fabricante {
    
    // Atributos
    private int cod;
    private String nmFantasia;
    private String cnpj;
    private String telefone;
    private String email;
    private String endereco;

    
    // Construtor vazio
    public Fabricante() {
    }
       
    // Getters e Setters
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNomeFantasia() {
        return nmFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nmFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    
    // Método toString
    public String toString() {
        return "- FABRICANTE - " +
               "\nCódigo: " + cod + 
               "\nNome Fantasia:" + nmFantasia + 
               "\nCNPJ: " + cnpj + 
               "\nTelefone: " + telefone + 
               "\nE-mail: " + email + 
               "\nEndereço: " + endereco + "\n---";
    }

    //Método equals
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Fabricante other = (Fabricante) obj;
        if (this.cod != other.cod) {
            return false;
        }
        if (!Objects.equals(this.nmFantasia, other.nmFantasia)) {
            return false;
        }
        if (!Objects.equals(this.cnpj, other.cnpj)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        return true;
    }
        
}
