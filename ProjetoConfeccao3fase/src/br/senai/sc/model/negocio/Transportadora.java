package br.senai.sc.model.negocio;

import java.util.Objects;

/**
 *
 * @author wesley_s
 */
public class Transportadora {

    private int codigo;
    private String nmTransportadora;
    private String cnpj;
    private String endereco;
    private String razaoSocial;
    private String telefone;
    private String email;
    private String paginaWeb;
    private String contato;

    public Transportadora() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNmTransportadora() {
        return nmTransportadora;
    }

    public void setNmTransportadora(String nmTransportadora) {
        this.nmTransportadora = nmTransportadora;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
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

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Transportadora other = (Transportadora) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.nmTransportadora, other.nmTransportadora)) {
            return false;
        }
        if (!Objects.equals(this.cnpj, other.cnpj)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        if (!Objects.equals(this.razaoSocial, other.razaoSocial)) {
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

    @Override
    public String toString() {
        return "Transportadora:"
                + "\nCodigo = " + codigo
                + "\nNome = " + nmTransportadora
                + "\nCnpj = " + cnpj
                + "\nEndereco = " + endereco
                + "\nRazao Social = " + razaoSocial
                + "\nTelefone = " + telefone
                + "\nE-mail = " + email
                + "\nPagina Web = " + paginaWeb
                + "\nContato = " + contato;
    }
}
