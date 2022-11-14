package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

//3. Создайте список из 5 машин.
//4. Создайте сервис с методом, который будет возвращать указанное число машин из созданного списка.
@Component
public class CarServiceClass implements CarService {


    List<Car> cars = new ArrayList<>(5);
    int carsCount = 1;

    {
        cars.add(new Car(carsCount, "Volvo", 2022));
        cars.add(new Car(++carsCount, "Mercedes", 2021));
        cars.add(new Car(++carsCount, "Opel", 2020));
        cars.add(new Car(++carsCount, "Skoda", 2000));
        cars.add(new Car(++carsCount, "Lada", 1991));
    }

    @Override
    public List<Car> getCarsList(Integer count) {
        if (count != null) {
            return cars.stream().limit(count).toList();
        } else return cars;
    }

}
