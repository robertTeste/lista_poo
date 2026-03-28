package exercicios;
public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    static int totalCarros = 0;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        setAno(ano);
        totalCarros++;
    }

    public Carro() {
        this.marca = "Desconhecido";
        this.modelo = "Desconhecido";
        this.ano = 0;
        totalCarros++;
    }
    public static void imprimirTotal() {
        System.out.println("Total de carros criados: " + totalCarros);

        // b) Se você tentar a linha abaixo, o IntelliJ vai dar erro:
        // System.out.println(modelo);
        // c) O erro ocorre porque 'static' pertence à classe e 'modelo' pertence a um objeto.
        // O método static não sabe "qual" modelo imprimir, pois não há um objeto 'this' aqui.
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano < 1886 || ano > 2026) {
            System.out.println("Ano inválido!");
        } else {
            this.ano = ano;
        }
    }

    void exibir() {
        System.out.println(marca + " " + modelo + " " + ano);
    }
}