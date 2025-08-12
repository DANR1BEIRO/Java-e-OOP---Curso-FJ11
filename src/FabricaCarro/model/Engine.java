package FabricaCarro.model;

public class Engine {
    private int horsePower;
    private boolean running;

    public Engine() {
    }

    public Engine(int horsePower, boolean running) {
        this.horsePower = horsePower;
        this.running = running;
    }

    public boolean start() {
        if (!running) {
            running = true;
            System.out.println("Engine started");
            return true;
        } else {
            System.out.println("Engine not running.");
            return false;
        }
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }
}
