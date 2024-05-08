package com.example.feptest.service;

import com.example.feptest.dto.ClientList;
import com.example.feptest.mapper.ClientMapper;
import com.example.feptest.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ClientMapper clientMapper;

    public ClientService() {
    }


    public List<ClientList> getAllClients() {
        List<ClientList> clientList = clientRepository.findAll()
                .stream()
                .map(clientMapper::toClientList)
                .toList();
        return clientList;
    }

}
