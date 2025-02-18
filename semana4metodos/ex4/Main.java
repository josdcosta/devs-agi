package com.agibank.Semana4Metodos.ex4;

public class Main {
    public static void main(String[] args) {
        //Exercicio 4
        double[] mediaMovel = calcularMediaMovel(new double[]{100.0, 102.0, 101.0, 103.0, 105.0}, 4);
        for (int i = 0; i < mediaMovel.length; i++) {
            System.out.println(mediaMovel[i]);
        }
    }

    static double[] calcularMediaMovel(double[] precos, int intervalo) {
        double[] mediaMovel = new double[precos.length - intervalo + 1];
        double somaIntervalo;
        for (int i = 0; i <= precos.length - intervalo; i++) {
            somaIntervalo = 0;
            for (int j = 0; j < intervalo; j++) {
                somaIntervalo += precos[i + j];
            }
            mediaMovel[i] = somaIntervalo / intervalo;
        }
        return mediaMovel;
    }
}