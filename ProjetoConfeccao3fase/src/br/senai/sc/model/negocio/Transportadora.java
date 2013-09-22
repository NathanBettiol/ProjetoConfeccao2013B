package br.senai.sc.model.negocio;

import java.util.Objects;

/**
 *
 * @author wesley_s
 */
public class Transportadora extends PessoaJuridica {

    //Atributos
    private String email;
    private String paginaWeb;
    private String contato;

//------------------------------------------------------------------------------
    //Construtor sem parâmetros
    public Transportadora() {
    }

//------------------------------------------------------------------------------
    //Métodos getters e setters
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

//------------------------------------------------------------------------------
    //Equals
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Transportadora other = (Transportadora) obj;
        if (!Objects.equals(this.getCod(), other.getCod())) {
            return false;
        }
        if (!Objects.equals(this.getNmFantasia(), other.email)) {
            return false;
        }
        if (!Objects.equals(this.getRazaoSocial(), other.getRazaoSocial())) {
            return false;
        }
        if (!Objects.equals(this.getCnpj(), other.getCnpj())) {
            return false;
        }
        if (!Objects.equals(this.getEndereco(), other.getEndereco())) {
            return false;
        }
        if (!Objects.equals(this.getTelefone(), other.getTelefone())) {
            return false;
        }
        if (!Objects.equals(this.contato, other.contato)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.paginaWeb, other.paginaWeb)) {
            return false;
        }
        if (!Objects.equals(this.getDtCadastro(), other.getDtCadastro())) {
            return false;
        }
        return true;
    }

//------------------------------------------------------------------------------
    //toString
    @Override
    public String toString() {
        return "------ TRANSPORTADORA ------"
                + "\nCodigo: " + getCod()
                + "\nNome Fantasia: " + getNmFantasia()
                + "\nRazão Social: " + getRazaoSocial()
                + "\nCnpj: " + getCnpj()
                + "\nEndereco: " + getEndereco()
                + "\nTelefone: " + getTelefone()
                + "\nContato: " + contato
                + "\nE-mail: " + email
                + "\nPagina Web: " + paginaWeb
                + "\nData de Cadastro: " + getDtCadastro()
                + "\n\n";
    }
}
