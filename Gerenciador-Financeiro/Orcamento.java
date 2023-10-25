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

    public double getAlerta() {
        return alerta;
    }


}