package com.agibank.Semana4d1.ex9;

public class Main {
    public static void main(String[] args){
        double[] serie1 = new double[]{100.0, 102.0, 104.0, 106.0};
        double[] serie2 = new double[]{50.0, 51.0, 52.0, 53.0};
        System.out.println(calcularCorrelacao(serie1, serie2));
        }

        static double calcularCorrelacao(double[] x, double[] y){
            double desvPadx = desvPad(x);
            double desvPady = desvPad(y);
            double covarxy = covarxy(x, y);
            return covarxy/(desvPadx*desvPady);
        }

        static double covarxy(double[] x, double[] y){
            double somaProduto = 0;
            double mediax = media(x);
            double mediay = media(y);
            for (int i = 0; i < x.length; i++) {
                somaProduto += (x[i]-mediax)*(y[i]-mediay);
            }
            return somaProduto/x.length;
        }

        static double desvPad(double[] retornoAcoes) {
            double media = media(retornoAcoes);
            double somaQuadradosdaDif = 0;
            for (double retornoAcao : retornoAcoes) {
                somaQuadradosdaDif += Math.pow((retornoAcao - media), 2);
            }
            return Math.sqrt(somaQuadradosdaDif/retornoAcoes.length);
        }

        static double media(double[] vetor){
            double somaVetor = 0;
            for (double v : vetor) {
                somaVetor += v;
            }
            return somaVetor/vetor.length;
        }

}