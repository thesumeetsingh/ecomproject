package com.sumeet.ecomproject.model;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String username;
    private String userId;
    private String name;
    private String address;
    private Integer phone;
    private String email;

}
