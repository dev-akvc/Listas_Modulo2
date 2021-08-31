package br.com.zup;

import java.util.Scanner;

public class Exercicio_extra {
    public static void main(String[] args) {
/*
Faça um programa que receba um conjunto de N números (Digitado pelo usuário) e mostre:
O menor valor
O maior valor
A soma dos valores.

 */
        //        Instanciando Scanner
        Scanner leitor = new Scanner(System.in);

//        Declarando as variáveis
        double numeroRecebido = 0;
        double maiorNumero = 0;
        double menorNumero = 0;
        int contador = 1;
        int qtdeDeNumeros = 0;
        double soma = 0;


//        Recebendo números
        System.out.println("Olá, quantos números deseja verificar?");
        qtdeDeNumeros = leitor.nextInt();

        while (contador <=qtdeDeNumeros) {
            System.out.println("Informe o " +contador+ "º número");
            numeroRecebido = leitor.nextDouble();

            if (contador ==1) {
                maiorNumero = numeroRecebido;
                menorNumero = numeroRecebido;
            }else{
                if (numeroRecebido <= menorNumero) {
                    menorNumero = numeroRecebido;
                }

                if (numeroRecebido >= maiorNumero) {
                    maiorNumero = numeroRecebido;
                }}

            soma = soma +numeroRecebido;
            contador +=1;

        }
        System.out.println("a) O menor valor é: " +menorNumero);
        System.out.println("b) O maior valor é: " +maiorNumero);
        System.out.println("c) A soma é: " +soma);
    }
}
