package com.CodeStormNinja.back_end_parade.service;

import com.CodeStormNinja.back_end_parade.model.ClimaInput;
import com.CodeStormNinja.back_end_parade.model.ClimaOutput;
import com.CodeStormNinja.back_end_parade.model.DadosBrutos;
import org.springframework.stereotype.Service;

@Service
public class ClimaService {

    // controller buscará esse

    public ClimaOutput analisarStatus(ClimaInput input) {
        DadosBrutos dadosBrutos = buscarDadosBrutosSimulados(input);

        String fraseFinal = logicaNegocio(dadosBrutos);

        return new ClimaOutput(fraseFinal);
    }

    // metodo que terá o okhttp
    // teste

    public DadosBrutos buscarDadosBrutosSimulados(ClimaInput input) {

        System.out.println("buscando dados para a localizção..." + input.getLocalidade());

        return new DadosBrutos(30.0, 25.8, 7.5);
    }

    // lógia de if else

    public String logicaNegocio(DadosBrutos dados) {
        int temp = (int) dados.getTemperatura();
        switch (temp) {
            case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15:
                return "Frio";
            case 16, 17, 18, 19, 20, 21, 22, 23, 24:
                return "Ameno";
            case 25, 26, 27, 28, 29:
                return "Quente";
            case 30, 31, 32, 33, 34, 35, 36:
                return "Muito Quente";
            default:
                if (dados.getTemperatura() >= 36) {
                    return "Extremamente Quente";
                } else {
                    return "Dados inválidos";
                }
        }
    }
}
