package tnt.fullstack.fullstack_lab.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import tnt.fullstack.fullstack_lab.entity.Car;

import java.util.List;

@RepositoryRestResource(path="vehicles")
public interface CarRepo extends CrudRepository<Car, Long> {
List<Car> findByBrand(@Param("brand") String brand);
List<Car> findByColor(@Param("color") String color);

}
