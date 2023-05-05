package br.com.zaniboni.customers.dtos;

import br.com.zaniboni.customers.entities.Customer;
import lombok.Data;

@Data
public class CustomerDTO {
    private String cpf;
    private String name;
    private Integer age;

    public Customer toModel(){
        return new Customer(cpf, name, age);
    }
}