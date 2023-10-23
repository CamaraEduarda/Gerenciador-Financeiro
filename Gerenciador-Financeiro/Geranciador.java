import java.util.ArrayList;

public class Geranciador {
    ArrayList<Transacao> transacoes = new ArrayList<>();
    ArrayList<Orcamento> orcamentos = new ArrayList<>();

    public void Creat(Transacao transacao){
        transacoes.add(transacao);
        transacao.Criar();
    }

    public void Update(int indice, Transacao transacao){
        transacoes.set(indice, transacao);

    }

    public void Remove(int indice){
        transacoes.remove(indice);
    }

    public void Exibir(){
        for (Transacao transacao : transacoes) {
            System.out.println("Categoria: " + transacao.getCategoria() + "Descrição: " + transacao.getDescricao() +"Valor: " + transacao.getValor());
        }
    }

    public void CreatOrcamento(Orcamento orcamento){
        orcamentos.add(orcamento);
    }

    public void ExibirOrcamento(){
        for (Orcamento orcamento : orcamentos) {
            System.out.println("Categoria: " + orcamento.getCategoria() + "Limite: " + orcamento.getLimite());
        }
    }
    
}
