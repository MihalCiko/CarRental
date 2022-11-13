package com.mcode.carrental.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "cars")
public class CarsEntities {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "car_id", unique = true)
    private Long carId;

    @OneToMany(mappedBy = "cars", fetch = FetchType.LAZY)
    private List<RentEntities> rentEntities = new ArrayList<>();

    @Column(name = "car_name")
    private String carName;

    @Column(name = "car_model")
    private String carModel;

    @Column(name = "car_year")
    private Integer carYear;

    @Column(name = "car_engine")
    private Integer carEngine;

    @Column(name = "transmission")
    private String transmission;

    @Column(name = "car_price")
    private Double carPrice;

}


