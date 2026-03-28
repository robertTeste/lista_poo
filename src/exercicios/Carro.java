package exercicios;
public class Carro {
    String marca;
    String modelo;
    int ano;

    void exibir() {
        System.out.println(marca + " " + modelo + " " + ano);
    }

    int idadeDoCarro() {
        return 2026 - ano;
    }
}