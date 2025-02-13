package com.agibank.Semana4Metodos.ex8;

public class Main {
    public static void main(String[] args) {
        System.out.println(calcularJurosCompostos(1000.0, 0.02, 12));
        }

        static double calcularJurosCompostos(double capital, double taxa, int meses){
            return capital*Math.pow((1+taxa),meses);
        }

}