package br.com.zup;

import java.util.Scanner;

public class Exercício5 {
    public static void main(String[] args) {
//        Faça um Programa que receba um número e exiba o dia correspondente da semana.

        // Instanciando o Scanner
        Scanner leitor = new Scanner(System.in);

//        Exibindo menu de opções
        System.out.println("Verifique as opções correspondentes aos dias da semana: ");
        System.out.println("1 - Domingo");
        System.out.println("2 - Segunda");
        System.out.println("3 - Terça ");
        System.out.println("4 - Quarta");
        System.out.println("5 - Quinta");
        System.out.println("6 - Sexta ");
        System.out.println("7 - Sábado");

//        Recebendo opção
        System.out.println("Digite a opção desejada: ");

        int diaDesejado = leitor.nextInt();

        switch (diaDesejado) {

            case 1:
                System.out.println("Você escolheu domingo.");
                break;
            case 2:
                System.out.println("Você escolheu segunda.");
                break;
            case 3:
                System.out.println("Você escolheu terça.");
                break;
            case 4:
                System.out.println("Você escolheu quarta.");
                break;
            case 5:
                System.out.println("Você escolheu quinta.");
                break;
            case 6:
                System.out.println("Você escolheu sexta.");
                break;
            case 7:
                System.out.println("Você escolheu sábado.");
                break;
            default:
                System.out.println("Por favor, digite um número válido.");
                break;




        }

    }
}
