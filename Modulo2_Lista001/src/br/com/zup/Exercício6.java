package br.com.zup;

import java.util.Scanner;

public class Exercício6 {
    public static void main(String[] args) {
//        Faça um Programa que receba o quanto você ganha por hora e o número de
//        horas trabalhadas no mês.

        Scanner leitor = new Scanner(System.in);
        double qtdHorasTrabalhadas;
        double remuneracaoPorHora;
        double salarioBruto;

//        Recebendo valor das variáveis
        System.out.println("Olá! Vamos calcular seu salário mensal.");
        System.out.println("Por favor, informe a quantidade de horas trabalhadas: ");
        qtdHorasTrabalhadas = leitor.nextDouble();
        System.out.println("Informe também a remuneração por hora: ");
        remuneracaoPorHora = leitor.nextDouble();
        salarioBruto = qtdHorasTrabalhadas*remuneracaoPorHora;
        System.out.println("Seu salário bruto mensal é R$ " +salarioBruto);

//        Cálculo dos descontos
        double descontoIRRF = salarioBruto*0.11;
        System.out.println("O desconto referente a IRRF é de R$ " + descontoIRRF);

        double descontoINSS = salarioBruto*0.08;
        System.out.println("O desconto referente a INSS é de R$ " + descontoINSS);

        double descontoSindicato = salarioBruto*0.05;
        System.out.println("E o desconto referente a Sindicato é de R$ " + descontoSindicato);

        System.out.println("Portanto, o salário líquido é R$ " +(salarioBruto-descontoIRRF-descontoINSS-descontoSindicato));
    }
}
