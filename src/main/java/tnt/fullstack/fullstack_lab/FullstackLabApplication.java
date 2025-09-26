package tnt.fullstack.fullstack_lab;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.springframework.stereotype.Repository;
import tnt.fullstack.fullstack_lab.entity.Car;
import tnt.fullstack.fullstack_lab.entity.Owner;
import tnt.fullstack.fullstack_lab.repository.CarRepo;
import tnt.fullstack.fullstack_lab.repository.OwnerRepo;

@SpringBootApplication
public class FullstackLabApplication implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(
            FullstackLabApplication.class
    );

    private final OwnerRepo ownerRepo;
    private final CarRepo repository;
    public FullstackLabApplication(CarRepo repository, OwnerRepo ownerRepo) {
        this.repository = repository;
        this.ownerRepo = ownerRepo;
    }


    public static void main(String[] args) {
        SpringApplication.run(FullstackLabApplication.class, args);
        logger.info("Application Started");
    }



    @Override
    public void run(String... args) throws Exception{

        Owner owner = new Owner("Ahmat", "Muhsin");
        Owner owner2 = new Owner("Salam", "Alexus");
        ownerRepo.save(owner);
        ownerRepo.save(owner2);
        repository.save(new Car("BMW", "523i", "Cosmos-Black", "A321FAS", 1997, 4000000, owner));
        repository.save(new Car("Hyundai", "Accent", "Gray", "368ASD02", 2016, 6000000, owner2));
        repository.save(new Car("Mitsubishi", "Diamante", "Gray", "231BEX02", 1997, 2000000, owner));
        repository.save(new Car("Ford", "Mustang GT", "White", "A213FSA", 2005, 15000000, owner2));

        for(Car car : repository.findAll()){
            logger.info("brand: {}, model: {}", car.getBrand(), car.getModel());
        }
    }
}
