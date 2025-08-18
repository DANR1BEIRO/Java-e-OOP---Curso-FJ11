package Banco.test;

class ImpressorDeStrings {
    public static void inverterTexto(String texto) {
        System.out.println("Texto original: " + texto);
        System.out.print("Texto invertido: ");

        for (int i = texto.length() - 1; i >= 0; i--) {
            System.out.print(texto.charAt(i));
        }
        System.out.println("");
    }

    public static void inverterOrdemDasPalavras(String texto) {
        System.out.println("Texto original: " + texto);
        System.out.print("Inverter ordem das palavras: ");

        String[] palavras = texto.split(" ");
        for (int i = palavras.length - 1; i >= 0; i--) {
            System.out.print(palavras[i]);
            if (i > 0) {
                System.out.print(" ");
            }
        }
        System.out.println(" ");
    }

    public static void inverterCaractereDasPalavra(String texto) {
        String[] palavras = texto.split(" ");
        for (int i = 0; i < palavras.length; i++) {

            String palavraAtual = palavras[i];
            String palavraInvertida = getTextoInvertido(palavraAtual);
            System.out.print(palavraInvertida);

            if (i < palavras.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println(" ");
    }

    public static String getTextoInvertido(String texto) {
        StringBuilder builder = new StringBuilder();
        for (int i = texto.length() - 1; i >= 0; i--) {
            builder.append(texto.charAt(i));
        }
        return builder.toString();
    }
}

public class StringTest01 {
    public static void main(String[] args) {
        String goku = "goku12";
        String gokuSemNumero = goku.replace("1", "8");
        System.out.println(gokuSemNumero);

        System.out.println(goku.concat(gokuSemNumero));
        System.out.println(goku.isEmpty());
        System.out.println(goku.subSequence(1, 4));
        System.out.println(goku.substring(3));
        System.out.println(goku.contains("oku"));
        System.out.println(goku.contentEquals("oku"));

        ImpressorDeStrings.inverterTexto("Goku da silva");
        ImpressorDeStrings.inverterOrdemDasPalavras("goku da silva");
        ImpressorDeStrings.inverterCaractereDasPalavra("goku da silva");
        System.out.println("Texto invertido com StringBuilder: " + ImpressorDeStrings.getTextoInvertido("Goku da silva"));
    }
}
