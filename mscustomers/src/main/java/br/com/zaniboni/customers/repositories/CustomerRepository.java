package br.com.zaniboni.customers.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.zaniboni.customers.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	Optional<Customer> findByCpf(String cpf);
}
