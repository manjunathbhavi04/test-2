    package cabBooking2.cab.booking.model;

    import cabBooking2.cab.booking.Enum.Gender;
    import jakarta.persistence.*;
    import lombok.AllArgsConstructor;
    import lombok.Getter;
    import lombok.NoArgsConstructor;
    import lombok.Setter;

    import java.util.ArrayList;
    import java.util.List;

    @Entity
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public class Customer {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long customerId;
        private String name;
        private int age;
        private String email;

        @Enumerated(value = EnumType.STRING)
        private Gender gender;

        @OneToMany(cascade = CascadeType.ALL)
        @JoinColumn(name = "customer_id")
        private List<Booking> bookings = new ArrayList<>();

    }
