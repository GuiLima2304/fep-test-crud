package com.example.feptest.service;

import com.example.feptest.model.Client;
import com.example.feptest.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;


    public List<Client> getAllClients() {
        List<Client> clientList = clientRepository.findAll();
        return clientList;
    }

}
