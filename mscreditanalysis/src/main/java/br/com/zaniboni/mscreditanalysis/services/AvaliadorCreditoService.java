package br.com.zaniboni.mscreditanalysis.services;

import br.com.zaniboni.mscreditanalysis.entities.DadosCliente;
import br.com.zaniboni.mscreditanalysis.entities.SituacaoCliente;
import br.com.zaniboni.mscreditanalysis.infra.clients.ClienteResourceClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AvaliadorCreditoService {

    private final ClienteResourceClient clienteResourceClient;
    public SituacaoCliente obterSituacaoCliente(String cpf) {
        ResponseEntity<DadosCliente> dadosClienteResponse = clienteResourceClient.customerData(cpf);
        return SituacaoCliente
                .builder()
                .cliente(dadosClienteResponse.getBody())
                .build();
    }
}
