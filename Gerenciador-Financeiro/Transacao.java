public class Transacao implements Funcionalidades{
    
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

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Transacao [descricao=" + descricao + ", valor=" + valor + ", categoria=" + categoria + "]";
    }

    @Override
    public void Create() {
        
    }

    @Override
    public Transacao Retrieve() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Retrieve'");
    }

    @Override
    public void Update() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Update'");
    }

    @Override
    public void Delete() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Delete'");
    }



}