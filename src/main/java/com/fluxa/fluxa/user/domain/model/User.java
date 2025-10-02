package com.fluxa.fluxa.user.domain.model;

import com.fluxa.fluxa.user.domain.valueoject.Email;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class User {

    @Id
    @GeneratedValue
    private UUID id;
    private String firstname;
    private String lastname;
    private String password;
    private Email email;
    private LocalDateTime createdOn;
}
