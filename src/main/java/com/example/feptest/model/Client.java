package com.example.feptest.model;

import com.example.feptest.dto.ClientRequest;
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
@Table(name = "client")
public class Client {

    public Client(ClientRequest client) {
        this.externCode = client.getExternCode();
        this.name = client.getName();
        this.email = client.getEmail();
        this.cpf = client.getCpf();
        this.indCpf = client.getIndCpf();
        this.sex = client.getSex();
        this.maritalStatus = client.getMaritalStatusId();
        this.birthDate = client.getBirthDate();
        this.cellphone = client.getCellphone();
        this.identification = client.getIdentification();
        this.signDigital = client.isSignDigital();
    };
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

    @Column
    private Integer maritalStatus;

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
