package ie.atu.cicdsheeppins;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/pins")
@RestController
public class PinsController {
    private final PinsRepo pinsRepo;
    public PinsController(PinsRepo pinsRepo){
        this.pinsRepo = pinsRepo;
    }
    @PostMapping("/createPin")
    public void create(@Valid @RequestBody Pins pins){
        pinsRepo.save(pins);
    }

}
