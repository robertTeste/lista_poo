package locadora;

public class Filme {

    private String titulo;
    private String genero;
    private int ano;

    static int totalFilmes = 0;

    static final int ANO_MINIMO = 1895;

    /*
    final → constante (não pode mudar)
    representa o primeiro filme da história
    */

    public Filme(String titulo, String genero, int ano) {
        this.titulo = titulo;
        this.genero = genero;
        setAno(ano);
        totalFilmes++;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {

        /*
        Validação:
        não pode ser menor que 1895 nem maior que 2026
        */

        if (ano < ANO_MINIMO || ano > 2026) {
            System.out.println("Ano inválido!");
        } else {
            this.ano = ano;
        }
    }

    // MÉTODO COM RETORNO (exigido pelo exercício)
    public String classificarFilme() {

        /*
        Retorna se é clássico ou recente
        */

        if (ano < 2000) {
            return "Clássico";
        } else {
            return "Recente";
        }
    }

    public void exibir() {
        System.out.println(titulo + " | " + genero + " | " + ano +
                " | " + classificarFilme());
    }
}
