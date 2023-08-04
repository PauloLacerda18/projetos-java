package PROJETOS1;

import java.util.Scanner;

public class temperatura {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        int F;
        System.out.println("DIGITE O VALOR DO FAHRENHEIT >>");
        F=input.nextInt();
        System.out.println("SABENDO QUE O VALOR DE FAHREINHEIT VAI SER SUBTRAIDO POR 32");
        double b=32;
        System.out.println("E DEPOIS multiplicado por 5/9");
        int c = 5;
        final double d= 9.0;

        System.out.println("RESULTADO DA TEMPERATURA É C " + (F-b) * (c/d)  );
    }
}
