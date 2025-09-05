package com.CodeStormNinja.back_end_parade.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;



public class ClimaInput {
    private String localidade;
    private LocalDateTime dataEHora;

    public ClimaInput(String localidade, LocalDateTime dataEHora) {
        this.localidade = localidade;
        this.dataEHora = dataEHora;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public LocalDateTime getDataEHora() {
        return dataEHora;
    }

    public void setDataEHora(LocalDateTime dataEHora) {
        this.dataEHora = dataEHora;
    }
}


