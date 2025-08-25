package Exercicios;

class Programa implements Runnable {
    private int id;

    public Programa(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("Programa " + id + " Valor: " + i);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

public class ThreadsTest01 {
    public static void main(String[] args) {
        Programa p1 = new Programa(1);
        Thread t1 = new Thread(p1);
        t1.start();

        Programa p2 = new Programa(2);
        Thread t2 = new Thread(p2);
        t2.start();

        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 500; i++) {
                    System.out.println("programa 3 valor " + i);
                }
            }
        };

        Thread t3 = new Thread(r);
        t3.start();
    }
}
