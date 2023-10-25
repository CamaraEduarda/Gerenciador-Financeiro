import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class Geranciador {
    ArrayList<Transacao> transacoes = new ArrayList<>();
    ArrayList<Orcamento> orcamentos = new ArrayList<>();


//Métodos para Transações

    public void creat(Transacao transacao){
        transacoes.add(transacao);
        transacao.Criar();
    }


    public void update(int indice, Transacao transacao){
        transacoes.set(indice, transacao);

    }


    public void remove(String descricao){
        transacoes.remove(descricao);
    }

 
    public void getTransacoes(){
        for (Transacao transacao : transacoes) {
            System.out.println("Categoria: " + transacao.getCategoria() + "Descrição: " + transacao.getDescricao() +"Valor: " + transacao.getValor());
        }
    }

    public void filtrar(Object filtro){
        for (Transacao transacao : transacoes) {
            if (transacao.getCategoria().equals(filtro)) {
                System.out.println(transacao);
            }
        }
    }

///////////////////////////////////////////////////


// Métodos para Orçamento

    public void creatOrcamento(Orcamento orcamento) throws AlertaException{
        orcamentos.add(orcamento);


        if (orcamento.getValor() == orcamento.getAlerta()){
            throw new AlertaException();  
        }
    }

    public void getOrcamentos(){
        for (Orcamento orcamento : orcamentos) {
            System.out.println("Categoria: " + orcamento.getCategoria() + "Alerta de limite: " + orcamento.getAlerta());
        }
    }

///////////////////////////////////////////////////

//Salvar arquivos

    public void SalvarArquivo(){
        try {
            FileWriter fileWriter = new FileWriter("Arquivo.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            for (Transacao transacao : transacoes) {
                printWriter.println(transacao);
            }
            printWriter.close();
            fileWriter.close();

        } catch (IOException e){
            System.out.println("Erro ao salvar as transações em um arquivo");
        }

    }

/////////////////////////////////////////////////// 
    

}
    
    

