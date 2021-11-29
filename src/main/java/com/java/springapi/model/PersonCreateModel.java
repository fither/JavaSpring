package com.java.springapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonCreateModel {
    private String firstname = "";
    private String lastname = "";
    private int age = 0;
    private char gender = 0;
}
