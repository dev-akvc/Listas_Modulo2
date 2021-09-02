package br.com.zup;

public class Exercicio6 {
    public static void main(String[] args) {
/*
Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.
 */
//        Declarando variáveis
        int numeroParaVerificar;

        System.out.println("O número é ímpar?");

        for (int i = 1; i < 50; i++) {
            if (i % 2 != 0){
                System.out.println(i+ " é ímpar");
            }
        }
    }
}
