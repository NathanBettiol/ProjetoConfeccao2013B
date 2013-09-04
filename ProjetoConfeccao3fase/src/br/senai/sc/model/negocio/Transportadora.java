package br.senai.sc.model.negocio;

import java.util.Objects;

/**
 *
 * @author wesley_s
 */
public class Transportadora extends PessoaJuridica {

    //Atributos
    private int codTransportadora;
    private String endereco;
    private String telefone;
    private String email;
    private String paginaWeb;
    private String contato;

    //Construtor sem parâmetros
    public Transportadora() {
    }

    //Métodos getters e setters
    public int getCodTransportadora() {
        return codTransportadora;
    }

    public void setCodTransportadora(int codTransportadora) {
        this.codTransportadora = codTransportadora;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

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
        if (this.codTransportadora != other.codTransportadora) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.paginaWeb, other.paginaWeb)) {
            return false;
        }
        if (!Objects.equals(this.contato, other.contato)) {
            return false;
        }
        return true;
    }

    //toString
    @Override
    public String toString() {
        return "Transportadora:"
                + "\nCodigo = " + codTransportadora
                + "\nNome Fantasia = " + getNmFantasia()
                + "\nCnpj = " + getCnpj()
                + "\nEndereco = " + endereco
                + "\nRazão Social = " + getRazaoSocial()
                + "\nTelefone = " + telefone
                + "\nE-mail = " + email
                + "\nPagina Web = " + paginaWeb
                + "\nContato = " + contato;
    }
}