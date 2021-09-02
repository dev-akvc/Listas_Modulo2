package br.com.zup;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
/*
Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.
 */
//        Instanciando Scanner
        Scanner leitor = new Scanner(System.in);

//        Declarando variáveis
        int numeroRecebido;

        System.out.println("Informe o número que deseja verificar: ");
        numeroRecebido = leitor.nextInt();
        if (numeroRecebido %2 !=0){
            System.out.println("O número informado é primo!");
        }
        else {
            System.out.println("O número não é primo!");
        }

    }
}
