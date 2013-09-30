package br.senai.sc.model.negocio;

import java.util.Objects;

/**
 * @version v1.0 04/09/2013
 * @author wesley_s
 */
//------------------------------------------------------------------------------
public class Assistencia extends PessoaJuridica {

    //Atributos
    private String email;
    private String paginaWeb;
    private String contato;

//------------------------------------------------------------------------------
    //Construtor default
    public Assistencia() {
    }

//------------------------------------------------------------------------------
    //Getters e Setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
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
        if (this.getCod() != other.getCod()) {
            return false;
        }
        if (!Objects.equals(this.getNmFantasia(), other.getNmFantasia())) {
            return false;
        }
        if (!Objects.equals(this.getRazaoSocial(), other.getRazaoSocial())) {
            return false;
        }
        if (!Objects.equals(this.getCnpj(), other.getCnpj())) {
            return false;
        }
        if (!Objects.equals(this.getTelefone(), other.getTelefone())) {
            return false;
        }
        if (!Objects.equals(this.getEndereco(), other.getEndereco())) {
            return false;
        }
        if (!Objects.equals(this.getEmail(), other.getEmail())) {
            return false;
        }
        if (!Objects.equals(this.getPaginaWeb(), other.getPaginaWeb())) {
            return false;
        }
        if (!Objects.equals(this.getContato(), other.getContato())) {
            return false;
        }
        if (!Objects.equals(this.getDtCadastro(), other.getDtCadastro())) {
            return false;
        }
        return true;
    }

//------------------------------------------------------------------------------
    //Método toString
    @Override
    public String toString() {
        return "------ ASSISTÊNCIA ------"
                + "\nCódigo: " + getCod()
                + "\nNome Fantasia: " + getNmFantasia()
                + "\nRazao Social: " + getRazaoSocial()
                + "\nCNPJ: " + getCnpj()
                + "\nTelefone: " + getTelefone()
                + "\nEndereço: " + getEndereco()
                + "\nE-mail: " + email
                + "\nPágina Web: " + paginaWeb
                + "\nContato: " + contato
                + "\nData de Cadastro: " + getDtCadastro()
                + "\n\n";
    }
}