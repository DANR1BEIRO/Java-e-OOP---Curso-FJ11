package Exercicios.COLLECTIONS;

import Banco.model.conta.ContaCorrente;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente(1, 1000);
        ContaCorrente c2 = new ContaCorrente(2, 2000);

        Map<String, ContaCorrente> mapDeContas = new HashMap<>();
        mapDeContas.put("Gerente", c1);
        mapDeContas.put("Presidente", c2);

        ContaCorrente gerente = mapDeContas.get("Gerente");
        System.out.println("saldo do gerente: " + gerente.getSaldo());
        System.out.println(mapDeContas.containsKey("Presidente"));
        System.out.println(mapDeContas.containsValue(c1));
        System.out.println(mapDeContas.keySet());
        System.out.println(mapDeContas.values());

    }
}
