package problem4;

import problem2.factory.CarPartsFactory;
import problem3.Builder;
import problem3.Car;

/**
 * ==============BEGIN==============
 * Complete the below code that requires your implementation
 * If necessary, you can make your own methods or classes so that the
 * corresponding tests are passed
 */
public class CheckingBuilderProxyDecorator extends BaseBuilderProxyDecorator {
    public CheckingBuilderProxyDecorator(Builder builder) {
        super(builder);
    }

    public CheckingBuilderProxyDecorator(CarPartsFactory factory) {
        super(factory);
    }

    @Override
    public Car getCar() {
        Car car = super.getCar();
        if (car == null || !isValid(car))
            return null;

        return car;
    }

    private boolean isValid(Car car) {
        return ((car.numDoors() >= 4 && car.numDoors() <= 6) &&
                (car.numWheels() >= 2 && car.numWheels() <= 10) &&
                (car.numWheels() % 2 == 0) &&
                (car.numRoofs() == 1));
    }
}
/**
 * ===============END===============
 */
