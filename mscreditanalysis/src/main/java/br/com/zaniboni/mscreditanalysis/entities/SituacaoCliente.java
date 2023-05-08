package br.com.zaniboni.mscreditanalysis.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SituacaoCliente {
    public DadosCliente cliente;
    private List<CartaoCliente> cartao;
}
