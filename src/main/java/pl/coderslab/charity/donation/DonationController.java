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
    public ResponseEntity QuantitySum() {
        return ResponseEntity.ok(donationService.allDonation());
    }

    @PostMapping("/donation/add")
    public ResponseEntity AddDonation(@RequestBody CreateDonationDto createDonationDto) {
        donationService.createDonation(createDonationDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

}


