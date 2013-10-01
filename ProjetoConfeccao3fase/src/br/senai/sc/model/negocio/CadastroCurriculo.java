/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.model.negocio;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author evaldo_matias
 */
public class CadastroCurriculo {
    
    
   private int codigo;
   private String login;
   private String senha;
   private String nome;
   private String cpf;
   private String email;
   private String telefone;
   private String endereco;
   private String ctps;
   private String cargo;

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "CadstroCurriculo{"
                + "" + "/n codigo=" + codigo + ""
                + ",\n login=" + login + ""
                + ",\n senha=" + senha + ""
                + ",\n nome=" + nome + ""
                + ",\n cpf=" + cpf + ""
                + ",\n email=" + email + ""
                + ",\n telefone=" + telefone + ""
                + ",\n endereco=" + endereco + ""
                + ",\n ctps=" + ctps + ""
                + ",\n cargo=" + cargo + ""
                + ",\n rg=" + rg + ""
                + ",\n salario=" + salario + ""
                + ",\n dataadimissao=" + dataadimissao + ""
                + ",\n datanacimento=" + datanacimento + ""
                + ",\n datarecisao=" + datarecisao + ""
                + ",\n status=" + status + ""
                + ",\n experienciaprofissional=" + experienciaprofissional + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CadastroCurriculo other = (CadastroCurriculo) obj;
        if (this.codigo != other.codigo) {
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
        if (!Objects.equals(this.salario, other.salario)) {
            return false;
        }
        if (!Objects.equals(this.dataadimissao, other.dataadimissao)) {
            return false;
        }
        if (!Objects.equals(this.datanacimento, other.datanacimento)) {
            return false;
        }
        if (!Objects.equals(this.datarecisao, other.datarecisao)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (!Objects.equals(this.experienciaprofissional, other.experienciaprofissional)) {
            return false;
        }
        return true;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public Date getDataadimissao() {
        return dataadimissao;
    }

    public void setDataadimissao(Date dataadimissao) {
        this.dataadimissao = dataadimissao;
    }

    public Date getDatanacimento() {
        return datanacimento;
    }

    public void setDatanacimento(Date datanacimento) {
        this.datanacimento = datanacimento;
    }

    public Date getDatarecisao() {
        return datarecisao;
    }

    public void setDatarecisao(Date datarecisao) {
        this.datarecisao = datarecisao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getExperienciaprofissional() {
        return experienciaprofissional;
    }

    public void setExperienciaprofissional(String experienciaprofissional) {
        this.experienciaprofissional = experienciaprofissional;
    }
   private String rg;
   private String salario;
   private Date dataadimissao;
   private Date datanacimento;
   private Date datarecisao;
   private String status;
   private String experienciaprofissional;
}
