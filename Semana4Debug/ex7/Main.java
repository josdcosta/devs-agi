package com.agibank.Semana4Debug.ex7;

public class Main {
    public static void main(String[] args) {

       double[][] precosSimulados = simularEmprestimoPrice(1000, 5, 12);

        for (double[] precosSimulado : precosSimulados){
            for (double v : precosSimulado){
                System.out.printf("%.2f ",v);
            }
            System.out.println();
        }
    }

    static double[][] simularEmprestimoPrice(double valorEmprestimo, double taxaMensal, int parcelas){
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

