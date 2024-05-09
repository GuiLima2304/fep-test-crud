package com.example.feptest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "MaritalStatus")
@AllArgsConstructor
@NoArgsConstructor
public class MaritalStatus {

    @Id
    private Integer Id;

    @Column
    private String description;


}
