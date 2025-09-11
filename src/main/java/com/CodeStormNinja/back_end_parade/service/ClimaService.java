package com.CodeStormNinja.back_end_parade.service;

import com.CodeStormNinja.back_end_parade.model.ClimaInput;
import com.CodeStormNinja.back_end_parade.model.ClimaOutput;
import com.CodeStormNinja.back_end_parade.model.DadosBrutos;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedHashMap;

@Service
public class ClimaService {

    private final RestTemplate restTemplate = new RestTemplate();

    // controller buscará esse

    public ClimaOutput analisarStatus(ClimaInput input) {
        DadosBrutos dadosBrutos = buscarDadosBrutos(input);

        String fraseFinal = logicaNegocio(dadosBrutos);

        return new ClimaOutput(fraseFinal);
    }

    private LinkedHashMap<String, String> buscarCordenadas(String localiade) {
        String url = "" + localiade + "&format=jason&limit=1";
        try{

            Object[] resposta = restTemplate.getForObject(url,Object[].class);
            if (resposta != null && resposta.length > 0) {
                return  (LinkedHashMap<String, String>) resposta[0];
            }

        }catch (Exception e){
            System.err.println("error fetching coordinates" + e.getMessage());

        }
        return  null;

    }


    public DadosBrutos buscarDadosBrutos(ClimaInput input) {
        System.out.println("searching for data for location" + input.getLocalidade());

        String url = "" + input.getLocalidade();

        try{

            return restTemplate.getForObject(url,DadosBrutos.class);

        } catch (Exception e) {
            System.err.println("Error fetching data" + e.getMessage());

            return  new DadosBrutos();
        }


    }

    // lógia de if else

    public String logicaNegocio(DadosBrutos dados) {
        int temp = (int) dados.getTemperatura();
        switch (temp) {
            case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9:
                return "Muito Frio";
            case 10, 11, 12, 13, 14, 15:
                return "Frio";
            case 16, 17, 18, 19, 20, 21, 22, 23, 24:
                return "Agradável";
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
