package com.example.app.SpringBootWebClients.repository;

import com.example.app.SpringBootWebClients.entity.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepositoy extends CrudRepository<Client, Integer> {
    List<Client> findAll();
}
