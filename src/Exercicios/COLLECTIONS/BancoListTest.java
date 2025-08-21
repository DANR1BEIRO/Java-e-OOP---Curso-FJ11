package Exercicios.COLLECTIONS;

import Banco.model.conta.Conta;
import Banco.model.conta.ContaCorrente;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

class Banco {
    private List<Conta> contas;
    private Map<String, Conta> dicionario = new HashMap<>();

    public void adiciona(Conta conta) {
        contas.add(conta);
        if (!dicionario.containsKey(conta.getTitular().getNome())) {
            dicionario.put(conta.getTitular().getNome(), conta);
        }
    }

    public Conta getByIndex(int x) {
        try {
            return contas.get(x);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Conta getByName(String name) {
        return dicionario.get(name);
    }

    public int getQuantidadeDeContas() {
        return contas.size();
    }
}

public class BancoListTest {
    public static void main(String[] args) {

        HashSet<Conta> contaHashSet = new HashSet<>();
        ContaCorrente c1 = new ContaCorrente(1, 200);
        ContaCorrente c2 = new ContaCorrente(1, 200);

        contaHashSet.add(c1);
        contaHashSet.add(c2);
        System.out.println(contaHashSet.size());

    }
}
