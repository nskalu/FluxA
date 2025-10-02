package com.fluxa.fluxa.task.domain;

import com.fluxa.fluxa.user.domain.valueoject.Email;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.UUID;

public class Task {

    @Id
    @GeneratedValue
    private UUID id;

    private UUID userId;
    private String Title;
    private String Description;
    private String Status;
    private LocalDateTime AssignedDate;
    private LocalDateTime CompletedDate;
    private LocalDateTime createdOn;
}
