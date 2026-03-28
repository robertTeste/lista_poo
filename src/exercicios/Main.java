package exercicios;

public class Main {
    public static void main(String[] args) {

        Carro c1 = new Carro();
        c1.marca = "Toyota";
        c1.modelo = "Corolla";
        c1.ano = 2020;

        Carro c2 = new Carro();
        c2.marca = "Honda";
        c2.modelo = "Civic";
        c2.ano = 2018;

        System.out.printf("Marca: %d, Modelo: %d, Ano: %s",c1.marca, c1.modelo, c1.ano);
        System.out.printf("Marca: %d, Modelo: %d, Ano: %s",c2.marca, c2.modelo, c2.ano);
    }
}