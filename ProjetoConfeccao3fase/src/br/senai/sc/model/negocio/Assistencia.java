package br.senai.sc.model.negocio;

import java.util.Objects;

/**
 * Classe Assistencia * Informações da assistência
 *
 * @version v1.0 04/09/2013
 * @author wesley_s
 */
//------------------------------------------------------------------------------
public class Assistencia {

    //Atributos
    private int codAssistencia;
    private String nomeAssistencia;
    private String nomeFantasiaAssistencia;
    private String cnpjAssistencia;
    private String razaoSocialAssistencia;
    private String telefoneAssistencia;
    private String emailAssistencia;
    private String paginaWebAssistencia;
    private String contatoAssistencia;

//------------------------------------------------------------------------------
    //Construtor default
    public Assistencia() {
    }

//------------------------------------------------------------------------------
    //Getters e Setters
    public int getCodAssistencia() {
        return codAssistencia;
    }

    public void setCodAssistencia(int codAssistencia) {
        this.codAssistencia = codAssistencia;
    }

    public String getNomeAssistencia() {
        return nomeAssistencia;
    }

    public void setNomeAssistencia(String nomeAssistencia) {
        this.nomeAssistencia = nomeAssistencia;
    }

    public String getNomeFantasiaAssistencia() {
        return nomeFantasiaAssistencia;
    }

    public void setNomeFantasiaAssistencia(String nomeFantasiaAssistencia) {
        this.nomeFantasiaAssistencia = nomeFantasiaAssistencia;
    }

    public String getCnpjAssistencia() {
        return cnpjAssistencia;
    }

    public void setCnpjAssistencia(String cnpjAssistencia) {
        this.cnpjAssistencia = cnpjAssistencia;
    }

    public String getRazaoSocialAssistencia() {
        return razaoSocialAssistencia;
    }

    public void setRazaoSocialAssistencia(String razaoSocialAssistencia) {
        this.razaoSocialAssistencia = razaoSocialAssistencia;
    }

    public String getTelefoneAssistencia() {
        return telefoneAssistencia;
    }

    public void setTelefoneAssistencia(String telefoneAssistencia) {
        this.telefoneAssistencia = telefoneAssistencia;
    }

    public String getEmailAssistencia() {
        return emailAssistencia;
    }

    public void setEmailAssistencia(String emailAssistencia) {
        this.emailAssistencia = emailAssistencia;
    }

    public String getPaginaWebAssistencia() {
        return paginaWebAssistencia;
    }

    public void setPaginaWebAssistencia(String paginaWebAssistencia) {
        this.paginaWebAssistencia = paginaWebAssistencia;
    }

    public String getContatoAssistencia() {
        return contatoAssistencia;
    }

    public void setContatoAssistencia(String contatoAssistencia) {
        this.contatoAssistencia = contatoAssistencia;
    }
    //Fim Getters e Setters

//------------------------------------------------------------------------------
    //Método equals
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Assistencia other = (Assistencia) obj;
        if (this.codAssistencia != other.codAssistencia) {
            return false;
        }
        if (!Objects.equals(this.nomeAssistencia, other.nomeAssistencia)) {
            return false;
        }
        if (!Objects.equals(this.nomeFantasiaAssistencia, other.nomeFantasiaAssistencia)) {
            return false;
        }
        if (!Objects.equals(this.cnpjAssistencia, other.cnpjAssistencia)) {
            return false;
        }
        if (!Objects.equals(this.razaoSocialAssistencia, other.razaoSocialAssistencia)) {
            return false;
        }
        if (!Objects.equals(this.telefoneAssistencia, other.telefoneAssistencia)) {
            return false;
        }
        if (!Objects.equals(this.emailAssistencia, other.emailAssistencia)) {
            return false;
        }
        if (!Objects.equals(this.paginaWebAssistencia, other.paginaWebAssistencia)) {
            return false;
        }
        if (!Objects.equals(this.contatoAssistencia, other.contatoAssistencia)) {
            return false;
        }
        return true;
    }
//------------------------------------------------------------------------------
    //Método toString

    @Override
    public String toString() {
        return "\nAssistência"
                + "\nCódigo: " + codAssistencia
                + "\nNome: " + nomeAssistencia
                + "\nNome Fantasia: " + nomeFantasiaAssistencia
                + "\nCNPJ: " + cnpjAssistencia
                + "\nRazao Social: " + razaoSocialAssistencia
                + "\nTelefone: " + telefoneAssistencia
                + "\nE-mail: " + emailAssistencia
                + "\nPágina Web: " + paginaWebAssistencia
                + "\nContato: " + contatoAssistencia;
    }
}
