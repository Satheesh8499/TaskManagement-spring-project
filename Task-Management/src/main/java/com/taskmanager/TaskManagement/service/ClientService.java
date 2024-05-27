package com.taskmanager.TaskManagement.service;

import com.taskmanager.TaskManagement.enitity.Client;
import com.taskmanager.TaskManagement.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    // Method to create a single client
    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    // Method to create multiple clients
    public List<Client> createClients(List<Client> clients) {
        return clientRepository.saveAll(clients);
    }
}
