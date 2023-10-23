public class Orcamento {
    
    private String categoria;
    private double valor;
    private double alerta;

    public Orcamento(String categoria, double valor, double alerta) {
        this.categoria = categoria;
        this.valor = valor;
        this.alerta = alerta;
    }
    
    public String getCategoria() {
        return categoria;
    }
    
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public double getAlerta() {
        return alerta;
    }
    public void setAlerta(double alerta) {
        this.alerta = alerta;
    }

}