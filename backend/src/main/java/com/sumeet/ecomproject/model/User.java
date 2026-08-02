package com.sumeet.ecomproject.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User {

     @Id
    private String username;
     private String firstname;
     private String lastname;
     private String email;
     private Integer phone;
     private String gender;

}
