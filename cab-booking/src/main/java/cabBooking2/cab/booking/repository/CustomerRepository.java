package cabBooking2.cab.booking.repository;

import cabBooking2.cab.booking.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    //in build query JPA
    Optional<Customer> findByEmail(String email);
    // custom query which jpa will use to fetch data from the database based on the query
    @Query("select c from Customer where c.age = :age")
    List<Customer> findCustomerWithAge(@Param("age") int age);
}
