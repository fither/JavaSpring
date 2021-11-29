package com.java.springapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonModel {
    @Id
    private String id;
    private String firstname = "";
    private String lastname = "";
    private int age = 0;
    private char gender = 0;
}
