package com.example.demo.controller;

import com.example.demo.dto.PassengerRegistrationRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    @PostMapping("/register/passenger")
    public PassengerRegistrationRequestDto registerPassenger(@RequestBody PassengerRegistrationRequestDto passengerRegistrationRequestDto){

        return passengerRegistrationRequestDto;
    }
}
