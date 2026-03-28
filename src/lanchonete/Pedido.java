package lanchonete;

public class Pedido {

    private String nomeCliente;
    private Lanche lanche;

    static int totalPedidos = 0;

    public Pedido(String nomeCliente, Lanche lanche) {
        this.nomeCliente = nomeCliente;
        this.lanche = lanche;
        totalPedidos++;
    }

    public void exibir() {
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Lanche: " + lanche.getNome());
        System.out.println("Preço: R$ " + lanche.getPreco());
        System.out.println("-----------------------");
    }
}
