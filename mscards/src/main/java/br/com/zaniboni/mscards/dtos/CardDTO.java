package br.com.zaniboni.mscards.dtos;

import br.com.zaniboni.mscards.entities.Card;
import br.com.zaniboni.mscards.enums.CardFlag;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CardDTO {

    private String name;
    private CardFlag flag;
    private BigDecimal income;
    private BigDecimal creditLimit;

    public Card toModel(){
        return new Card(name, flag, income, creditLimit);
    }
}