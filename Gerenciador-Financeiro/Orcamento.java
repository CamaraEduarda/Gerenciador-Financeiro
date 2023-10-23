public class Orcamento {
    
    private String categoria;
    private double valor;
    private double limite;

    public Orcamento(String categoria, double valor, double limite) {
        this.categoria = categoria;
        this.valor = valor;
        this.limite = limite;
    }
    
    public String getCategoria() {
        return categoria;
    }
    
    public double getValor() {
        return valor;
    }

    public double getLimite() {
        return limite;
    }


}