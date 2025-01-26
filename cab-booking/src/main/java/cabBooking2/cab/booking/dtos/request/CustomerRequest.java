package cabBooking2.cab.booking.dtos.request;

import cabBooking2.cab.booking.Enum.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerRequest {
    private String name;
    private int age;
    private String email;
    private Gender gender;
}
