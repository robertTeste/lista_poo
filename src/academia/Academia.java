package academia;

import java.util.ArrayList;

public class Academia {

    private ArrayList<Aluno> alunos = new ArrayList<>();

    static int totalAlunos = 0;

    static final int LIMITE_MAXIMO = 50;

    /*
    static → contador compartilhado entre todos os objetos
    final → valor constante (limite nunca muda)
    */

    public void cadastrarAluno(Aluno aluno) {

        /*
        Controle de capacidade:
        não permite passar de 50 alunos
        */

        if (alunos.size() >= LIMITE_MAXIMO) {
            System.out.println("Academia lotada!");
            return;
        }

        alunos.add(aluno);
        totalAlunos++;

        System.out.println("Aluno cadastrado!");
    }

    public void listarAlunos() {

        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }

        for (Aluno a : alunos) {
            a.exibir();
        }
    }

    public int getTotalAlunos() {
        return totalAlunos;
    }
}