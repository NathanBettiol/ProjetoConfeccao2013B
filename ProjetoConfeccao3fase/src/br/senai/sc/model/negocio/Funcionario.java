package br.senai.sc.model.negocio;

import java.util.Objects;

/**
 * Classe que representa os funcionarios do software
 *
 * @version 1.0 26/08/2013
 * @author Patricia Gageiro
 */
public class Funcionario extends Pessoa {

    private int cod;
    private String login;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String endereco;
    private String ctps;
    private String cargo;
    private String rg;
    private double salario;
    private String dtAdimissao;
    private String dtNascimento;
    private String dtRecisao;
    
    public Funcionario() {
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }    
  
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getLogin() {
        return login;
    }

    public String getNome() {
        return nome;
    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDtAdimissao() {
        return dtAdimissao;
    }

    public void setDtAdimissao(String dtAdimissao) {
        this.dtAdimissao = dtAdimissao;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getDtRecisao() {
        return dtRecisao;
    }

    public void setDtRecisao(String dtRecisao) {
        this.dtRecisao = dtRecisao;
    }
    //Métodos ToString
    public String toString(){
        return "Código: "             + this.getCod() +
               "Login:  "             + this.getLogin() +
               "Nome: "               + this.getNome() +
               "Cpf: "                + this.getCpf() + 
               "Email: "              + this.getEmail() + 
               "Telefone: "           + this.getTelefone() +
               "Endereço: "           + this.getEndereco() +
               "Ctps: "               + this.getCtps() +
               "Cargo: "              + this.getCargo() +
               "Rg: "                 + this.getRg() + 
               "Salário: "            + this.getSalario() +
               "Data Adimissão: "     + this.getDtAdimissao() +
               "Data Nascimento: "    + this.getDtNascimento() +
               "Data Recisão: "       + this.getDtRecisao();
    }

   

    //Métodos Equals
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Funcionario other = (Funcionario) obj;
        if (this.cod != other.cod) {
            return false;
        }
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (this.cpf != other.cpf) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        if (!Objects.equals(this.ctps, other.ctps)) {
            return false;
        }
        if (!Objects.equals(this.cargo, other.cargo)) {
            return false;
        }
        if (!Objects.equals(this.rg, other.rg)) {
            return false;
        }
        if (Double.doubleToLongBits(this.salario) != Double.doubleToLongBits(other.salario)) {
            return false;
        }
        if (!Objects.equals(this.dtAdimissao, other.dtAdimissao)) {
            return false;
        }
        if (!Objects.equals(this.dtNascimento, other.dtNascimento)) {
            return false;
        }
        if (!Objects.equals(this.dtRecisao, other.dtRecisao)) {
            return false;
        }
        return true;
    }

  

    
}

