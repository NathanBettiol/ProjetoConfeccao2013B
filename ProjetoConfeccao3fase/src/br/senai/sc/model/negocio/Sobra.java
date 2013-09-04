package br.senai.sc.model.negocio;

import java.util.Objects;

/**
 * 
 * @version 1.0 04/09/2013
 * @author Patricia Gageiro
 */
public class Sobra {
    
    private String peso;
    private String categoria;
    private String materiaPrima;
    private String dtCadastro;
    private String funcionarioResponsavel;

    
    // Métodos Gets e Sets
    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMateriaPrima() {
        return materiaPrima;
    }

    public void setMateriaPrima(String materiaPrima) {
        this.materiaPrima = materiaPrima;
    }

    public String getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(String dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public String getFuncionarioResponsavel() {
        return funcionarioResponsavel;
    }

    public void setFuncionarioResponsavel(String funcionarioResponsavel) {
        this.funcionarioResponsavel = funcionarioResponsavel;
    }

        // Métodos Equals
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sobra other = (Sobra) obj;
        if (!Objects.equals(this.peso, other.peso)) {
            return false;
        }
        if (!Objects.equals(this.categoria, other.categoria)) {
            return false;
        }
        if (!Objects.equals(this.materiaPrima, other.materiaPrima)) {
            return false;
        }
        if (!Objects.equals(this.dtCadastro, other.dtCadastro)) {
            return false;
        }
        if (!Objects.equals(this.funcionarioResponsavel, other.funcionarioResponsavel)) {
            return false;
        }
        return true;
    }
    
    public String ToString(){
         return "\nPeso: " + this.getPeso()
              + "\nCategoria: " + this.getCategoria()
              + "\nMatéria Prima: " + this.getMateriaPrima()
              + "\nData Cadastro: " + this.getDtCadastro()
              + "\nFuncionário Responsável: " + this.getFuncionarioResponsavel();
    }
    
    
}
