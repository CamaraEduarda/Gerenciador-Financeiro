public class Receita extends Transacao {

    public Receita(String descricao, double valor, String categoria) {
        super(descricao, valor, categoria);
        //TODO Auto-generated constructor stub
    }

    @Override
    void Criar() {
        System.out.println("Salvando receita: " + getDescricao());
    }
    
}
