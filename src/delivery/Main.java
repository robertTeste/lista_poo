package delivery;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Marmita> cardapio = new ArrayList<>();
        ArrayList<Pedido> pedidos = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n1) Cadastrar marmita");
            System.out.println("2) Listar cardápio");
            System.out.println("3) Fazer pedido");
            System.out.println("4) Listar pedidos");
            System.out.println("5) Total de pedidos");
            System.out.println("6) Total vendido");
            System.out.println("7) Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Descrição: ");
                    String desc = sc.nextLine();

                    System.out.print("Tamanho (P/M/G): ");
                    String tam = sc.nextLine();

                    cardapio.add(new Marmita(desc, tam));
                    break;

                case 2:
                    if (cardapio.isEmpty()) {
                        System.out.println("Cardápio vazio!");
                    } else {
                        for (int i = 0; i < cardapio.size(); i++) {
                            System.out.print(i + " - ");
                            cardapio.get(i).exibir();
                        }
                    }
                    break;

                case 3:
                    if (cardapio.isEmpty()) {
                        System.out.println("Cadastre marmitas primeiro!");
                        break;
                    }

                    System.out.print("Nome do cliente: ");
                    String cliente = sc.nextLine();

                    System.out.println("Escolha uma marmita:");
                    for (int i = 0; i < cardapio.size(); i++) {
                        System.out.print(i + " - ");
                        cardapio.get(i).exibir();
                    }

                    int escolha = sc.nextInt();

                    if (escolha >= 0 && escolha < cardapio.size()) {
                        pedidos.add(new Pedido(cliente, cardapio.get(escolha)));
                    } else {
                        System.out.println("Opção inválida!");
                    }

                    break;

                case 4:
                    if (pedidos.isEmpty()) {
                        System.out.println("Nenhum pedido feito.");
                    } else {
                        for (Pedido p : pedidos) {
                            p.exibir();
                        }
                    }
                    break;

                case 5:
                    System.out.println("Total de pedidos: " + Pedido.totalPedidos);
                    break;

                case 6:
                    System.out.println("Total vendido: R$ " + calcularTotal(pedidos));
                    break;

                case 7:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 7);

        sc.close();
    }

    // MÉTODO COM RETORNO (exigido)
    public static double calcularTotal(ArrayList<Pedido> pedidos) {

        double soma = 0;

        for (Pedido p : pedidos) {
            soma += p.getValor();
        }

        return soma;
    }
}