package Banco.test;

import Banco.model.conta.Cliente;
import Banco.model.conta.Conta;
import Banco.model.conta.ContaCorrente;

public class ContaTeste01 {
    public static void main(String[] args) {

        Cliente goku = new Cliente("Goku", "Kakaroto", "001", "0002");
        Conta[] contas = new Conta[10];
        contas[0] = new ContaCorrente(9090, 1000, goku, 400);
    }
}


/*
Pergunta:

Por que não podemos fazer new Conta() se Conta for abstrata, mas podemos fazer new Conta[10]?

Resposta direta:
Você não pode criar um objeto direto de uma classe abstrata porque ela é incompleta
tem métodos que não têm implementação, é tipo um molde, não um produto final.

Mas você pode criar um array que vai guardar referências de Conta, porque o array em si não é
um objeto Conta, é só um espaço para armazenar objetos do tipo Conta (ou suas subclasses).

Explicação com analogia:

Imagine que Conta é uma planta (o projeto de uma casa que está incompleto, sem paredes, sem teto).
Você não pode morar nessa casa porque ela não existe de verdade — é só um desenho.

Agora, criar Conta[10] é como criar um terreno com espaço para 10 casas. Você ainda não construiu
nenhuma casa (objeto Conta), só fez o espaço para elas (array).

Nesse terreno (array) você vai colocar as casas concretas que herdam da planta Conta, tipo ContaCorrente
ou ContaPoupanca. Até que você coloque essas casas, o terreno está vazio — tem só referências nulas.
Como funciona no código?

Conta[] contas = new Conta[10];  // ok, cria o array de referências
contas[0] = new ContaCorrente(); // ok, cria um objeto concreto e coloca no array
contas[1] = new ContaPoupanca(); // ok, idem
// contas[2] = new Conta(); --> erro! Não pode instanciar classe abstrata

Por que o array funciona?

O array é um objeto que armazena referências a objetos do tipo Conta, mas não cria objetos Conta
 dentro dele automaticamente. Ele só cria espaço para 10 referências que, inicialmente, valem null.

Só quando você coloca um objeto concreto (uma subclasse de Conta que não é abstrata)
naquele espaço é que tem um objeto real ali.
Resumindo:

new Conta() → erro, porque Conta é abstrata, incompleta.
new Conta[10] → ok, porque cria um array, um espaço para armazenar referências, não objetos.

Você precisa criar objetos concretos e colocar no array para trabalhar com eles.
*/
