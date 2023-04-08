package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.CarDAO;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class carService {
    private final CarDAO carDAO;

    public carService(CarDAO carDAO) {
        this.carDAO = carDAO;
    }
    public List<Car> from(int count){
        return carDAO.from(count);
    }
}
