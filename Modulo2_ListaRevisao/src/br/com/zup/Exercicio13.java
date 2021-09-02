package br.com.zup;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
/*
Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca
do estado de São Paulo (50 quilos) deve pagar uma multa de R$4,00 por quilo excedente.
João precisa que você faça um programa que leia a variável peso (peso de peixes)
e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite
e na variável multa o valor da multa que João deverá pagar.
Imprima os dados do programa com as mensagens adequadas.
 */
//        Instanciando Scanner
        Scanner leitor = new Scanner (System.in);

//        Declarando variáveis
        double pesoPeixe, kgExcedente, precoMulta;

        System.out.println("Olá! Informe quantos kg tem o peixe: ");
        pesoPeixe = leitor.nextDouble();

        if (pesoPeixe > 50){
            kgExcedente = pesoPeixe - 50;
            precoMulta = kgExcedente *4;
            System.out.println("O regulamento de pesca permite pescar peixes de até 50kg.");
            System.out.println("O peixe informado tem: " +pesoPeixe);
            System.out.println("Portanto, excede: " +kgExcedente);
            System.out.printf("A multa é de R$4,00/kg excedente, totalizando R$ %.2f", precoMulta);
        }
        else {
            System.out.println("O peixe atende ao regulamento de pesca.");
        }

    }
}
