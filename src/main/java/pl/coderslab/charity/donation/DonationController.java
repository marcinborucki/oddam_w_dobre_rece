package pl.coderslab.charity.donation;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
@CrossOrigin
public class DonationController {

    private final DonationService donationService;

    @GetMapping("/donations/")
    public ResponseEntity quantitySum() {
        return ResponseEntity.ok(donationService.allDonation());
    }

    @GetMapping("/donation/{id}")
    public ResponseEntity findByIdDonation(@PathVariable Long id) {
        return ResponseEntity.ok(donationService.findById(id));
    }

    @PostMapping("/donation/")
    public ResponseEntity addDonation(@RequestBody CreateDonationDto createDonationDto) {
        donationService.createDonation(createDonationDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

}


