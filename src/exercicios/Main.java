package exercicios;
public class Main {
    public static void main(String[] args) {

        Carro c1 = new Carro();
        c1.marca = "Toyota";
        c1.modelo = "Corolla";
        c1.ano = 2012;

        c1.exibir();
        System.out.println(c1.idadeDoCarro());

        /*
        exibir() → só executa ação (void)
        idadeDoCarro() → retorna valor
        */
    }
}