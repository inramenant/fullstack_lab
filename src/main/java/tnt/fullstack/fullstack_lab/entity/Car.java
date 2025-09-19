package tnt.fullstack.fullstack_lab.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String brand, model, color, registrationNumber;

    private int modelYear, price;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="owner")
    private Owner owner;

    public Car(String brand, String model, String color, String registrationNumber, int modelYear, int price, Owner owner) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.registrationNumber = registrationNumber;
        this.modelYear = modelYear;
        this.price = price;
        this.owner = owner;
    }
//    @Column(name="explanation", nullable = false, length = 512)
//    private String description;


}
