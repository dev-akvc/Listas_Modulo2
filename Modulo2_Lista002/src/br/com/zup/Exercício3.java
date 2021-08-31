package br.com.zup;

import java.util.Scanner;

public class Exercício3 {
    public static void main(String[] args) {
//        Faça um programa que receba duas notas parciais de um aluno.

//        instanciando o Scanner
        Scanner leitor = new Scanner (System.in);

//        Declarando as variáveis
        double nota1;
        double nota2;
        double media;

//        Recebendo os valores
        System.out.println("Olá! Vamos verificar a média das notas e sua situação.");
        System.out.println("Digite a Nota 1: ");
        nota1 = leitor.nextDouble();
        System.out.println("Digite a Nota 2: ");
        nota2 = leitor.nextDouble();

//        Interrupção em caso de nota menor que zero
        if (nota1 <0 | nota2 <0 ) {
            System.out.println("Por favor, digite uma nota válida.");
            return;
        }

//        Cálculo da média
        media = (nota1+nota2)/2;
        System.out.println("Sua média é: " +media);


        if (media >0 & media <7) {
            System.out.println("Você foi reprovade!");
        }
        else if (media >= 7 & media< 10) {
            System.out.println("Você foi aprovade!");
        }
        else if (media ==10){
            System.out.println("Você foi aprovade com Distinção. Parabéns!");
        }

    }
}
