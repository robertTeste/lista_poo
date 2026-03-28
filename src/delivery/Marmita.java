package delivery;

public class Marmita {

    private String descricao;
    private String tamanho;

    // CONSTANTES DE PREÇO
    static final double PRECO_P = 18.0;
    static final double PRECO_M = 25.0;
    static final double PRECO_G = 32.0;

    /*
    static final → constantes
    representam preços fixos (não podem mudar)
    */

    public Marmita(String descricao, String tamanho) {
        this.descricao = descricao;
        setTamanho(tamanho);
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {

        /*
        Validação do tamanho (P, M ou G)
        */

        if (tamanho.equalsIgnoreCase("P") ||
                tamanho.equalsIgnoreCase("M") ||
                tamanho.equalsIgnoreCase("G")) {

            this.tamanho = tamanho.toUpperCase();

        } else {
            System.out.println("Tamanho inválido! Usando P como padrão.");
            this.tamanho = "P";
        }
    }

    public double getPreco() {

        /*
        método com retorno
        retorna o preço baseado no tamanho
        */

        switch (tamanho) {
            case "P":
                return PRECO_P;
            case "M":
                return PRECO_M;
            case "G":
                return PRECO_G;
            default:
                return 0;
        }
    }

    public void exibir() {
        System.out.println(descricao + " | " + tamanho + " | R$ " + getPreco());
    }
}