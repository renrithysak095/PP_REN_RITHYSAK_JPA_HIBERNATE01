package com.example.pp_ren_rithysak_jpa_hibernate_homework001.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
    @Temporal(TemporalType.DATE)
    private Date birthDate;
    @Transient
    private String temp;

}
