package br.com.zup;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
/*
Faça um programa que receba dois números inteiros e gere os números inteiros
que estão no intervalo compreendido por eles.
 */
//        Instanciando Scanner
        Scanner leitor = new Scanner(System.in);

//        Declarando variáveis
        int numeroInicial = 0, numeroFinal = 0;

        System.out.println("Olá! Informe o primeiro número: ");
        numeroInicial = leitor.nextInt();
        System.out.println("Informe o último número: ");
        numeroFinal = leitor.nextInt();

        if (numeroInicial <= numeroFinal) {
            for (int i = numeroInicial; i <= numeroFinal; i++) {
                System.out.println(i);
            }
        }
        else {
            System.out.println("Digite um intervalo válido.");
        }

    }
}

