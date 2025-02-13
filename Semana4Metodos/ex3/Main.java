package com.agibank.Semana4d1.ex3;

public class Main {
    public static void main(String[] args) {
        //Exercicio 3
        System.out.println(calcularCrescimento(100, 105));
    }
    static double calcularCrescimento(double preco1, double preco2) {
        double crescimento = ((preco2 / preco1) - 1) * 100;
        return crescimento;
    }

}