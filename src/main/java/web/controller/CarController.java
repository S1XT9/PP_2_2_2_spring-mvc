package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;


// 1. Создайте еще один контроллер, замаппленный на /cars.
@Controller
public class CarController {
    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printFiveCars(@RequestParam(value = "carsCount", required = false) Integer carsCount, ModelMap model) {
        // добавил дефолтное значение
        if (carsCount < 1 || carsCount > 5) {
            carsCount = 5;
        }
        model.addAttribute("fiveCars", carService.getCarsList(carsCount));
        return "cars";
    }


}