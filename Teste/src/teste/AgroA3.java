
package com.mycompany.agroa3;


public class AgroA3 {

    public static void main(String[] args) {
        Agricultor agricultor = new Agricultor("Pedro", "SP");
        agricultor.identificaAgricultor();
        agricultor.explicaAgricultor();
        ConsultaTerreno terreno = new ConsultaTerreno(10);
        //terreno.avaliaPrecip();
        //terreno.avaliaTempert();
        //terreno.avaliaFotoperiodo();
        //terreno.avaliaTopografia();
        terreno.avaliaTerreno();
        ConsultaIrrigacao consultaIrrigacao = new ConsultaIrrigacao(terreno);
        consultaIrrigacao.exibeAlgo();
        ControledePraga controledepraga = new ControledePraga();
        controledepraga.exibe();
        Safra producao = new Safra();
        producao.mediaProdução();
    }
}
