package pl.coderslab.charity.donation;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DonationService {

    private final DonationRepository donationRepository;
    private final ModelMapper modelMapper;

    public DonationsAll allDonation() {
        DonationsAll donationsAll = new DonationsAll();
        donationsAll.setSum(donationRepository.donationsSum());
        donationsAll.setCount(donationRepository.donationsCount());
        return donationsAll;
    }

    public void createDonation(CreateDonationDto createDonationDto) {
        Donation donation = modelMapper.map(createDonationDto,Donation.class);
        donationRepository.save(donation);
    }

}
