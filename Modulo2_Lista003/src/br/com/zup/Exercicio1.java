package br.com.zup;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double qtdHorasTrabalhadas;
        double remuneracaoPorHora;
        double salarioBruto;
        double descontoIRRF;
        double descontoINSS;
        double percentualFGTS;


//        Recebendo valor das variáveis
        System.out.println("Olá! Vamos calcular seu salário mensal.");
        System.out.println("Por favor, informe a quantidade de horas trabalhadas: ");
        qtdHorasTrabalhadas = leitor.nextDouble();
        System.out.println("Informe também a remuneração por hora: ");
        remuneracaoPorHora = leitor.nextDouble();
        salarioBruto = qtdHorasTrabalhadas * remuneracaoPorHora;


//        Cálculo dos descontos

        if (salarioBruto>0 & salarioBruto<=900){
            descontoIRRF = 0;
        }
        else if (salarioBruto>900 & salarioBruto<=1500){
            descontoIRRF = salarioBruto*0.05;
        }
        else if (salarioBruto>1500 & salarioBruto<=2500){
            descontoIRRF = salarioBruto*0.1;
        }
        else if (salarioBruto>2500){
            descontoIRRF = salarioBruto*0.2;
        }
        else {
            System.out.println("Por favor, digite um salário válido.");
            return;
        }

        descontoINSS = salarioBruto * 0.1;
        percentualFGTS = salarioBruto * 0.11;
//        System.out.println(percentualFGTS);

        System.out.printf("'%-10s' /t/t/t %n", "Salário Bruto: ( %d%n", remuneracaoPorHora);
//                ("Salário Bruto: ("+ remuneracaoPorHora+ "*" +qtdHorasTrabalhadas + ")\nR$ "+ salarioBruto);


//        System.out.println("Portanto, o salário líquido é R$ " + (salarioBruto - descontoIRRF - descontoINSS));
    }
}
