package desafios;
// Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.


import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("SISTEMA DE IMC");
        System.out.println(">>>>>>>>>>>>>>>");

        System.out.println("DIGITE O PESO:");
        double peso = input.nextDouble();
        System.out.println(">>>>>>>>>>>>>>>");

        System.out.println("DIGITE A ALTURA:");
        double altura = input.nextDouble();

        double elevado = Math.pow(altura,2);

        System.out.println(">>>>>>>>>>>>>>>");
        System.out.printf("RESULTADO DO IMC : %.2f", peso/elevado);




    }

}
