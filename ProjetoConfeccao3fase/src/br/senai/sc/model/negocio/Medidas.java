package br.senai.sc.model.negocio;

/**
 * @version 1.0 28/08/2013
 * @author gustavo_lourenco
 */
public class Medidas {

    private int codigo;
    private String nomeUsuario;
    private double mdBusto;
    private double mdCintura;
    private double mdQuadril;
    private double mdOmbros;
    private double altura;

    public Medidas() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public double getMdBusto() {
        return mdBusto;
    }

    public void setMdBusto(double mdBusto) {
        this.mdBusto = mdBusto;
    }

    public double getMdCintura() {
        return mdCintura;
    }

    public void setMdCintura(double mdCintura) {
        this.mdCintura = mdCintura;
    }

    public double getMdQuadril() {
        return mdQuadril;
    }

    public void setMdQuadril(double mdQuadril) {
        this.mdQuadril = mdQuadril;
    }

    public double getMdOmbros() {
        return mdOmbros;
    }

    public void setMdOmbros(double mdOmbros) {
        this.mdOmbros = mdOmbros;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Medidas other = (Medidas) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Medidas{" + "codigo=" + codigo + ", nomeUsuario=" + nomeUsuario + ", mdBusto=" + mdBusto + ", mdCintura=" + mdCintura + ", mdQuadril=" + mdQuadril + ", mdOmbros=" + mdOmbros + ", altura=" + altura + '}';
    }
}
