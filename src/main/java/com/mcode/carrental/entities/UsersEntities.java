package com.mcode.carrental.entities;

import lombok.Data;
import javax.persistence.*;


@Data
@Entity
@Table(name = "users")
public class UsersEntities {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id", unique = true)
    private Long userId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "age")
    private Integer age;

    @Column(name = "phone_number")
    private Integer phoneNumber;

    @Column(name = "password")
    private String password;

}
