package FabricaCarro.test;

import FabricaCarro.model.Car;
import FabricaCarro.model.Engine;

public class TestCar {
    public static void main(String[] args) {
        Car fusca = new Car();
        Engine engine = new Engine();

        fusca.setModel("Fusca");
        fusca.setColor("Blue");
        fusca.setCurrentSpeed(0);
        fusca.setMaxSpeed(90);
        fusca.setEngine(engine);

        fusca.turnOn();
        fusca.accelerate(50);
        System.out.println("Gear: " + fusca.gear());
    }
}
