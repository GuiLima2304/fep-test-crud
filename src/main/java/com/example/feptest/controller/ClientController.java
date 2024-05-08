package com.example.feptest.controller;

import com.example.feptest.dto.ClientList;
import com.example.feptest.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/all")
    public List<ClientList> getAll() {
        List<ClientList> teste = this.clientService.getAllClients();
        return teste;
    }
}
