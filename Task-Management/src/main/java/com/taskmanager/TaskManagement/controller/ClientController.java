package com.taskmanager.TaskManagement.controller;

import com.taskmanager.TaskManagement.enitity.Client;
import com.taskmanager.TaskManagement.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    // Endpoint to create a single client
    @PostMapping
    public ResponseEntity<Client> createClient(@RequestBody Client client) {
        Client createdClient = clientService.createClient(client);
        return new ResponseEntity<>(createdClient, HttpStatus.CREATED);
    }

    // Endpoint to create multiple clients
    @PostMapping("/batch")
    public ResponseEntity<List<Client>> createClients(@RequestBody List<Client> clients) {
        List<Client> createdClients = clientService.createClients(clients);
        return new ResponseEntity<>(createdClients, HttpStatus.CREATED);
    }
}

