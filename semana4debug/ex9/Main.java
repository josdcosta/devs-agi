package com.agibank.Semana4Debug.ex9;

public class Main {
    public static void main(String[] args) {
        int parcelas = 12;
        double[][] precosSimulados = new double[parcelas][4];
        try {
            precosSimulados = simularEmprestimoPrice(1000, 5, 12);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        for (double[] precosSimulado : precosSimulados){
            for (double v : precosSimulado){
                System.out.printf("%.2f ",v);
            }
            System.out.println();
        }
    }

    static double[][] simularEmprestimoPrice(double valorEmprestimo, double taxaMensal, int parcelas){
        if(valorEmprestimo < 0 || taxaMensal < 0 || parcelas < 0){
            throw new IllegalArgumentException("Argumentos não válidos!");
        }
       double[][] matrizPrice = new double[parcelas+1][5];
       double taxa = taxaMensal/100;
       double saldoDevedorAntes;
       double saldoDevedorDepois = valorEmprestimo;
       double juros = 0;
       double PMT = 0;
       for (int i = 0; i < matrizPrice.length; i++){
            saldoDevedorAntes = saldoDevedorDepois;
            saldoDevedorDepois = saldoDevedorDepois - (PMT - juros);
            matrizPrice[i] = new double[]{i,saldoDevedorAntes, juros, PMT-juros, saldoDevedorDepois};
            PMT = (valorEmprestimo*taxa)/(1-Math.pow(1+taxa,-parcelas));
            juros = saldoDevedorDepois*taxa;
       }
       System.out.println(PMT);
       return matrizPrice;
    }

}

