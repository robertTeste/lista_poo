package estacionamento;

import java.util.ArrayList;

public class Estacionamento {

    private ArrayList<Carro> vagas = new ArrayList<>();

    static final int CAPACIDADE_MAXIMA = 20;

    public void entrarCarro(Carro carro) {

        if (vagas.size() >= CAPACIDADE_MAXIMA) {
            System.out.println("Estacionamento LOTADO!");
        } else {
            vagas.add(carro);
            System.out.println("Carro entrou!");
        }
    }

    public void sairCarro(String placa) {

        for (int i = 0; i < vagas.size(); i++) {
            if (vagas.get(i).getPlaca().equalsIgnoreCase(placa)) {
                vagas.remove(i);
                System.out.println("Carro removido!");
                return;
            }
        }

        System.out.println("Carro não encontrado!");
    }

    public void listar() {
        if (vagas.isEmpty()) {
            System.out.println("Nenhum carro estacionado.");
            return;
        }

        for (Carro c : vagas) {
            c.exibir();
        }
    }

    public int vagasOcupadas() {
        return vagas.size();
    }

    public int vagasLivres() {
        return CAPACIDADE_MAXIMA - vagas.size();
    }
}