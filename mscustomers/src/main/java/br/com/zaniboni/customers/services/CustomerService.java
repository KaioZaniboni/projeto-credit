package br.com.zaniboni.customers.services;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.zaniboni.customers.entities.Customer;
import br.com.zaniboni.customers.repositories.CustomerRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository repository;

    @Transactional
    public Customer save(Customer customer){
        return repository.save(customer);
    }

    public Optional<Customer> getByCPF(String cpf){
        return repository.findByCpf(cpf);
    }
}