package cabBooking2.cab.booking.repository;

import cabBooking2.cab.booking.model.Cab;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CabRepository extends JpaRepository<Cab, Long> {
}
