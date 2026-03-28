package exercicios;

public class Main {
    public static void main(String[] args) {
        // e) Criando um objeto com cada construtor
        Cliente1 c1 = new Cliente1("Ana", "ana@web.com", "9999-1111");
        Cliente1 c2 = new Cliente1("Bruno", "bruno@web.com");
        Cliente1 c3 = new Cliente1("Carla");

        // Imprimindo os dados
        c1.imprimir();
        c2.imprimir();
        c3.imprimir();

        // Exibindo o total acumulado pelo static
        System.out.println("Total de clientes: " + Cliente1.totalClientes);
    }
}
