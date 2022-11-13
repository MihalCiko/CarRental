package com.mcode.carrental.entities;

import lombok.Data;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Data
@Entity
@Table(name = "users")
public class UsersEntities {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id", unique = true)
    private Long userId;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<RentEntities> rentEntities = new ArrayList<>();

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "driver_license" , unique = true)
    private Integer driverLicense;

    @Column(name = "phone_number")
    private Integer phoneNumber;

    @Column(name = "password")
    private String password;

}
