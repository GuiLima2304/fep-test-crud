package com.example.feptest.mapper;

import com.example.feptest.dto.ClientList;
import com.example.feptest.model.Client;
import org.springframework.stereotype.Component;

@Component
public class ClientMapperImpl implements ClientMapper {
    @Override
    public ClientList toClientList(Client client) {
        return ClientList.builder()
                .id(client.getId())
                .name(client.getName())
                .externCode(client.getExternCode())
                .cellphone(client.getCellphone())
                .cpf(client.getCpf())
                .signDigital(client.isSignDigital())
                .build();
    }
}
