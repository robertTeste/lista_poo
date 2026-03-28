package exercicios;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Carro> lista = new ArrayList<>();

        int opcao;

        do {
            System.out.println("1) Cadastrar");
            System.out.println("2) Listar");
            System.out.println("3) Total");
            System.out.println("4) Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Marca: ");
                    String marca = sc.nextLine();

                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();

                    System.out.print("Ano: ");
                    int ano = sc.nextInt();

                    lista.add(new Carro(marca, modelo, ano));
                    break;

                case 2:
                    for (Carro c : lista) {
                        c.exibir();
                    }
                    break;

                case 3:
                    System.out.println(Carro.totalCarros);
                    break;
            }

        } while (opcao != 4);

        sc.close();
    }
}