package web.service;

import org.springframework.stereotype.Service;
import web.DAO.CarDaoImpl;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    private final CarDaoImpl carDaoImpl;

    public CarServiceImpl(CarDaoImpl carDaoImpl) {
        this.carDaoImpl = carDaoImpl;
    }
    public List<Car> from(int count) {
        return carDaoImpl.from(count);
    }
}
