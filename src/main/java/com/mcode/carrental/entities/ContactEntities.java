package com.mcode.carrental.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Data
@Entity
@Table(name = "contact")
public class ContactEntities {

    @Id
    @Column(name = "contact_id")
    private Long contactI;

    @Email
    @Column(name = "email")
    private String email;

    @Column(name = "subject")
    private String subject;

    @Column(name = "message")
    private String message;

}
