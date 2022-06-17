package com.fmi.MovieRating.mappers;

import com.fmi.MovieRating.dtos.RegistrationRequest;
import com.fmi.MovieRating.models.Account;

public class AccountMapper {

    public static Account fromRegistrationRequestToAccount(RegistrationRequest registrationRequest){
        return new Account(
                registrationRequest.getUsername(),
                registrationRequest.getEmail()
        );
    }
}
