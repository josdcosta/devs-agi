package com.agibank.Semana4Debug.ex7;

public class Main {
    public static void main(String[] args) {
        double[][] matrizRisco = {
                {1.0, 1.2, 1.1, 1.3},
                {0.9, 1.0, 1.1, 1.2},
                {1.5, 1.6, 1.4, 1.3}
        };
        for(double somaVariacoes: somaModuloVariacoes(matrizRisco)){
            System.out.printf("%.2f ",somaVariacoes);
        }
    }
    
    static double[] somaModuloVariacoes(double[][] matrizRisco){
        double[] vetorSomaVariacoes = new double[matrizRisco.length];
        for (int i = 0; i < matrizRisco.length; i++) {
            for (int j = 0; j < matrizRisco[i].length-1; j++) {
               vetorSomaVariacoes[i] += Math.abs(matrizRisco[i][j+1] - matrizRisco[i][j]);
            }
        }
        return vetorSomaVariacoes;
    }
}

