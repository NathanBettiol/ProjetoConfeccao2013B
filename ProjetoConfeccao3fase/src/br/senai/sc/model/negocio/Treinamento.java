
package br.senai.sc.model.negocio;

import java.util.Objects;

/**
* Treinamento
* @version v1.0  28/08/2013
* @author Bruna Zakrzeski
*/

public class Treinamento {
    
    //Variaveis declaradas
    public Long id;
    public String nome;
    public int cargaHoraria;
    public String conteudo;

    //Iniciando o id com LONG
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    //Finalizando o id com LONG


    //Método construtor sem parametro
    public Treinamento() {
    }

    //Inicio de Get e Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    
    //Finalizando Get e Set
   
    

    //Iniciando o método equals
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Treinamento other = (Treinamento) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (this.cargaHoraria != other.cargaHoraria) {
            return false;
        }
        if (!Objects.equals(this.conteudo, other.conteudo)) {
            return false;
        }
        return true;
    }
    
    //Finalizando o método equals
    
    
    
}