package desafios;

import java.util.Scanner;


// Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.

public class DESAFIOTEMPERATURAFparaCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite o valor de fahreinhet: ");
        int valor1= input.nextInt();
        System.out.printf("convertendo para celsius %.2f " , (valor1 - 32) / (1.8));

    }

}
