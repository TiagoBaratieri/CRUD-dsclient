package com.dvsuperior.dsclient.services;

import com.dvsuperior.dsclient.entities.Client;
import com.dvsuperior.dsclient.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    public List<Client> findAll(){
        return repository.findAll();
    }
}
