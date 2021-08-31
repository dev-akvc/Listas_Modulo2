package br.com.zup;

import java.util.Scanner;

public class Exercício1 {
    public static void main(String[] args) {
//        Faça um programa que receba dois números e imprima o maior deles.

//        Declarando as variáveis
        Scanner leitor = new Scanner(System.in);
        double valor1;
        double valor2;

//        Recebendo valor das variáveis
        System.out.println("Olá! Vamos comparar dois números.");
        System.out.println("Por favor, informe o primeiro número: ");
        valor1 = leitor.nextDouble();
        System.out.println("Por favor, informe o segundo número: ");
        valor2 = leitor.nextDouble();

//        Condições para comparar
        if (valor1 > valor2) {
            System.out.println("Valor 1 é maior que valor 2.");
      }
        else if (valor2 > valor1) {
            System.out.println("Valor 2 é maior que valor 1.");
        }
        else {
            System.out.println("Os valores são iguais");
        }
    }
}
