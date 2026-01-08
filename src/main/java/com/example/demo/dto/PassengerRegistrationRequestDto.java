package com.example.demo.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PassengerRegistrationRequestDto {

    private String email;
    private String userName;
    private String password;
    private String phoneNumber;
}
