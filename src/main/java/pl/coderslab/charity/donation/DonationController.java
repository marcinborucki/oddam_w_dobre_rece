package pl.coderslab.charity.donation;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}


