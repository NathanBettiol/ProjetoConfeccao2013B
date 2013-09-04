/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.model.negocio;

import java.util.Objects;

/*
 * Classe Usuário
 * @version v1.0 Agosto/2013
 * @author Larissa Mezari
 */


public class Ferias {

    private String funcionario;
    private String dataInicio;
    private String dataFim;

    //Construtor padrão
    public Ferias() {
    }
    
    //getters e setters
    

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

   
    public int hashCode() {
        int hash = 7;
        return hash;
    }

     //equals
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ferias other = (Ferias) obj;
        if (!Objects.equals(this.funcionario, other.funcionario)) {
            return false;
        }
        if (!Objects.equals(this.dataInicio, other.dataInicio)) {
            return false;
        }
        if (!Objects.equals(this.dataFim, other.dataFim)) {
            return false;
        }
        return true;
    }

    //toString
    public String toString() {
        return "Ferias " + 
                "\nFuncionario: " + funcionario 
                + "\nData de Inicio: " + dataInicio 
                + "\nData do Fim: " + dataFim;
    }
    
    
}
