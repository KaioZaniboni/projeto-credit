package br.com.zaniboni.mscreditanalysis.infra.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "mscustomers", path = "/customers")
public interface ClienteResourceClient {

    @GetMapping(params = "cpf")
    public ResponseEntity customerData(@RequestParam("cpf") String cpf);
}
