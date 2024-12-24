package dev.shanku.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="seats")
public class Seat extends BaseModel{
    private String seatNumber;
    @ManyToOne
    private SeatType seatType;
    private int rowNumber;
    //private int columnNumber;

}
