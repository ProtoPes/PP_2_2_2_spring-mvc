package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao {
    private List<Car> cars;

    public CarDaoImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", "V6", "Red"));
        cars.add(new Car("Dodge", "V8", "Blue"));
        cars.add(new Car("Mazda", "V6", "Green"));
        cars.add(new Car("Bugatti", "V16", "Black"));
        cars.add(new Car("Lada", "V4", "White"));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
