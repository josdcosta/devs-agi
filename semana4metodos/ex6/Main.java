package com.agibank.Semana4Metodos.ex6;

public class Main {
    public static void main(String[] args) {
        double[] retornoAcoes = new double[]{0.01, 0.02, -0.01, 0.03, -0.02};
        double desvPad = calcularVolatilidade(retornoAcoes);
        System.out.println(desvPad);
    }

    static double calcularVolatilidade(double[] retornoAcoes) {
        return Math.sqrt(calcularVariancia(retornoAcoes));
    }

    static double calcularVariancia(double[] vetor){
        double media = media(vetor);
        double somaQuadradosdaDif = 0;
        for (double v : vetor) {
            somaQuadradosdaDif += Math.pow((v - media), 2);
        }
        return somaQuadradosdaDif/vetor.length;
    }

    static double media(double[] vetor){
        double somaVetor = 0;
        for (double v : vetor) {
            somaVetor += v;
        }
        return somaVetor/vetor.length;
    }
}
