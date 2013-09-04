package br.senai.sc.model.negocio;

import java.util.Objects;

/**
 * Classe NotaFiscal * A classe possui atributos para formação de uma nota
 * fiscal
 *
 * @version v1.0 28/08/2013
 * @author Elivelton Sipriano
 */
public class NotaFiscal {

    private int codNumero;
    private String dataEmissao;
    private String produtos;
    private double valorTotal;
    private Funcionario funcionarioResponsavel;
    private String destinatario;
    private String remetente;

    public NotaFiscal() {
    }
//criei os metodos get e sets

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getProdutos() {
        return produtos;
    }

    public void setProdutos(String produtos) {
        this.produtos = produtos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Funcionario getFuncionarioResponsavel() {
        return funcionarioResponsavel;
    }

    public void setFuncionarioResponsavel(Funcionario funcionarioResponsavel) {
        this.funcionarioResponsavel = funcionarioResponsavel;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;

    }

    public int getCodNumero() {
        return codNumero;
    }

    public void setCodNumero(int codNumero) {
        this.codNumero = codNumero;
    }

//criei o metodo equals 
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NotaFiscal other = (NotaFiscal) obj;
        if (!Objects.equals(this.dataEmissao, other.dataEmissao)) {
            return false;
        }
        if (!Objects.equals(this.produtos, other.produtos)) {
            return false;
        }
        if (Double.doubleToLongBits(this.valorTotal) != Double.doubleToLongBits(other.valorTotal)) {
            return false;
        }
        if (!Objects.equals(this.funcionarioResponsavel, other.funcionarioResponsavel)) {
            return false;
        }
        if (!Objects.equals(this.destinatario, other.destinatario)) {
            return false;
        }
        if (!Objects.equals(this.remetente, other.remetente)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "NotaFiscal" + "\nCodNumero:" + codNumero
                + "\nData Emissao: " + dataEmissao
                + "\n Produtos: " + produtos
                + "\n Valor Total" + valorTotal
                + "\n Funcionario Responsavel:" + funcionarioResponsavel
                + "\n Destinatario:" + destinatario
                + "\nRemetente:" + remetente;
    }
}
