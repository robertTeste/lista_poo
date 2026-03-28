package academia;

public class Aluno {

    private String nome;
    private int idade;
    private String plano;

    public Aluno(String nome, int idade, String plano) {
        this.nome = nome;
        setIdade(idade);
        this.plano = plano;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getPlano() {
        return plano;
    }

    public void setIdade(int idade) {

        /*
        Validação de idade:
        academia só aceita alunos com 14 anos ou mais
        */

        if (idade < 14) {
            System.out.println("Idade mínima é 14 anos!");
        } else {
            this.idade = idade;
        }
    }

    public void exibir() {
        System.out.println(nome + " | " + idade + " anos | Plano: " + plano);
    }
}
