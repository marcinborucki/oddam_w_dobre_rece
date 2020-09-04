package pl.coderslab.charity.donation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DonationService {

    private final DonationRepository donationRepository;
    private final DonationsAll donationsAll;

    public DonationsAll allDonation() {
        donationsAll.setSum(donationRepository.donationsSum());
        donationsAll.setCount(donationRepository.donationsCount());
        return donationsAll;
    }

}
