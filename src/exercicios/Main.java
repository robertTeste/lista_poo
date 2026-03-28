package exercicios;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Carro> lista = new ArrayList<>();

        lista.add(new Carro());
        lista.get(0).marca = "Toyota";
        lista.get(0).modelo = "Corolla";
        lista.get(0).ano = 2020;

        lista.add(new Carro());
        lista.get(1).marca = "Honda";
        lista.get(1).modelo = "Civic";
        lista.get(1).ano = 2018;

        lista.add(new Carro());
        lista.get(2).marca = "Ford";
        lista.get(2).modelo = "Ka";
        lista.get(2).ano = 2015;

        for (Carro c : lista) {
            c.exibir();
        }
    }
}