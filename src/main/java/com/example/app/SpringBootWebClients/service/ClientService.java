package com.example.app.SpringBootWebClients.service;

import com.example.app.SpringBootWebClients.entity.Client;
import com.example.app.SpringBootWebClients.repository.ClientRepositoy;
import com.example.app.SpringBootWebClients.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientRepositoy repository;

    public List<Client> getClients() {

        List<Client> clients = repository.findAll().stream()

                .map(client -> new Client(client.getId(),
                        client.getFirst_name(),
                        client.getLast_name(),
                        client.getPhone(),
                        Constants.URL_IMAGE + client.getImg()))
                .toList();

        return new ArrayList<>(clients);
    }
}
