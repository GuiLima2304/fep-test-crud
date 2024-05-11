package com.example.feptest.controller;

import com.example.feptest.dto.ClientDeleteList;
import com.example.feptest.dto.ClientList;
import com.example.feptest.dto.ClientRequest;
import com.example.feptest.model.Client;
import com.example.feptest.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/all")
    public List<ClientList> getAll() {
        List<ClientList> clients = this.clientService.getAllClients();
        return clients;
    }

    @PostMapping("/new")
    public ResponseEntity<?> newClient(@RequestBody ClientRequest newClient) {
        return this.clientService.createNewClient(newClient);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteClient(@RequestBody List<ClientDeleteList> clientDeleteList) {
        return this.clientService.deleteListClient(clientDeleteList);
    };

}
