package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "address")
@Data
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String street;
    private String zip_code;
    @ManyToOne
    private Customer customer;

//    public Address(String name, String street, String zip_code) {
//        this.name = name;
//        this.street = street;
//        this.zip_code = zip_code;
//    }
}

