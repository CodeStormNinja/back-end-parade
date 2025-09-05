package com.CodeStormNinja.back_end_parade.service;

import com.CodeStormNinja.back_end_parade.model.ClimaInput;
import com.CodeStormNinja.back_end_parade.model.ClimaOutput;
import com.CodeStormNinja.back_end_parade.model.DadosBrutos;
import org.springframework.stereotype.Service;


@Service
public class ClimaService {



    // controller buscará esse

    public ClimaOutput analisarStatus(ClimaInput input){
        DadosBrutos dadosBrutos = buscarDadosBrutosSimulados(input);

        String fraseFinal = logicaNegocio(dadosBrutos);

        return new ClimaOutput(fraseFinal);
    }


//    metodo que terá o okhttp
//    teste

    public DadosBrutos buscarDadosBrutosSimulados(ClimaInput input){

        System.out.println("buscando dados para a localizção..." + input.getLocalidade());

        return new DadosBrutos(30.0, 25.8, 7.5);
    }



    // lógia de if else

    public String logicaNegocio(DadosBrutos dados){
        return"teste";
    }
}
