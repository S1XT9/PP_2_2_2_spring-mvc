package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
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
    public String getCarsList(Model model, @RequestParam(value = "count", required = false) Integer count) {
        if (count == null || count < 1 || count > 5) {
            count = 5;
        }
        model.addAttribute("cars", carService.getCarsList(count));
        return "cars";
    }


}