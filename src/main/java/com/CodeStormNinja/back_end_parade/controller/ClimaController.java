package com.CodeStormNinja.back_end_parade.controller;

import com.CodeStormNinja.back_end_parade.model.ClimaInput;
import com.CodeStormNinja.back_end_parade.model.ClimaOutput;
import com.CodeStormNinja.back_end_parade.service.ClimaService;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clima")
public class ClimaController {

    @Autowired
    private ClimaService climaService;

    @GetMapping("/analise")
    ResponseEntity<ClimaOutput> analiseClima(
            @RequestParam String localidade,
            @RequestParam LocalDateTime dataEHora) {

        ClimaInput input = new ClimaInput(localidade, dataEHora);
        ClimaOutput output = climaService.analisarStatus(input);

        return ResponseEntity.ok(output);

    }

}
