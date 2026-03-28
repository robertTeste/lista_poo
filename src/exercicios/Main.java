package exercicios;

public class Main {
    public static void main(String[] args) {

   /* int x;

    if(true){
        x = 10;
    };

    System.out.println(x);

        Não compila. O IntelliJ vai deixar o x
        dentro do println vermelho e mostrar o erro:
        "Cannot resolve symbol 'x'".


        int x = 0; // Declarada fora do IF, no escopo do mét

        if (true) {
            x = 10; // Atribui o valor 10
        }

        System.out.println(x);*/
        /*O que é escopo? Escopo é a região do código onde uma variável "vive" e pode ser acessada.
        No Java, o escopo é definido pelo par de chaves { } onde a variável foi criada.

        Por que o x não existia fora do if? Porque quando você declara int x dentro do if, ela nasce e morre ali dentro. Assim que o Java chega na chave de
        fechamento }, ele "descarta" a variável x da memória para economizar espaço. Por isso, o System.out.println que está do lado de fora não consegue
        encontrá-l*/


        /* int a = 10;
        int b = a;
        b = 99;

        System.out.println("a = " + a);
        System.out.println("b = " + b);



        a = 10
        b = 99
        */

        Carro c1 = new Carro("Fiat", "Uno", 2020);
        Carro c2 = c1;

        c2.setModelo("Palio");

        /*
a) Resultado no Console
Ao rodar esse código, o resultado será:
Modelo de c1: Palio
Modelo de c2: Palio

so acontece porque, em Java, quando você faz Carro c2 = c1;, você não está criando um novo carro. Você está criando uma nova "etiqueta" (referência) que aponta para o mesmo objeto que já existia na memória.

O que eles compartilham?
Eles compartilham o mesmo endereço de memória.
Imagine que c1 é uma chave para uma casa.
Ao fazer c2 = c1, você tirou uma cópia da chave.
Agora, se você entrar na casa com a chave c2 e pintar a parede de azul,
 quando você entrar com a chave c1,
a parede também estará azul, porque a casa (o objeto) é a mesma.

A diferença fundamental entre um int e um objeto Carro é onde os dados realmente moram e como o Java os copia:

Exercício 11 (int - Valor): O dado vive na Stack. Ao fazer y = x, o Java cria uma cópia real do número.
São duas caixas separadas; mexer em uma não afeta a outra.

Exercício 12 (Carro - Referência): O objeto real vive na Heap. Na Stack, ficam apenas "controles remotos" (c1 e c2) que guardam o endereço do objeto.
Ao fazer c2 = c1, você apenas deu o mesmo endereço para os dois.
Como ambos apontam para o mesmo objeto na Heap, qualquer mudança por um reflete no outro.
        */
    }
}