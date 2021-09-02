package br.com.zup;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
/*
Faça um Programa que leia 4 notas, mostre as notas e a média na tela.
 */

//        Instanciando Scanner
        Scanner leitor = new Scanner (System.in);

//        Declarando variáveis
        double notas = 0, soma =0 ,media= 0;

        System.out.println("Por favor me informe: ");

        for (int i = 1; i <= 4; i++) {
            System.out.println("A " +i+ "ª nota: ");
            notas = leitor.nextInt();
            soma += notas;
            media = soma/i;
        }
        System.out.println("A soma das notas é: " +soma);
        System.out.println("E a média é: " +media);
   }
}
