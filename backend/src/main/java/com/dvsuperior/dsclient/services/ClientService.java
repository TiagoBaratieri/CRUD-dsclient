package com.dvsuperior.dsclient.services;

import com.dvsuperior.dsclient.dto.ClientDTO;
import com.dvsuperior.dsclient.entities.Client;
import com.dvsuperior.dsclient.repositories.ClientRepository;
import com.dvsuperior.dsclient.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public List<ClientDTO> findAll(){
        List<Client> list = repository.findAll();
        return list.stream().map(x -> new ClientDTO(x)).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public ClientDTO finById(Long id) {
        Optional<Client> obj = repository.findById(id);
        Client entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
        return new ClientDTO(entity);
    }
}
