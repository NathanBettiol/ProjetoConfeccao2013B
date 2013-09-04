package br.senai.sc.model.negocio;


import java.util.Objects;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo_cm
 */
public class CadastrodeEndereco {
    
   private int codigo;
   private String rua;
   private String bairro;
   private String cidade;
   private int cep;
   private String complemento;
   private double numero;

    public CadastrodeEndereco() {
    }

   
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    
    public String toString() {
        return "CadastrodeEndereco{" + "codigo=" + codigo + ", rua=" + rua + ", bairro=" + bairro + ", cidade=" + cidade + ", cep=" + cep + ", complemento=" + complemento + ", numero=" + numero + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CadastrodeEndereco other = (CadastrodeEndereco) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.rua, other.rua)) {
            return false;
        }
        if (!Objects.equals(this.bairro, other.bairro)) {
            return false;
        }
        if (!Objects.equals(this.cidade, other.cidade)) {
            return false;
        }
        if (this.cep != other.cep) {
            return false;
        }
        if (!Objects.equals(this.complemento, other.complemento)) {
            return false;
        }
        if (Double.doubleToLongBits(this.numero) != Double.doubleToLongBits(other.numero)) {
            return false;
        }
        return true;
    }
   
   
   
   
}
