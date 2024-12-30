package dev.shanku.bookmyshow.exceptionhandler;

import dev.shanku.bookmyshow.exceptions.ShowSeatNotFoundException;
import dev.shanku.bookmyshow.exceptions.UserNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(UserNotFoundException.class)
    public void handleUserNotFoundException() {

    }

    @ExceptionHandler(ShowSeatNotFoundException.class)
    public void handleShowSeatNotFoundException() {

    }

}
