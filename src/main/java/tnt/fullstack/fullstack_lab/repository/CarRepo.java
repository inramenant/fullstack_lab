package tnt.fullstack.fullstack_lab.repository;

import org.springframework.data.repository.CrudRepository;
import tnt.fullstack.fullstack_lab.entity.Car;

public interface CarRepo extends CrudRepository<Car, Long> {
}
