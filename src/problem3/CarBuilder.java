package problem3;

import java.util.ArrayList;
import java.util.List;

import problem2.door.Door;
import problem2.factory.CarPartsFactory;
import problem2.wheel.Wheel;

/**
 * ==============BEGIN==============
 * Complete the below code that requires your implementation
 * If necessary, you can make your own methods or classes so that the corresponding tests are passed
 */
public class CarBuilder implements Builder{
    private CarPartsFactory factory;
    private Car car;

    public CarBuilder(CarPartsFactory factory) {
        this.factory = factory;
        this.car = new Car();
        car.setCompanyName(factory.getCompanyName());
    }

    @Override
    public Builder addDoors(int numDoors) {
        List<Door> doors = new ArrayList<>();
        for (int i = 0; i < numDoors; i++) {
            doors.add(factory.createDoor());
        }
        car.setDoors(doors);
        return this;
    }

    @Override
    public Builder addWheels(int numWheels) {
        List<Wheel> wheels = new ArrayList<>();
        for (int i = 0; i < numWheels; i++) {
            wheels.add(factory.createWheel());
        }
        car.setWheels(wheels);
        return this;
    }

    @Override
    public Builder setRoof() {
        car.setRoof(factory.createRoof());
        return this;
    }

    @Override
    public Builder setColor(Color color) {
        car.setColor(color);
        return this;
    }

    @Override
    public Car getCar() {
        return car;
    }

    @Override
    public void reset() {
        car = new Car();
    }
}
/**
 * ===============END===============
 */
