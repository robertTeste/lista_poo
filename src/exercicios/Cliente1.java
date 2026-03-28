package exercicios;

public class Cliente1 {
        private String nome;
        private String email;
        private String telefone;
        public static int totalClientes = 0; // Atributo estático (compartilhado)

        // a) Construtor completo
        public Cliente1(String nome, String email, String telefone) {
            this.nome = nome;
            this.email = email;
            this.telefone = telefone;
            totalClientes++;
        }

        // b) Construtor com 2 parâmetros
        public Cliente1(String nome, String email) {
            this(nome, email, "Não informado");
        }

        // c) Construtor com 1 parâmetro
        public Cliente1(String nome) {
            this(nome, "Não informado", "Não informado");
        }

        public void imprimir() {
            System.out.println("Nome: " + nome + " | Email: " + email + " | Tel: " + telefone);
        }
    }

