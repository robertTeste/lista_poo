package academia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Academia academia = new Academia();

        int opcao;

        do {
            System.out.println("\n1) Cadastrar aluno");
            System.out.println("2) Listar alunos");
            System.out.println("3) Total de alunos");
            System.out.println("4) Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Idade: ");
                    int idade = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Plano (mensal/anual): ");
                    String plano = sc.nextLine();

                    academia.cadastrarAluno(new Aluno(nome, idade, plano));
                    break;

                case 2:
                    academia.listarAlunos();
                    break;

                case 3:
                    System.out.println("Total: " + academia.getTotalAlunos());
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