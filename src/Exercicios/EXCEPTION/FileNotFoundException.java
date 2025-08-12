package Exercicios.EXCEPTION;

public class FileNotFoundException {
    public static void main(String[] args) {
        try {
            new java.io.FileInputStream("arquivo.txt");
        } catch (java.io.FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
