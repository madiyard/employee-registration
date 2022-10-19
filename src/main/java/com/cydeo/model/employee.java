package com.cydeo.model;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class employee {

    private String firstName, lastName;
    private LocalDate birthday;
    private String email, password, address, address2, city, state, zipCode;

}
