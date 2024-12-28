package dev.shanku.bookmyshow.controllers;

import dev.shanku.bookmyshow.dtos.BookingRequestDto;
import dev.shanku.bookmyshow.dtos.BookingResponseDto;
import dev.shanku.bookmyshow.models.ShowSeat;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @PostMapping
    public BookingResponseDto createBooking(@RequestBody BookingRequestDto requestDto){
        return null;
    }
}
