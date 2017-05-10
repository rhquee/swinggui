package pl.kfrak.Car;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-04-28.
 */
public class CarRepository {
    private List<Car> cars;

    public CarRepository(){
        cars = new ArrayList<>();

        cars.add(new Car("Opel", "Vectra", "2015", 70));
        cars.add(new Car("Opel", "Astra", "2013", 100));
    }

    public List<Car> getCars() {
        return cars;
    }
}
