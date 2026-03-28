package lanchonete;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      init Scanner sc = new Scanner(System.in);

        ArrayList<Lanche> cardapio = new ArrayList<>();
        ArrayList<Pedido> pedidos = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n1) Cadastrar lanche");
            System.out.println("2) Listar cardápio");
            System.out.println("3) Fazer pedido");
            System.out.println("4) Listar pedidos");
            System.out.println("5) Total de pedidos");
            System.out.println("6) Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Nome do lanche: ");
                    String nome = sc.nextLine();

                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();

                    cardapio.add(new Lanche(nome, preco));
                    break;

                case 2:
                    System.out.println("\nCARDÁPIO:");
                    for (int i = 0; i < cardapio.size(); i++) {
                        System.out.print(i + " - ");
                        cardapio.get(i).exibir();
                    }
                    break;

                case 3:
                    if (cardapio.isEmpty()) {
                        System.out.println("Cardápio vazio!");
                        break;
                    }

                    System.out.print("Nome do cliente: ");
                    String cliente = sc.nextLine();

                    System.out.println("Escolha o lanche:");
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
                    System.out.println("\nPEDIDOS:");
                    for (Pedido p : pedidos) {
                        p.exibir();
                    }
                    break;

                case 5:
                    System.out.println("Total de pedidos: " + Pedido.totalPedidos);
                    break;

                case 6:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 6);

        sc.close();
    }
}
