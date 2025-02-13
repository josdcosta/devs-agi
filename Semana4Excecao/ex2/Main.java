package com.agibank.Semana4Excecao.ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double[] saldoConta = new double[]{1000.0, 2000.0, 3000.0, 4000.0, 5000.0, 6000.0, 7000.0, 8000.0, 9000.0, 10.000};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um índice de 1 a 10.");
        int indice = scanner.nextInt();
        try {
            System.out.printf("Saldo da conta é %s",saldoConta[indice]);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Conta não encontrada");
        }

    }


}