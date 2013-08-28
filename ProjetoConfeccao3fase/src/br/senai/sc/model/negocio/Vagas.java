
package br.senai.sc.model.negocio;

/**
* Vagas
* @version v1.0  28/08/2013
* @author Bruna Zakrzeski
*/

public class Vagas {
    
    //VARIAVEIS declaradas
    public int codigo;
    public Long id;
    public String nome;
    public int qtVaga;
    public String preRequisito;
    public String funcao;
    public double faixaSalarial;
    
    

    //Iniciando o id com LONG
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
  
    //Finalizando o id com LONG

    
    //Construtor sem paramentro
    public Vagas() {
    }

    //Get e Set iniciado
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtVaga() {
        return qtVaga;
    }

    public void setQtVaga(int qtVaga) {
        this.qtVaga = qtVaga;
    }

    public String getPreRequisito() {
        return preRequisito;
    }

    public void setPreRequisito(String preRequisito) {
        this.preRequisito = preRequisito;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getfaixaSalarial() {
        return faixaSalarial;
    }

    public void setfaixaSalaria(double faixaSalarial) {
        this.faixaSalarial = faixaSalarial;
    }
    //Get e Set finalizado
    
    
    //toString declarado
    public String toString(){
        return "Código: " + this.getCodigo() +
               "\nNome: " + this.getCodigo() +
               "\nQuantidade de vagas: " + this.getQtVaga()+ 
               "\nPré Requisitos: " + this.getPreRequisito() +
               "\nFunção: " + this.getFuncao() +
               "\nFaixa Salarial: " + this.getfaixaSalarial();
        
               

    }
    
}
