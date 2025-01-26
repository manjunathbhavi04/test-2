package cabBooking2.cab.booking.repository;

import cabBooking2.cab.booking.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver, Long> {
}
