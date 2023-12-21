package ie.atu.cicdsheeppins;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/pins")
@RestController
public class PinsController {
    private final PinsService pinsService;
    public PinsController(PinsService pinsService){
        this.pinsService = pinsService;
    }
    @GetMapping
    public List<Pins> allPins(){

        return pinsService.allPins();
    }
    @PostMapping("/createPin")
    public void create(@Valid @RequestBody Pins pins){
        pinsService.createPin(pins);
    }

}
