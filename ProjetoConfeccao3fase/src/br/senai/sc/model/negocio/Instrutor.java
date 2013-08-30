
package br.senai.sc.model.negocio;
/**
* Instrutor
* @version v1.0  28/08/2013
* @author Bruna Zakrzeski
*/

public class Instrutor {
    
    //Variaveis declaradas
    public Long id;
    public String treinamento;
    public int codTreinamento;
    public String nmfuncionario;


    //Iniciando o id com LONG
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
   //Finalizando o id com LONG
   
    //Método construtor sem retorno
    public Instrutor() {
    }

    //Inico de Get e Set
    public String getTreinamento() {
        return treinamento;
    }

    public void setTreinamento(String treinamento) {
        this.treinamento = treinamento;
    }

    public int getCodTreinamento() {
        return codTreinamento;
    }

    public void setCodTreinamento(int codTreinamento) {
        this.codTreinamento = codTreinamento;
    }

    public String getNmfuncionario() {
        return nmfuncionario;
    }

    public void setNmfuncionario(String nmfuncionario) {
        this.nmfuncionario = nmfuncionario;
    }
    
    //Finalizando o Get e Set
    
    
    
}
