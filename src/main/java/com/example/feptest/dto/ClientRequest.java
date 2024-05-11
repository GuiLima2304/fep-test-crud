package com.example.feptest.dto;

import com.example.feptest.model.Client;
import com.example.feptest.repository.ClientRepository;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Size;
import java.time.LocalDate;

@Getter
@Setter
public class ClientRequest {

    private String externCode;
    private String name;
    private String email;
    private String cpf;
    private Boolean indCpf;
    private Integer sex;
    private Integer maritalStatusId;
    private LocalDate birthDate;
    private String cellphone;
    private String identification;
    private boolean signDigital;

    //public Client update(Long id, ClientRepository clientRepository) {}
}
