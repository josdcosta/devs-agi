package com.agibank.Semana4d1.ex5;

public class Main {
    public static void main(String[] args) {
        //Exercicio 5
        compararAtivos(5.0, 4.5);
    }

    static void compararAtivos(double ativo1, double ativo2) {
        if (ativo1 > ativo2) {
            System.out.println("O ativo com maior retorno é o Ativo 1");
        } else if (ativo1 < ativo2) {
            System.out.println("O ativo com maior retorno é o Ativo 2");
        } else {
            System.out.println("Os ativos tem o mesmo retorno");
        }
    }

}