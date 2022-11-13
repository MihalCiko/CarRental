package com.mcode.carrental.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "rent")
public class RentEntities {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "rent_id", unique = true)
    private Long rentId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UsersEntities user;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private CarsEntities cars;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "total_price")
    private Double totalPrice;
}
