package com.agibank.Semana4Excecao.ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] valor;

        System.out.println("Digite as ações separadas por virgula:");
        valor = scanner.nextLine().split(",");

        double[] acoes = new double[valor.length];

        try {
            for (int i = 0; i < valor.length; i++) {
                acoes[i] = Double.parseDouble(valor[i]);
            }
            double[] mediaMovel = mediaMovel(acoes);
            for (double mm : mediaMovel) {
                System.out.println(mm);
            }
        }catch (NumberFormatException e){
            System.out.printf("\nExceção de formato %s\n",e.getMessage());
        } catch (IllegalArgumentException e ){
            System.out.printf("\nExceção de argumento %s\n",e.getMessage());
        }
    }

    static double[] mediaMovel(double[] vetor){
        if(vetor.length < 3){
            throw new  IllegalArgumentException();
        }
        double[] vetorMM = new double[vetor.length-2];
        for (int i = 0; i < vetor.length-2; i++) {
            for (int j = 0; j < 3; j++) {
                vetorMM[i] = vetor[i+j];
            }
        }
        return vetorMM;
    }

}