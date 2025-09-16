package com.CodeStormNinja.back_end_parade.model;

public class PrecipitationData {

    private float valorPrecipitacao;
    private float chancePrecipitacao;
    private float probabilidadeRaios;

    public PrecipitationData(float valorPrecipitacao, float chancePrecipitacao, float probabilidadeRaios) {
        this.valorPrecipitacao = valorPrecipitacao;
        this.chancePrecipitacao = chancePrecipitacao;
        this.probabilidadeRaios = probabilidadeRaios;
    }

    public float getValorPrecipitacao() {
        return valorPrecipitacao;
    }

    public void setValorPrecipitacao(float valorPrecipitacao) {
        this.valorPrecipitacao = valorPrecipitacao;
    }

    public float getChancePrecipitacao() {
        return chancePrecipitacao;
    }

    public void setChancePrecipitacao(float chancePrecipitacao) {
        this.chancePrecipitacao = chancePrecipitacao;
    }

    public float getProbabilidadeRaios() {
        return probabilidadeRaios;
    }

    public void setProbabilidadeRaios(float probabilidadeRaios) {
        this.probabilidadeRaios = probabilidadeRaios;
    }
}
