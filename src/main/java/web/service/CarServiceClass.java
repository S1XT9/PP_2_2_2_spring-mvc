package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//3. Создайте список из 5 машин.
//4. Создайте сервис с методом, который будет возвращать указанное число машин из созданного списка.
@Service
public class CarServiceClass implements CarService {

    List<Car> fiveCars;

    {
        fiveCars = new ArrayList<>();
        fiveCars.add(new Car("Volvo", 2022));
        fiveCars.add(new Car("Mercedes", 2021));
        fiveCars.add(new Car("Opel", 2020));
        fiveCars.add(new Car("Skoda", 2000));
        fiveCars.add(new Car("Lada", 1991));
    }

    @Override
    public List<Car> getCarsList(int carsCount) {
        return fiveCars.stream().limit(carsCount).toList();
    }

}
