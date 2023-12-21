package ie.atu.cicdsheeppins;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pins {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @NotBlank
    private String sheepId;
    @DecimalMin(value = "0.001",message = "Value must have at least 3 decimal places")
    private double longitude;

    @DecimalMin(value = "0.001",message = "Value must have at least 3 decimal places")
    private double latitude;
}
