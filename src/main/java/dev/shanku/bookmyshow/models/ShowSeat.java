package dev.shanku.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel{
    @ManyToOne
    private Seat seat;
    @ManyToOne
    private Show show;
    //private SeatType seatType;
    @Enumerated(EnumType.ORDINAL)
    private ShowSeatStatus showSeatStatus;

    @ManyToOne
    private Booking booking;
}
