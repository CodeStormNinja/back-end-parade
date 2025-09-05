package com.CodeStormNinja.back_end_parade.controller;

import com.CodeStormNinja.back_end_parade.model.ClimaInput;
import com.CodeStormNinja.back_end_parade.model.ClimaOutput;
import com.CodeStormNinja.back_end_parade.service.ClimaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/clima")
public class ClimaController {

    @Autowired
    private ClimaService climaService;

    @PostMapping("/analise")
    ResponseEntity<ClimaOutput> analiseClima(@RequestBody ClimaInput input){
        ClimaOutput output = climaService.analisarStatus(input);

        return  ResponseEntity.ok(output);

    }


}
