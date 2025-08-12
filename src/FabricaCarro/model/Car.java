package FabricaCarro.model;

public class Car {
    private String model;
    private String color;
    private int currentSpeed;
    private int maxSpeed;
    private Engine engine;

    public Car() {
    }

    public Car(String model, String color, int currentSpeed, int maxSpeed, Engine engine) {
        this.model = model;
        this.color = color;
        this.currentSpeed = currentSpeed;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
    }

    public void turnOn() {
        if (!engine.isRunning()) {
            engine.start();
            System.out.println("Engine running. The car turn on");
        } else {
            System.out.println("Engine not running. The car don't turn on.");
        }
    }

    public void accelerate(double speed) {
        this.currentSpeed += speed;
    }

    public int gear() {
        if (this.currentSpeed <= 0) {
            return 0;
        }

        if (this.currentSpeed > 0 && this.currentSpeed <= 40) {
            return 1;
        }

        if (this.currentSpeed > 40 && this.currentSpeed <= 80) {
            return 2;
        }

        return 3;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
