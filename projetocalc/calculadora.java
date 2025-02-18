package com.agibank.projetocalc;

public class calculadora {

    public static void main(String[] args) {
        System.out.printf("Resultado é %d", soma(1,2));
        System.out.printf("Resultado é %d", subtracao(1,2));
    }

    public static int soma(int a , int b){
        return a+b;
    }

    public static int subtracao(int a , int b){
        return a-b;
    }
}
