package com.booking.certification.devco.models;

import lombok.Data;

@Data
public class Register {
    private String email;
    private String new_password;
    private String confirm_password;
}
