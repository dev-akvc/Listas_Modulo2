package br.com.zup;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
/*
Faça um Programa que leia um número e exiba o dia correspondente da semana.
 */
        /* Instanciando Scanner */
        Scanner leitor = new Scanner(System.in);

//        Declarando variáveis
        int diaDaSemana;

        System.out.println("Olá, verifique as opções de dias e digite sua escolha:  ");
        System.out.println("1 - Domingo");
        System.out.println("2 - Segunda");
        System.out.println("3 - Terça");
        System.out.println("4 - Quarta");
        System.out.println("5 - Quinta");
        System.out.println("6 - Sexta");
        System.out.println("7 - Sábado");

        diaDaSemana = leitor.nextInt();
//        System.out.println("A opção escolhida foi " + diaDaSemana);

        switch (diaDaSemana){
            case 1:
                System.out.println("Domingoooou!");
                break;
            case 2:
                System.out.println("Segundou!");
                break;
            case 3:
                System.out.println("Terçou!");
                break;
            case 4:
                System.out.println("Quartou!");
                break;
            case 5:
                System.out.println("Quintou!");
                break;
            case 6:
                System.out.println("Sextooou!");
                break;
            case 7:
                System.out.println("Sabadooou!");
                break;
            default:
                System.out.println("Digite uma opção válida.");
                break;
       }
    }
}
