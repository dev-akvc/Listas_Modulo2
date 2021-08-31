package br.com.zup;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
//        Faça um programa para ler 5 números e
//        mostrar o resultado da soma desses números.

//        Instanciando Scanner
        Scanner leitor = new Scanner(System.in);
//
////        Declarando variáveis
        double numeroRecebido = 0;
        int contador = 1;
        double soma = 0;

//        Recebendo números
        System.out.println("Olá, vamos somar os números.");

        while (contador <=5){
            System.out.println("Informe o " +contador+ "º número");
            numeroRecebido = leitor.nextDouble();;
            soma = soma +numeroRecebido;

            contador +=1;
        }
        System.out.println("A soma é: " +soma);

    }
}
