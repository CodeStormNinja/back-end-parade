package com.CodeStormNinja.back_end_parade.model;

public class ClimaOutput {

    private String status;
    private String fraseFinal;
    private String mensagem;

    public ClimaOutput(String status, String mensagem) {
        this.status = status;
        this.mensagem = mensagem;

    }



    public ClimaOutput(String fraseFinal){
        this.fraseFinal =fraseFinal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }


    public String getFraseFinal() {
        return fraseFinal;
    }

    public void setFraseFinal(String fraseFinal) {
        this.fraseFinal = fraseFinal;
    }

}
