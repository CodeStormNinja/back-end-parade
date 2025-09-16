package com.CodeStormNinja.back_end_parade.model;

public class ClimaOutput {

    private String evento;
    private String mensagem;
    private double temperatura;
    private double chanceChuva;


    public ClimaOutput(String evento, String mensagem) {
        this.evento = evento;
        this.mensagem = mensagem;
    }

    public ClimaOutput(String evento, double temperatura, double chanceChuva) {
        this.evento = evento;
        this.temperatura = temperatura;
        this.chanceChuva = chanceChuva;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public double getChanceChuva() {
        return chanceChuva;
    }

    public void setChanceChuva(float chanceChuva) {
        this.chanceChuva = chanceChuva;
    }


}
