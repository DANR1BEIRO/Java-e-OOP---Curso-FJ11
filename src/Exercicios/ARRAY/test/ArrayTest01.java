package Exercicios.ARRAY.test;

public class ArrayTest01 {
    public static void main(String[] args) {
        /* O problema
        Dentro de um bloco, podemos declarar diversas variáveis e usá-las:
         */

        int idade1;
        int idade2;
        int idade3;

        /*
        Isso pode se tornar um problema quando precisamos mudar a quantidade de variáveis
        a serem declaradas de acordo com um parâmetro. Esse parâmetro pode variar, como por exemplo,
        a quantidade de números contidos num bilhete de loteria. Um jogo simples possui 6 números,
        mas podemos comprar um bilhete mais caro, com 7 números ou mais.*/

        int[] idades;

        /*
        o int[] é um tipo. Uma array é sempre um objeto, portanto, a variável idades é uma referência.
        Vamos precisar criar um objeto para poder usar a array. */

        idades = new int[10];

        /*
        O que fizemos foi criar uma array de int de 10 posições e atribuir o endereço no qual ela foi criada.
        Podemos ainda acessar  as posições do array: */

        idades[5] = 10;

        /*
        O código acima altera a sexta posição do array. No Java, os índices do array vão de 0 a n-1,
        onde n é o tamanho dado no momento em que você criou o array. Se você tentar acessar uma posição
        fora desse alcance, um erro ocorrerá durante a execução: ArrayIndexOutOfBoundsException

        No caso do bilhete de loteria, podemos utilizar o mesmo recurso. Mais ainda, a quantidade de números do
        nosso bilhete pode ser definido por uma variável. Considere que n indica quantos números nosso bilhete
        terá, podemos então fazer:No caso do bilhete de loteria, podemos utilizar o mesmo recurso. Mais ainda,
        a quantidade de números do nosso bilhete pode ser definido por uma variável. Considere que n indica
        quantos números nosso bilhete terá, podemos então fazer:

        int numerosDoBilhete = new int[n];

        */
    }
}
