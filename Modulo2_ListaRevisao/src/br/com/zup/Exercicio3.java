package br.com.zup;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
/*
Desenvolva um gerador de tabuada, capaz de gerar a tabuada
de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual
número ele deseja ver a tabuada.
 */
//        Instanciando Scanner
        Scanner leitor = new Scanner(System.in);

//        Declarando variáveis
        int numeroDaTabuada, tabuada;

        System.out.println("Olá! Quer a tabuada de qual número?");
        numeroDaTabuada = leitor.nextInt();

        for (int i = 0; i <= 10; i++) {
            tabuada = numeroDaTabuada * i;
            System.out.println(numeroDaTabuada+ " x " +i+ " = " +tabuada);
        }

    }
}
