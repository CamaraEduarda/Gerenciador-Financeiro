public abstract class Transacao {
    
    private String descricao;
    private double valor;
    private String categoria;

    public Transacao(String descricao, double valor, String categoria) {
        this.descricao = descricao;
        this.valor = valor;
        this.categoria = categoria;
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    abstract void Criar();
   
}