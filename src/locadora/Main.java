package locadora;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Filme> filmes = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n1) Cadastrar filme");
            System.out.println("2) Listar filmes");
            System.out.println("3) Total de filmes");
            System.out.println("4) Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();

                    System.out.print("Gênero: ");
                    String genero = sc.nextLine();

                    System.out.print("Ano: ");
                    int ano = sc.nextInt();

                    filmes.add(new Filme(titulo, genero, ano));
                    break;

                case 2:
                    if (filmes.isEmpty()) {
                        System.out.println("Nenhum filme cadastrado.");
                    } else {
                        for (Filme f : filmes) {
                            f.exibir();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Total: " + Filme.totalFilmes);
                    break;

                case 4:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 4);

        sc.close();
    }
}
