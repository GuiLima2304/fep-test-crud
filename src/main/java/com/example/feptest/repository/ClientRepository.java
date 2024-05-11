package com.example.feptest.repository;

import com.example.feptest.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    Client findByCpf(String cpf);
}

