package com.agibank.Semana4Excecao.ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] valor;
        double[][] matrizPortifolio = new double[3][3];

        try {
            for (int i = 0; i < 3; i++) {
                System.out.printf("\nDigite as ações do %s vetor separadas por virgula: \n", i+1);
                valor = scanner.nextLine().split(",");
                matrizPortifolio[i] = parseDouble(valor);
            }
            double[] mediaPortifolio = mediaPortifolio(matrizPortifolio);
            for (double mp : mediaPortifolio) {
                System.out.println(mp);
            }
        } catch (NumberFormatException e){
            System.out.printf("\nExceção de formato %s\n",e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.printf("\nA matriz não é uma 3x3, indice fora: %s\n", e.getMessage());
        }
    }

    static double[] parseDouble(String[] vetorPosicao){
        double[] vetorPosicaoParsed = new double[3];
        for (int i = 0; i < 3; i++) {
            vetorPosicaoParsed[i] = Double.parseDouble(vetorPosicao[i]);
        }
        return vetorPosicaoParsed;
    }

    static double[] mediaPortifolio(double[][] portifolio){
        double[] mediaPortifolio = new double[3];
        double somaValores = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    somaValores += portifolio[i][j];
                }
                mediaPortifolio[i] = somaValores;
            }
        return mediaPortifolio;
    }

}