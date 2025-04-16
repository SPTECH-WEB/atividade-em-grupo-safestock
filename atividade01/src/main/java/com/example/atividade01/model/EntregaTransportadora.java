package com.example.atividade01.model;

import org.springframework.stereotype.Component;

@Component("EntregaTransporte")
public class EntregaTransportadora {
    public double calcular(double valor){
        return valor * 1.0;
    }

    public String categoria (){
        return "EntregaTransporte";
    }
}
