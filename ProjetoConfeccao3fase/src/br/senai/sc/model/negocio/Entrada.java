package br.senai.sc.model.negocio;




import java.util.Date;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 * @version 1.0
 * @author nathan_bettiol
 */

// Classe Entrada onde seram recebidas as informações de entrada de Produtos no Sistima

public class Entrada {
   
    //Declaração das Variaveis
    private int codigo;
    private  double preco;
    private String produto;
    private Date dtEmissao;
    private int qtProduto;
    private int nrNotaFiscal;
    private String funcionario;



    //Construtor sem parametros
    
    public Entrada() {
    }
   
    //Final Construtor sem parametro--------------------------------------------
    
    //Getters and Setters dos atributos da classe entrada
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getDtEmissao() {
        return dtEmissao;
    }

    public void setDtEmissao(Date dtEmissao) {
        this.dtEmissao = dtEmissao;
    }
    
    

    public double getPreco() {
        return preco;
    }
       
    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQtProduto() {
        return qtProduto;
    }

    public void setQtProduto(int qtProduto) {
        this.qtProduto = qtProduto;
    }

    public int getNrNotaFiscal() {
        return nrNotaFiscal;
    }

    public void setNrNotaFiscal(int nrNotaFiscal) {
        this.nrNotaFiscal = nrNotaFiscal;
    }
    
    //Final Getters and Setters --------------------------------------------

    
    //To String Retorna os valores do Objeto.
   

    @Override
    public String toString() {
        return "Entrada{" + "codigo=" + codigo + ", preco=" + preco + ", dataEmissao=" + dtEmissao + ", produto=" + produto + ", qtProduto=" + qtProduto + ", nrNotaFiscal=" + nrNotaFiscal + '}';
    }

 //Final toString--------------------------------------------
    
    // Equals que vai ser usado mais a frente
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Entrada other = (Entrada) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (Double.doubleToLongBits(this.preco) != Double.doubleToLongBits(other.preco)) {
            return false;
        }
        if (!Objects.equals(this.dtEmissao, other.dtEmissao)) {
            return false;
        }
        if (!Objects.equals(this.produto, other.produto)) {
            return false;
        }
        if (this.qtProduto != other.qtProduto) {
            return false;
        }
        if (this.nrNotaFiscal != other.nrNotaFiscal) {
            return false;
        }
        return true;
    }
   //Final Equals-------------------------------------------- 
    
} 
