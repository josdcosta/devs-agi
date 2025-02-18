package com.agibank.Semana4Metodos.ex2;

public class Main {
    public static void main(String[] args) {
        //Exercicio 2
        System.out.println(calculoJurosSimples(1000.0, 5.0, 3));
    }

    static double calculoJurosSimples(double capital, double taxaPercAnual, int anos) {
        double motante = capital + capital * (taxaPercAnual / 100) * anos;
        return motante;
    }

}