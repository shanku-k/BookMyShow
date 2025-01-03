package dev.shanku.bookmyshow.dtos;
import dev.shanku.bookmyshow.models.Booking;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookingResponseDto {
    private Booking booking;
    private ResponseStatus responseStatus;
}
