package tnt.fullstack.fullstack_lab;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tnt.fullstack.fullstack_lab.controller.CarController;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class FullstackLabApplicationTests {

    @Autowired
    private CarController carController;

    @Test
    @DisplayName("First example test case")
    void contextLoads() {
        assertThat(carController).isNotNull();
    }

}
