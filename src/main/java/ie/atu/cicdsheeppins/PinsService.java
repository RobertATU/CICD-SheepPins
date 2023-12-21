package ie.atu.cicdsheeppins;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PinsService {
    private final PinsRepo pinsRepo;

    public PinsService(PinsRepo pinsRepo) {
        this.pinsRepo = pinsRepo;
    }

    public void createPin(Pins pins) {
        pinsRepo.save(pins);
    }

    public List<Pins> allPins() {
        return pinsRepo.findAll();
    }
}
