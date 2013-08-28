package br.senai.sc.model.negocio;

import java.util.Objects;

/*
 * Classe Usuário
 * @version v1.0 Agosto/2013
 * @author Larissa Mezari
 *
 *
 */
// USUARIO codigo login senha nome cpf email telefone endereco dataNascimento 
public class Usuario extends Pessoa {

    private int codUsuario;
    private String login;
    private String senha;
    private String nome;
    private String cpf;
    private String email;
    private String dataNascimento;

    //Construtor padrão
    public Usuario() {
    }

    //getters e settres
    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    //toString
    public String toString() {
        return "Usuario"
                + "\nCódigo do usuário: " + codUsuario
                + "\nLogin: " + login
                + "\nSenha: " + senha
                + "\nNome: " + nome
                + "\nCpf: " + cpf
                + "\nE-mail: " + email
                + "\nDataNascimento: " + dataNascimento;
    }

    @Override
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
        final Usuario other = (Usuario) obj;
        if (this.codUsuario != other.codUsuario) {
            return false;
        }
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!(this.dataNascimento.equalsIgnoreCase(other.dataNascimento))) {
            return false;
        }
        return true;
    }
}
