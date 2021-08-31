package br.com.zup;

import java.util.Scanner;

public class Exercício5 {
    public static void main(String[] args) {
//        Faça um programa que peça a temperatura em graus Fahrenheit, transforme e
//        mostre a temperatura em graus Celsius.

//        Declarar variáveis
        Scanner leitor = new Scanner(System.in);
        double tempEmCelsius;
        double tempEmFahrenheit;

//        (0 °C × 9/5) + 32 = 32 °F
//       Recebendo valor das variáveis
        System.out.println("Olá! Vamos converter a temperatura de ºC para ºF.");
        System.out.print("Por favor, informe a temperatura em ºC: ");
        tempEmCelsius = leitor.nextDouble();

//        Resultado da conversão
        tempEmFahrenheit = (tempEmCelsius*9/5)+32;
        System.out.println(tempEmCelsius+ "ºC equivale a " +tempEmFahrenheit+ "ºF");
    }
}
