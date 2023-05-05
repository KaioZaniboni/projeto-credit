package br.com.zaniboni.mscards.services;

import br.com.zaniboni.mscards.entities.CustomerCard;
import br.com.zaniboni.mscards.repositories.CustomerCardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerCardService {

    private final CustomerCardRepository customerCardRepository;

    public List<CustomerCard> listCardsByCpf(String cpf){
        return customerCardRepository.findByCpf(cpf);
    }
}