package com.agibank.Semana4Maratona;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
* Nota: 100 - 5 + 5 (Sendo Tester do Thiago) = 100
* Nome do Dev: Josué Davi da Costa
* Nome do Tester: Beatriz Alves da Silva Santos
* Justificativa: todos os módulos foram criados de acordo com o perdido, não foi encontrado erro de lógica, apesar
* da falta de comentários o código está legivel, apenas com alguns recursos utilizados que não era do meu entendimento mas
* tirei a dúvida com o dev. Os testes foram validados e os erros passram pelas exceções postas, apenas um que não funcionou
* devidamente (linha 26 - 64), onde simulei entranta com string.
*  */

public class Main {
    public static void main(String[] args) {
        double[][] matrizCarteiraInvest = new double[][]{
                {22.5, 23.0, 22.0, 25.4, 25.0},
                {85.0, 86.5, 84.0, 83.5, 87.0},
                {30.0, 29.5, 30.5, 31.0, 32.5}
        };

        String[] acoes = {"PETR4", "VALE3", "ITAB4" };
        //Entradas da consulta das ações
        int acao = 1;
        int dia = 6;

        int opAcao;
        double media;
        try{
            //entrada média
            opAcao = 7;
            media = mediaPrecos(matrizCarteiraInvest, opAcao);
            System.out.printf("Ação escolhida é a %s\n", acoes[opAcao-1]);
            System.out.printf("Média de preços do ativo %s -> %.2f\n", acoes[opAcao-1], media);
        }catch (IllegalArgumentException e){
            System.out.println("Entrada inválida! Impossível calcular a média");
        }
        
        double[] maiorValorizacao = maiorValorizacao(matrizCarteiraInvest);

        switch ((int) maiorValorizacao[0]){
            // simplificar a condicional
            case 0 -> System.out.printf("Maior valorização: (de %.2f para %.2f, crescimento %.2f%%) Ação: %s\n",matrizCarteiraInvest[(int) maiorValorizacao[0]][0], matrizCarteiraInvest[(int) maiorValorizacao[0]][matrizCarteiraInvest[0].length-1] , maiorValorizacao[1],acoes[(int) maiorValorizacao[0]]);
            case 1 -> System.out.printf("Maior valorização: (de %.2f para %.2f, crescimento %.2f%%) Ação: %s\n",matrizCarteiraInvest[(int) maiorValorizacao[0]][0], matrizCarteiraInvest[(int) maiorValorizacao[0]][matrizCarteiraInvest[0].length-1] , maiorValorizacao[1],acoes[(int) maiorValorizacao[0]]);
            case 2 -> System.out.printf("Maior valorização: (de %.2f para %.2f, crescimento %.2f%%) Ação: %s\n",matrizCarteiraInvest[(int) maiorValorizacao[0]][0], matrizCarteiraInvest[(int) maiorValorizacao[0]][matrizCarteiraInvest[0].length-1] , maiorValorizacao[1],acoes[(int) maiorValorizacao[0]]);
        }

        double[] simulacao = simulacaoLucroPerda(matrizCarteiraInvest);
        for (int i = 0; i < simulacao.length; i++) {
            if(simulacao[i]==0){
                System.out.printf("Não houve lucro/perda %.2f\n", simulacao[i]);
            } else if (simulacao[i] > 0) {
                System.out.printf("Lucro %.2f%%\n", simulacao[i]);
            } else{
                System.out.printf("Perda %.2f%%\n", simulacao[i]);
            }
        }

        try{
            double precoAcaoDia = consultarPreco(matrizCarteiraInvest, acao, dia);
            System.out.printf("Ação: %s no dia %d é %.2f",acoes[acao-1], dia, precoAcaoDia);
        } catch (IllegalArgumentException e){
            System.out.println("Impossível buscar, acao ou dia inexistente.");
        }
    }

    public static double mediaPrecos(double[][] matriz, int opcao){
        if(!(opcao > 0 && opcao <= matriz.length)){
            throw new IllegalArgumentException();
        }
        double[] matrizParaMedia = matriz[opcao - 1];
        double somaAcoes = 0;
        for (double acao : matrizParaMedia) {
            somaAcoes += acao;
        }
        return somaAcoes/matrizParaMedia.length;
    }

    public static double[] maiorValorizacao (double[][] matrizPrecos){
        double[] valorizacao = new double[matrizPrecos.length];
        for (int i = 0; i < matrizPrecos.length; i++) {
            valorizacao[i] = ((matrizPrecos[i][matrizPrecos[i].length-1] - matrizPrecos[i][0])/matrizPrecos[i][0])*100;
        }
        double[] maior = new double[2];
        maior[0] = 0;
        maior[1] = valorizacao[0];

        for (int i = 0; i < valorizacao.length-1; i++) {
            if(maior[1]<valorizacao[i+1]){
                maior[0] = i+1;
                maior[1] = valorizacao[i+1];
            }
        }
        return maior;
    }

    public static double[] simulacaoLucroPerda(double[][] matrizPrecos){
        double[] valorizacao = new double[matrizPrecos.length];
        for (int i = 0; i < matrizPrecos.length; i++) {
            valorizacao[i] = ((matrizPrecos[i][matrizPrecos[i].length-1] - matrizPrecos[i][0])/matrizPrecos[i][0])*100;
        }
        return valorizacao;
    }

    public static double consultarPreco(double[][] matrizPrecos, int acao, int dia){
        if(!(acao > 0 && acao <= matrizPrecos.length && dia > 0 && dia <= matrizPrecos[0].length)){
            throw new IllegalArgumentException();
        }
        return matrizPrecos[acao-1][dia-1];
    }
}