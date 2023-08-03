package desafios;
import javax.swing.*;
import java.util.Scanner;

public class DESAFIOCALCULADORA {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("DIGITE UM NUMERO");
        double num1 = input.nextDouble();
        System.out.println("DIGITE UM NUMERO");
        double num2 = input.nextDouble();
        System.out.println("DIGITE UMA OPERAÇAO '+' '-' '/' '*' ");
        String operacao = input.next();

        double resultado = "+".equals(operacao) ? num1 + num2 : 0;
               resultado = "-".equals(operacao) ? num1 - num2 : resultado;
               resultado = "*".equals(operacao) ? num1 * num2 : resultado;
               resultado = "/".equals(operacao) ? num1 / num2 : resultado;


        System.out.printf("o resultado é : %.0f %s %.0f = %.0f ".replace('.', ',') , num1, operacao ,num2, resultado);































































    }
}
