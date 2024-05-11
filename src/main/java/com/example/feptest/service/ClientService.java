package com.example.feptest.service;

import com.example.feptest.dto.ClientDeleteList;
import com.example.feptest.dto.ClientList;
import com.example.feptest.dto.ClientRequest;
import com.example.feptest.dto.ClientResponse;
import com.example.feptest.mapper.ClientMapper;
import com.example.feptest.model.Client;
import com.example.feptest.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

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

    public ResponseEntity<?> createNewClient(ClientRequest newClient) {
        Client userExistent = clientRepository.findByCpf(newClient.getCpf());
        if(userExistent == null) {
            Client client = new Client(newClient);
            clientRepository.save(client);
            return ResponseEntity.status(201).body(new ClientResponse("201", "Cliente Registrado com Sucesso!"));
        };
        return ResponseEntity.status(422).body(new ClientResponse("422", "CPF ja Registrado!"));
    };

    public ResponseEntity<?> deleteListClient(List<ClientDeleteList> clientDeleteList) {
        clientDeleteList.stream().forEach(item -> this.clientRepository.deleteById(item.getId()));
        return ResponseEntity.status(200).body(new ClientResponse("200", "Clientes Deletados com Sucesso!"));
    };
}
