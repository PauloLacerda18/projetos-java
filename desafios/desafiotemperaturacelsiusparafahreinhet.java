package desafios;

import java.util.Scanner;

public class desafiotemperaturacelsiusparafahreinhet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("DIGITE O VALOR DE CELSIUS");
        double valor1 = input.nextDouble();
        System.out.printf("VALOR DE CELSIUS CONVERTINDO EM FARHEIT :  %.1f", (valor1 * 9/5) + 32);
    }
}
