package com.CodeStormNinja.back_end_parade.model;

import java.time.OffsetDateTime;
import java.util.Optional;

public class DadosBrutos {

    private double temperatura;
    private double valorPrecipitacao;
    private double chancePrecipitacao;
    private double probabilidadeRaios;
    private double velocidadeRajadasVento;
    private double valorIntensidadeNeve;

    public DadosBrutos(double temperatura, double valorPrecipitacao, double chancePrecipitacao, double probabilidadeRaios, double velocidadeRajadasVento, double valorIntensidadeNeve) {
        this.temperatura = temperatura;
        this.valorPrecipitacao = valorPrecipitacao;
        this.chancePrecipitacao = chancePrecipitacao;
        this.probabilidadeRaios = probabilidadeRaios;
        this.velocidadeRajadasVento = velocidadeRajadasVento;
        this.valorIntensidadeNeve = valorIntensidadeNeve;
    }

    public DadosBrutos(double temperatura, double valorPrecipitacao, double chancePrecipitacao) {
        this.temperatura = temperatura;
        this.valorPrecipitacao = valorPrecipitacao;
        this.chancePrecipitacao = chancePrecipitacao;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getValorPrecipitacao() {
        return valorPrecipitacao;
    }

    public void setValorPrecipitacao(double valorPrecipitacao) {
        this.valorPrecipitacao = valorPrecipitacao;
    }

    public double getChancePrecipitacao() {
        return chancePrecipitacao;
    }

    public void setChancePrecipitacao(double chancePrecipitacao) {
        this.chancePrecipitacao = chancePrecipitacao;
    }

    public double getProbabilidadeRaios() {
        return probabilidadeRaios;
    }

    public void setProbabilidadeRaios(double probabilidadeRaios) {
        this.probabilidadeRaios = probabilidadeRaios;
    }

    public double getVelocidadeRajadasVento() {
        return velocidadeRajadasVento;
    }

    public void setVelocidadeRajadasVento(double velocidadeRajadasVento) {
        this.velocidadeRajadasVento = velocidadeRajadasVento;
    }

    public double getValorIntensidadeNeve() {
        return valorIntensidadeNeve;
    }

    public void setValorIntensidadeNeve(double valorIntensidadeNeve) {
        this.valorIntensidadeNeve = valorIntensidadeNeve;
    }
}