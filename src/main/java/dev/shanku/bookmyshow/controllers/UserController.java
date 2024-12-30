package dev.shanku.bookmyshow.controllers;

import dev.shanku.bookmyshow.dtos.LoginRequestDto;
import dev.shanku.bookmyshow.dtos.ResponseStatus;
import dev.shanku.bookmyshow.dtos.UserSignUpRequestDto;
import dev.shanku.bookmyshow.dtos.UserSignUpResponseDto;
import dev.shanku.bookmyshow.models.User;
import dev.shanku.bookmyshow.services.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signup")
    public UserSignUpResponseDto signUp(@RequestBody UserSignUpRequestDto requestDto) {
        User user = userService.signUp(
                requestDto.getName(),
                requestDto.getEmail(),
                requestDto.getPassword()
        );

        UserSignUpResponseDto responseDto = new UserSignUpResponseDto();
        responseDto.setResponseStatus(ResponseStatus.SUCCESS);
        responseDto.setName(user.getName());
        responseDto.setEmail(user.getEmail());
        return responseDto;
    }

    @GetMapping("/login")
    public ResponseStatus login(@RequestBody LoginRequestDto requestDto) {
        return userService.login(requestDto.getEmail(),
                requestDto.getPassword());
    }
}
