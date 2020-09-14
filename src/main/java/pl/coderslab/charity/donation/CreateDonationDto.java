package pl.coderslab.charity.donation;

import lombok.Data;
import lombok.NoArgsConstructor;
import pl.coderslab.charity.category.Category;
import pl.coderslab.charity.institution.Institution;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
@NoArgsConstructor
public class CreateDonationDto {


    private Integer quantity;

    private List<Category> categories;

    private Long institutionId;

    private String street;

    private String city;

    private String zipCode;

    private LocalDate pickUpDate;

    private LocalTime pickUpTime;

    private String pickUpComment;

    private String phoneNumber;

}

