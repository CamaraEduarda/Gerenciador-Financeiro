import java.util.ArrayList;
import java.util.List;

public class Despesas extends Transacao{

    public Despesas(String descricao, double valor, String categoria) {
        super(descricao, valor, categoria);
        //TODO Auto-generated constructor stub
    }

    @Override
    void Criar() {
        System.out.println("Salvando despesa: " + getDescricao());
    }

    
    

    public static void main(String[] args) {
        Despesas d1 = new Despesas("ida ao IF", 5, "Transporte");
        Despesas d2 = new Despesas("lanche IF", 3, "Alimentacao");
        Despesas d3 = new Despesas("volta do IF", 7, "Transporte");
        Despesas d4 = new Despesas("material IF", 2, "Estudos");
        Despesas d5 = new Despesas("caneta", 8, "Estudos");

        List<Despesas> despesas = new ArrayList<>();
        despesas.add(d1);
        despesas.add(d2);
        despesas.add(d3);
        despesas.add(d4);
        despesas.add(d5);

        List<Despesas> filtro1 = despesas.stream().filter(despesa -> despesa.getCategoria().equals("Estudos")).toList();
        List<Despesas> filtro2 = despesas.stream().filter(despesa -> despesa.getValor() <= 5).toList();
        
        for (Despesas despesas2 : filtro2) {
            System.out.println(despesas2);
        }
    }

    @Override
    public String toString() {
        return "Despesas [descricao='" + getDescricao() + "']";
    }
}
