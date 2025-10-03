package tnt.fullstack.fullstack_lab.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import tnt.fullstack.fullstack_lab.entity.AppUser;

import java.util.Optional;

@RepositoryRestResource(exported = false)
public interface AppUserRepo extends CrudRepository<AppUser, Long> {
    Optional<AppUser> findByUsername(String username);
}
