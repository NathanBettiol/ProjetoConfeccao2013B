package br.senai.sc.model.negocio;



import java.util.Calendar;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 * @version 1.0
 * @author nathan_bettiol
 */

// Classe Entrada onde seram recebidas as informações de entrada de Produtos no Sistima

public class Entrada {
    
    //Declaração das Variaveis
    private  int codigo;
    private  double preco;
    private  String dtEmissao;
    private String produto;
    private int qtProduto;
    private int nrNotaFiscal;

    //Construtor sem parametros
    
    public Entrada() {
    }
   
    //Final Construtor sem parametro--------------------------------------------
    
    //Getters and Setters
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDtEmissao() {
        return dtEmissao;
    }

    public void setDtEmissao(String dtEmissao) {
        this.dtEmissao = dtEmissao;
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
    
    //Metodos
    
    
    //Metodo para alteração dos preços
    public double alteraPreco(double preco){
    
       preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o novo Preço do Produto: "));
        
        return this.preco;
    }
    
    //Metodo para alteração dos nomes dos produtos
    public String alteraNomeProduto(String produto){
    
       produto = JOptionPane.showInputDialog("Digite o novo nome do Produto: ");
        
        return this.produto;
    }
    
    
    //Metodo para alteração das quantidades de produtos
      public int alteraQtProduto(int qtProduto){
    
       qtProduto = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade em estoque: "));
        
        return this.qtProduto;
    }
    
    //Final Metodos--------------------------------------------
    
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
