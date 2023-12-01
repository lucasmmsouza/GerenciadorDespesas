import java.util.Scanner;

public class MenuDespesas {

    private GerenciadorDespesas gerenciador;

    public MenuDespesas(GerenciadorDespesas gerenciador) {
        this.gerenciador = gerenciador;
    }

    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        GerenciadorDespesas gerenciador = new GerenciadorDespesas();

        while (true) {
            System.out.println("1. Adicionar Despesa Fixa");
            System.out.println("2. Adicionar Despesa Variável");
            System.out.println("3. Excluir Despesa");
            System.out.println("4. Mostrar Despesas");
            System.out.println("5. Calcular Gasto Total");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.print("Data: ");
                    String dataFixa = scanner.nextLine();
                    System.out.print("Categoria: ");
                    String categoriaFixa = scanner.nextLine();
                    System.out.print("Vencimento: ");
                    String vencimentoFixa = scanner.nextLine();
                    System.out.print("Valor: ");
                    double valorFixa = scanner.nextDouble();


                    gerenciador.adicionarDespesa(new DespesaFixa(dataFixa, categoriaFixa, valorFixa, vencimentoFixa));
                    break;

                case 2:
                    System.out.print("Data: ");
                    String dataVariavel = scanner.nextLine();
                    System.out.print("Categoria: ");
                    String categoriaVariavel = scanner.nextLine();
                    System.out.print("Valor: ");
                    double valorVariavel = scanner.nextDouble();
                    System.out.print("Parcelas: ");
                    int parcelasVariavel = scanner.nextInt();

                    gerenciador.adicionarDespesa(new DespesaVariavel(dataVariavel, categoriaVariavel, valorVariavel, parcelasVariavel));
                    break;
                case 3:
                    System.out.print("Índice da Despesa a ser excluída: ");
                    int indiceExclusao = scanner.nextInt();
                    gerenciador.excluirDespesa(indiceExclusao);
                    break;
                case 4:
                    gerenciador.mostrarDespesas();
                    break;
                case 5:
                    System.out.println("Gasto Total: " + gerenciador.calcularGastoTotal());
                    break;
                case 6:
                    System.out.println("Saindo do programa. Até mais!");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}

