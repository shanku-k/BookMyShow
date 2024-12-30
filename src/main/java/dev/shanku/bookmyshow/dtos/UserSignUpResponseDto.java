package dev.shanku.bookmyshow.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserSignUpResponseDto {
    private String email;
    private String name;
    private ResponseStatus responseStatus;
}
