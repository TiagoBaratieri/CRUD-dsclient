package com.dvsuperior.dsclient.resources;

import com.dvsuperior.dsclient.entities.Client;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

    @GetMapping
    public ResponseEntity<List<Client>> findAll(){
        List<Client> list = new ArrayList<>();
        list.add(new Client(1l,"Tiago Baratieri","02332555",2000.00,3));
        return ResponseEntity.ok().body(list);
    }
}
