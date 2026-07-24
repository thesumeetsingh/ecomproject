package com.sumeet.ecomproject.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {

    @Id
    private int id;
    private String name;
    private boolean availability;
    private int quantity;
    private BigDecimal price;
    private String desc;
    private String brand;
    private Date releaseDate;
    private String category;


}
