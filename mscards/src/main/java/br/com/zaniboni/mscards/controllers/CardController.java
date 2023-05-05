package br.com.zaniboni.mscards.controllers;

import br.com.zaniboni.mscards.dtos.CardDTO;
import br.com.zaniboni.mscards.dtos.CustomerCardDTO;
import br.com.zaniboni.mscards.entities.Card;
import br.com.zaniboni.mscards.entities.CustomerCard;
import br.com.zaniboni.mscards.services.CardService;
import br.com.zaniboni.mscards.services.CustomerCardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("cards")
@RequiredArgsConstructor
public class CardController {

    private final CardService cardService;
    private final CustomerCardService customerCardService;

    @GetMapping
    public String status(){
        return "ok";
    }

    @PostMapping
    public ResponseEntity register(@RequestBody CardDTO request ){
        Card card = request.toModel();
        cardService.save(card);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping(params = "income")
    public ResponseEntity<List<Card>> getCardsIncomeUpTo(@RequestParam("income") Long renda){
        List<Card> list = cardService.getCardsIncomeLessThanEqual(renda);
        return ResponseEntity.ok(list);
    }

    @GetMapping(params = "cpf")
    public ResponseEntity<List<CustomerCardDTO>> getCardsByCliente(
            @RequestParam("cpf") String cpf){
        List<CustomerCard> list = customerCardService.listCardsByCpf(cpf);
        List<CustomerCardDTO> resultList = list.stream()
                .map(CustomerCardDTO::fromModel)
                .collect(Collectors.toList());
        return ResponseEntity.ok(resultList);
    }
}
