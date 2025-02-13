package com.agibank.Semana4Excecao.ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] saldoConta = new double[10];
        int indice = 1;
        while (indice <= saldoConta.length){
            try {
                System.out.printf("\nDigite do saldo numero %d: \n", indice);
                saldoConta[indice-1] = scanner.nextDouble();
            } catch (InputMismatchException e){
                scanner.nextLine();
                System.out.print("\nEntrada inválida %s\n");
                continue;
            }
            indice++;
        }
        System.out.println("Digite um índice de 1 a 10.");
        indice = scanner.nextInt();
        try {
            System.out.printf("Saldo da conta é %s",saldoConta[indice]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Conta não encontrada");
        }
    }
}