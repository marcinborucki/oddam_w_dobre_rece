package pl.coderslab.charity.donation;

import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import pl.coderslab.charity.institution.Institution;
import pl.coderslab.charity.institution.InstitutionRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DonationService {

    private final DonationRepository donationRepository;
    private final InstitutionRepository institutionRepository;
    private final ModelMapper modelMapper;

    public DonationsAll allDonation() {
        DonationsAll donationsAll = new DonationsAll();
        donationsAll.setSum(donationRepository.donationsSum());
        donationsAll.setCount(donationRepository.donationsCount());
        return donationsAll;
    }

    public void createDonation(CreateDonationDto createDonationDto) {
        Donation donation = donationBuilder(createDonationDto);
        donationRepository.save(donation);
    }

    public Optional<Donation> findById(Long id) {
       Optional<Donation> donation = donationRepository.findById(id);
       return donation;
    }

    public Donation donationBuilder(CreateDonationDto createDonationDto) {
        Institution institution = institutionRepository.findById(createDonationDto.getInstitutionId())
                .orElseThrow(RuntimeException::new);
        Donation donation = Donation.builder()
                .institution(institution)
                .city(createDonationDto.getCity())
                .phoneNumber(createDonationDto.getPhoneNumber())
                .pickUpComment(createDonationDto.getPickUpComment())
                .pickUpTime(createDonationDto.getPickUpTime())
                .quantity(createDonationDto.getQuantity())
                .pickUpDate(createDonationDto.getPickUpDate())
                .street(createDonationDto.getStreet())
                .zipCode(createDonationDto.getZipCode())
                .build();
        return donation;
    }
}
