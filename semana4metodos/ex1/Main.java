package com.agibank.Semana4Metodos.ex1;

public class Main {
    public static void main(String[] args) {
        //Exercicio 1
        System.out.println(conveterMoeda(100.00, 4.90));
    }

    static double conveterMoeda(double valorReais, double taxaConversao) {
        double valorDolar = valorReais / taxaConversao;
        return valorDolar;
    }

}