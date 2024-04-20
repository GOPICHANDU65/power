package Service;

import CarDesign.*;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    public Car getCar(Car car){
        Ac ac = new Ac();
        ac.airFilter="yes";
        ac.windSpeed=6;

        Battery battery= new Battery();
        battery.capacity=5500;
        battery.company="chandu";

        Door door = new Door();
        door.doorType="auto";
        door.windowsType="fiber";

        Door door1 = new Door();
        door1.doorType="auto";
        door1.windowsType="fiber";

        Door door2 = new Door();
        door2.windowsType="auto";
        door2.windowsType="fiber";

        Door door3 = new Door();
        door3.windowsType="fiber";
        door3.doorType="auto";

        List<Door> doorList=new ArrayList<>();
        doorList.add(door);
        doorList.add(door1);
        doorList.add(door2);
        doorList.add(door3);

        Break abreak=new Break();
        abreak.handBreak="yes";
        abreak.legBreak="yes";

        Engine engine = new Engine();
        engine.engineOil="Castrol";
        engine.fuelType="petrol";
        engine.horsePower="5400";

        FuelTank fuelTank= new FuelTank();
        fuelTank.capacity=60;

        Lights lights = new Lights();
        lights.bodyLight="whiteGray";
        lights.frontLight="White";
        lights.signalLight="orange";

        Wheel wheel = new Wheel();
        wheel.wheelType ="alloy";
        wheel.company="MRF";

        Wheel wheel1 = new Wheel();
        wheel1.wheelType ="alloy";
        wheel1.company="MRF";

        Wheel wheel2 = new Wheel();
        wheel2.wheelType ="alloy";
        wheel2.company="MRF";

        Wheel wheel3 = new Wheel();
        wheel3.wheelType ="alloy";
        wheel3.company="MRF";

        List<Wheel>wheelList=new ArrayList<>();
        wheelList.add(wheel);
        wheelList.add(wheel1);
        wheelList.add(wheel2);
        wheelList.add(wheel3);


        return car;
    }
}
