import java.util.Scanner;

public class Menu  {
    public static void main(String[] args) throws AlertaException {

        Geranciador geranciador = new Geranciador();
        Scanner sc = new Scanner(System.in);
        

            while (true) {
                System.out.println("\t Menu");
                System.out.println("1) Adicionar Despesa");
                System.out.println("2) Adicionar Receita");
                System.out.println("3) Adicionar Orçamento");
                System.out.println("4) Exibir Transações");
                System.out.println("5) Exibir Orçamentos");
                System.out.println("6) Remover Despesas");
                System.out.println("7) Remover Receitas");
                System.out.println("8) Filtrar");
                System.out.println("9) Sair");

                int opc = sc.nextInt();

                switch (opc) {

                    case 1:
                        System.out.println("Digite a descrição da despesa: ");
                        String descricao = sc.nextLine();

                        System.out.println("Digite o valor da despesa: ");
                        double valor = sc.nextDouble();

                        System.out.println("Digite a categoria da despesa: ");
                        String categoria = sc.nextLine();

                        Despesas dispesa = new Despesas(descricao, valor, categoria);
                        geranciador.creat(dispesa);
                        
                        break;


                    case 2:
                        System.out.println("Digite a descrição da receita: ");
                        String descricaoReceita = sc.nextLine();

                        System.out.println("Digite o valor da receita: ");
                        double valorReceita = sc.nextDouble();

                        System.out.println("Digite a categoria da receita: ");
                        String categoriaReceita = sc.nextLine();

                        Receita receita = new Receita(descricaoReceita, valorReceita, categoriaReceita);
                        geranciador.creat(receita);
                        
                        break;


                    case 3:
                        System.out.println("Digite a categoria do orçamento: ");
                        String categoriaOrcamento = sc.nextLine();

                        System.out.println("Digite o valor do orçamento: ");
                        double valorOrcamento = sc.nextDouble();

                        System.out.println("Digite o alerta de limite do orçamento: ");
                        double alerta = sc.nextDouble();

                        Orcamento orcamento = new Orcamento(categoriaOrcamento, valorOrcamento, alerta);
                        geranciador.creatOrcamento(orcamento);

                        break;


                    case 4:
                        geranciador.getTransacoes();
                        break;


                    case 5:
                        geranciador.getOrcamentos();
                        break;


                    case 6:
                        System.out.println("Digite a descrição da despesa que você deseja remover: ");
                        String descricaoD = sc.nextLine();
                        geranciador.remove(descricaoD);
                        break;


                    case 7:
                        System.out.println("Digite a descrição da receita que você deseja remover: ");
                        String descricaoR = sc.nextLine();
                        geranciador.remove(descricaoR);
                        break;
                        

                    case 8:
                        System.out.println("\t Escolha pelo que você deseja filtrar:");
                        System.out.println("1) Categoria");
                        System.out.println("2) Valor");
                
                        int escolha = sc.nextInt();

                        if (escolha == 1) {
                            System.out.println("Digite a categoria que você deseja filtrar: ");
                            String categoriaFiltrar = sc.nextLine();
                           

                        } else if (escolha == 2) {
                            System.out.println("Digite o que você deseja filtrar: ");
                            String tipo = sc.nextLine();

                            System.out.println("Digite o valor que você deseja filtrar: ");
                            double valorFiltrar = sc.nextDouble();

                            System.out.println("Como a filtragem deve ser ? ");
                            System.out.println("1) Valores >= "+valorFiltrar+" ?");
                            System.out.println("2) Valores <= "+valorFiltrar+" ?");
                            int opcao = sc.nextInt();
                            geranciador.filtrarPorValor(tipo, valorFiltrar, opcao);
                                   
                            

                        /*
                        } else if (escolha == 3) {
                            System.out.println("Digite a descrição que você deseja filtrar: ");
                            String descricaoFiltrar = sc.nextLine();
                            geranciador.filtrar(descricaoFiltrar);
                        */
                        } else {
                            System.out.println("Opção inválida!");
                        }

                        break;


                    case 9:
                        System.out.println("Saindo...");
                        geranciador.SalvarArquivo();
                        sc.close();
                        System.exit(0);


                    default:
                        System.out.println("Opção inválida");
                        
                }
            }
    }
}
