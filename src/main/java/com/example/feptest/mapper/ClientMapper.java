package com.example.feptest.mapper;

import com.example.feptest.dto.ClientList;
import com.example.feptest.model.Client;

public interface ClientMapper {

        ClientList toClientList(Client client);
        }
