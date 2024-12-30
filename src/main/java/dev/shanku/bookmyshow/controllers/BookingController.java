package dev.shanku.bookmyshow.controllers;

import dev.shanku.bookmyshow.dtos.BookingRequestDto;
import dev.shanku.bookmyshow.dtos.BookingResponseDto;
import dev.shanku.bookmyshow.dtos.ResponseStatus;
import dev.shanku.bookmyshow.exceptions.ShowSeatNotFoundException;
import dev.shanku.bookmyshow.exceptions.UserNotFoundException;
import dev.shanku.bookmyshow.models.Booking;
import dev.shanku.bookmyshow.models.ShowSeat;
import dev.shanku.bookmyshow.services.BookingService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    private BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping
    public BookingResponseDto createBooking(@RequestBody BookingRequestDto requestDto) throws UserNotFoundException, ShowSeatNotFoundException {
        BookingResponseDto responseDto = new BookingResponseDto();
        Booking booking = null;

        booking = bookingService.createBooking(
                requestDto.getShowSeatIds(),
                requestDto.getUserId()
        );

        responseDto.setBooking(booking);
        responseDto.setResponseStatus(ResponseStatus.SUCCESS);

        if (booking == null) {
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
        }

        return responseDto;
    }

}
