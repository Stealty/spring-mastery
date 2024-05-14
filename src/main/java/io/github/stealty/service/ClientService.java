package io.github.stealty.service;

import io.github.stealty.model.Client;
import io.github.stealty.repository.ClientsRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private final ClientsRepository repository;

    public ClientService( ClientsRepository repository) {
        this.repository = repository;
    };

    public void saveClient(Client client) {
        validateClient(client);
        this.repository.persist(client);
    }

    public void validateClient(Client client) {}
}
