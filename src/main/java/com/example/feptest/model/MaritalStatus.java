package com.example.feptest.model;

import jakarta.persistence.*;

@Entity
@Table(name = "MaritalStatus")
public class MaritalStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer Id;

    @Column
    private String description;

    @OneToOne(mappedBy = "client", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Client client;
}
