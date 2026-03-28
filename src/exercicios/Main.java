package exercicios;
public class Main {
    public static void main(String[] args) {

        Carro c1 = new Carro("Toyota", "Corolla", 2020);
        Carro c2 = new Carro();

        c1.exibir();
        c2.exibir();
        /*
        Construtor já cria o objeto completo
        */

    }
}