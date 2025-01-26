package cabBooking2.cab.booking.repository;

import cabBooking2.cab.booking.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
