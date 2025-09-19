package tnt.fullstack.fullstack_lab.repository;

import org.springframework.data.repository.CrudRepository;
import tnt.fullstack.fullstack_lab.entity.Owner;

public interface OwnerRepo extends CrudRepository<Owner, Long > {

}
