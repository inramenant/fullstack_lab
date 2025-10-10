package tnt.fullstack.fullstack_lab.repository;

import org.springframework.data.repository.CrudRepository;
import tnt.fullstack.fullstack_lab.entity.Owner;

import java.util.Optional;

public interface OwnerRepo extends CrudRepository<Owner, Long > {
    Optional<Owner> findByName(String name);
}
