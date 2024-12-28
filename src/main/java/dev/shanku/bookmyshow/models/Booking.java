package dev.shanku.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity(name = "bookings")
public class Booking extends BaseModel{

    @Enumerated(EnumType.ORDINAL)
    private BookingStatus bookingStatus;

    private Date bookingDate;
    private  int amount;

    @ManyToOne
    private User user;
    @OneToMany
    private List<ShowSeat> showSeats;
//    @OneToMany
//    private List<Payment> payments;

}
//either use @OneToMany with @JoinColumn
//or use @ManyTo One