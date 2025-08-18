package Banco.test;

public class TesteComString01 {
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
    }
}
