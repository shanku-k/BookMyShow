package dev.shanku.bookmyshow.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BookingRequestDto {
    private List<Long> showSeatIds;
    private Long userId;
}
