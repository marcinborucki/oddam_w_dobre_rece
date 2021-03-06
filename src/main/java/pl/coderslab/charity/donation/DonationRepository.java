package pl.coderslab.charity.donation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DonationRepository extends JpaRepository<Donation,Long> {

    @Query("select sum(d.quantity) from Donation d")
    Integer donationsSum();

    @Query("select count (d) from Donation d")
    Long donationsCount();
}
