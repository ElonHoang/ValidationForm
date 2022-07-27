package com.example.validationform.model;

import com.example.validationform.validator.PhoneAnno;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

//@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private int userId;
    @NotBlank
    @NotNull
    private String username;
    @NotBlank
    @NotNull
    private String address;
    @NotBlank
    @NotNull
    @PhoneAnno(message = "Phone not valid")
    private String phone;



}
