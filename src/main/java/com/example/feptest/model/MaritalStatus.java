package com.example.feptest.model;

import jakarta.persistence.*;

@Entity
@Table(name = "MaritalStatus")
public class MaritalStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @Column
    private String description;


}
