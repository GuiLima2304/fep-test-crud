package com.example.feptest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientList {

    private Long id;
    private String externCode;
    private String name;
    private String cpf;
    private String cellphone;
    private boolean signDigital;
}
