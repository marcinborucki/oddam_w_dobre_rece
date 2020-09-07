package pl.coderslab.charity.donation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DonationService {

    private final DonationRepository donationRepository;

    public DonationsAll allDonation() {
        DonationsAll donationsAll = new DonationsAll();
        donationsAll.setSum(donationRepository.donationsSum());
        donationsAll.setCount(donationRepository.donationsCount());
        return donationsAll;
    }

}
