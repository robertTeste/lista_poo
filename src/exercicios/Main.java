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


        int a = 10;
        int b = a;
        b = 99;

        System.out.println("a = " + a);
        System.out.println("b = " + b);


        /*
        a = 10
        b = 99
        */
    }
}