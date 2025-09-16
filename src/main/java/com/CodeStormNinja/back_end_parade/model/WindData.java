package com.CodeStormNinja.back_end_parade.model;

public class WindData {

    private float velocidadeRajadasVento;
    private float valorIntensidadeNeve;

    public WindData(float velocidadeRajadasVento, float valorIntensidadeNeve) {
        this.velocidadeRajadasVento = velocidadeRajadasVento;
        this.valorIntensidadeNeve = valorIntensidadeNeve;
    }

    public float getVelocidadeRajadasVento() {
        return velocidadeRajadasVento;
    }

    public void setVelocidadeRajadasVento(float velocidadeRajadasVento) {
        this.velocidadeRajadasVento = velocidadeRajadasVento;
    }

    public float getValorIntensidadeNeve() {
        return valorIntensidadeNeve;
    }

    public void setValorIntensidadeNeve(float valorIntensidadeNeve) {
        this.valorIntensidadeNeve = valorIntensidadeNeve;
    }
}
