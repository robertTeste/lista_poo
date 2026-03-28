package estacionamento;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Estacionamento est = new Estacionamento();

        int opcao;

        do {
            System.out.println("\n1) Entrar carro");
            System.out.println("2) Sair carro");
            System.out.println("3) Listar carros");
            System.out.println("4) Vagas ocupadas");
            System.out.println("5) Vagas livres");
            System.out.println("6) Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Placa: ");
                    String placa = sc.nextLine();

                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();

                    est.entrarCarro(new Carro(placa, modelo));
                    break;

                case 2:
                    System.out.print("Digite a placa: ");
                    String p = sc.nextLine();

                    est.sairCarro(p);
                    break;

                case 3:
                    est.listar();
                    break;

                case 4:
                    System.out.println("Ocupadas: " + est.vagasOcupadas());
                    break;

                case 5:
                    System.out.println("Livres: " + est.vagasLivres());
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
