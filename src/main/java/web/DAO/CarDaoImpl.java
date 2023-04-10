package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW","x4d22",5));
        cars.add(new Car("Mersedes","vve43",3));
        cars.add(new Car("Subaru","cc4re",12));
        cars.add(new Car("BMW3","vvvcc",1));
        cars.add(new Car("Lada","33ssd",20));
    }
    public List<Car> from(int count){

        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
