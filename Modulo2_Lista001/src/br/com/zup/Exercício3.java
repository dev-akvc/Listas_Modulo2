package br.com.zup;

import java.util.Scanner;

public class Exercício3 {
    public static void main(String[] args) {
//        Faça um programa que converta metros para centímetros.
        Scanner leitor = new Scanner(System.in);

//        Declarando as variáveis
        double valorEmMetros;
        double valorEmCentimetros;

//        Receber valor das variáveis
        System.out.println("Olá! Vamos converter o número de metros para centímetros. ");
        System.out.println("Por favor, informe os metros: ");
        valorEmMetros = leitor.nextDouble();

//        Conversão para cm
        valorEmCentimetros = valorEmMetros *100;
        System.out.println(valorEmMetros+ "m equivale a " +valorEmCentimetros+ "cm.");
    }
}
