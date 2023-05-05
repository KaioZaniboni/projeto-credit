package br.com.zaniboni.mscards.dtos;

import br.com.zaniboni.mscards.entities.CustomerCard;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerCardDTO {
    private String name;
    private String flag;
    private BigDecimal limitRelease;

    public static CustomerCardDTO fromModel(CustomerCard model){
        return new CustomerCardDTO(
                model.getCard().getName(),
                model.getCard().getFlag().toString(),
                model.getLimit()
        );
    }
}