package com.agibank.Semana4Excecao.ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double[][] planilhaRisco =
                {
                        {1, 0.1, 0.2, 0.3, 0.4},
                        {1, 0.1, 0.2, 0.3, 0.4},
                        {1, 0.1, 0.2, 0.3, 0.4},
                        {1, 0.1, 0.2, 1.1, 0.4},
                        {1, 0.1, 0.2, 0.3, 0.4}
                };
        try {
            validaPlanilhaRisco(planilhaRisco);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }

    static void validaPlanilhaRisco(double[][] planilhaRisco){
        for (int i = 0; i < planilhaRisco.length; i++) {
            for (int j = 0; j < planilhaRisco[0].length; j++) {
                if(planilhaRisco[i][j] > 1.0 || planilhaRisco[i][j] < 0){
                    String message = String.format("Valor inválido na posição [%d][%d]", i, j);
                    throw new ArrayIndexOutOfBoundsException(message);
                }
            }
        }
    }

}