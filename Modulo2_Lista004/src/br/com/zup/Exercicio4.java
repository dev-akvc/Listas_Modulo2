package br.com.zup;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

         /*
        Escreva, usando while, um programa para calcular a média de N números.
        O valor de N é dado pelo usuário.
          */
//        Instanciando Scanner
        Scanner leitor = new Scanner(System.in);

//        Declarando variáveis
        double qtdDeNumeros;
        int contador = 1;
        double soma = 0;
        double media = 0;


//        Recebendo números
        System.out.println("Olá, vamos calcular a média.");
        System.out.println("Por favor, me informe a quantidade de números: ");
        qtdDeNumeros = leitor.nextDouble();

        while (contador <=qtdDeNumeros){
            System.out.println("Informe o " +contador+ "º número");
            double valorLido = leitor.nextDouble();;
            soma = soma +valorLido;
            media = soma/qtdDeNumeros;

            contador +=1;
        }
        System.out.println("A soma é: " +soma);
        System.out.println("E a média é: " +media);
    }
}
