package com.agibank.Semana4Excecao.ex4;

public class Main {
    public static void main(String[] args) {
        System.out.println(simularParcelamento(1000, 0.05));
    }

    static double simularParcelamento(double valorEmprestimo,double jurosMensal){
        if(jurosMensal < 0){
            throw new IllegalArgumentException("A taxa de juros não pode ser negativa");
        }
        if(valorEmprestimo == 0){
            throw new ArithmeticException("A divisão por zero é proibida");
        }
        return (valorEmprestimo * jurosMensal) / (1 - Math.pow(1 + jurosMensal, -12));
    }
}