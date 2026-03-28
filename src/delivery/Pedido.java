package delivery;

public class Pedido {

    private String nomeCliente;
    private Marmita marmita;

    static int totalPedidos = 0;

    /*
    static → contador global
    pertence à classe, não ao objeto
    */

    public Pedido(String nomeCliente, Marmita marmita) {
        this.nomeCliente = nomeCliente;
        this.marmita = marmita;
        totalPedidos++;
    }

    public double getValor() {
        return marmita.getPreco();
    }

    public void exibir() {
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Marmita: " + marmita.getDescricao());
        System.out.println("Tamanho: " + marmita.getTamanho());
        System.out.println("Valor: R$ " + getValor());
        System.out.println("--------------------------");
    }
}