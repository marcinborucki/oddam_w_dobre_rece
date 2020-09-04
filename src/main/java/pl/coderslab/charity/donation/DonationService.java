package pl.coderslab.charity.donation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DonationService {

    private final DonationRepository donationRepository;

    public Integer allQuantity() {
        Integer allQuantity = donationRepository.findAll()
                .stream()
                .mapToInt(q -> q.getQuantity())
                .sum();
        return allQuantity;
    }

    public Long allDonation() {
        Long allDonation = donationRepository.findAll()
                .stream()
                .count();
        return allDonation;
    }

}
