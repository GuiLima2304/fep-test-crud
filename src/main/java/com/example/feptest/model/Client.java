package com.example.feptest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CLIENT")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @Nullable
    private String externCode;

    @Column(nullable = false)
    @Size(max=255)
    private String name;

    @Column
    @Size(max = 200)
    private String email;

    @Column(nullable = true)
    @Size(max = 11)
    private String cpf;

    @Column(nullable = true)
    private boolean indCpf;

    @Column
    private Integer sex;

    @OneToOne
    @MapsId
    @JoinColumn(name = "maritalStatus_id")
    private MaritalStatus maritalStatus;

    @Column(nullable = false)
    private LocalDate birthDate;

    @Column(nullable = true)
    private String cellphone;

    @Column(nullable = false)
    @Size(max = 15)
    private String identification;

    @Column(nullable = true)
    private boolean signDigital;

}
