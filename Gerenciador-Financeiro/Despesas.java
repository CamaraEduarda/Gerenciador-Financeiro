public class Despesas extends Transacao{

    public Despesas(String descricao, double valor, String categoria) {
        super(descricao, valor, categoria);
        //TODO Auto-generated constructor stub
    }

    @Override
    void Criar() {
        System.out.println("Salvando despesa: " + getDescricao());
    }
    
}
