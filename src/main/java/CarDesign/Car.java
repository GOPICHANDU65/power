package CarDesign;

import java.util.List;

public class Car {
    Ac ac;
    Battery battery;
    Break aBreak;
    List<Door> doorList;
    Engine engine;
    FuelTank fuelTank;
    Lights lights;
    List<Wheel> wheelList;

    @Override
    public String toString() {
        return "Car{" +
                "ac=" + ac +
                ", battery=" + battery +
                ", aBreak=" + aBreak +
                ", doorList=" + doorList +
                ", engine=" + engine +
                ", fuelTank=" + fuelTank +
                ", lights=" + lights +
                ", wheelList=" + wheelList +
                '}';
    }
}
