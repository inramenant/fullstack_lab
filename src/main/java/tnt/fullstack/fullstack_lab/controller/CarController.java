package tnt.fullstack.fullstack_lab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tnt.fullstack.fullstack_lab.entity.Car;
import tnt.fullstack.fullstack_lab.repository.CarRepo;

@RestController
public class CarController {

    private final CarRepo repository;

    public CarController(CarRepo repository) {
        this.repository = repository;
    }
    @GetMapping("/cars")
    public Iterable<Car> getCars() {
        return repository.findAll();
    }
}
