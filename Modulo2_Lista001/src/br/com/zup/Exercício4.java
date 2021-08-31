package br.com.zup;

import java.util.Scanner;

public class Exercício4 {
    public static void main(String[] args) {
//        Faça um Programa que recebe o quanto você ganha por hora e o número de
//        horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

//        Declarando variáveis
        Scanner leitor = new Scanner(System.in);
        double qtdHorasTrabalhadas;
        double remuneracaoPorHora;

//        Recebendo valor das variáveis
        System.out.println("Olá! Vamos calcular seu salário mensal.");
        System.out.println("Por favor, informe a quantidade de horas trabalhadas: ");
        qtdHorasTrabalhadas = leitor.nextDouble();
        System.out.println("Informe também a remuneração por hora: ");
        remuneracaoPorHora = leitor.nextDouble();
        System.out.println("Seu salário mensal é R$ " +qtdHorasTrabalhadas*remuneracaoPorHora);

    }
}
