package ku.cs.restaurant.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

/**
 * @author 6510405741 Peerawit Pharkdeepinyo
 */
@Data
@Entity
public class Restaurant {
    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    private double rating;
    private String location;
}
