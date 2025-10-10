package tnt.fullstack.fullstack_lab;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import tnt.fullstack.fullstack_lab.entity.Owner;
import tnt.fullstack.fullstack_lab.repository.OwnerRepo;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
class OwnerRepositoryTest {
    @Autowired
    private OwnerRepo repository;
    @Test
    void saveOwner() {
        repository.save(new Owner("John", "Doe"));
        assertThat(
                repository.findByName("John").isPresent()
        ).isTrue();
    }
    @Test
    void deleteOwners(){
        repository.save(new Owner("Nick", "Herman"));
        repository.deleteAll();
        assertThat(repository.count()).isZero();
    }
}
