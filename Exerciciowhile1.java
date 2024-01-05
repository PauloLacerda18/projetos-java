
//peça para o usuario digitar no console alguma coisa e o codigo so vai parar
//quando for digitado a palavra 'sair'

import java.util.Scanner;

public class Exerciciowhile1 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String qualquercoisa ="";

        while(!qualquercoisa.equalsIgnoreCase("0")){
            System.out.println("digite alguma coisa");
            qualquercoisa = input.nextLine();
        }
    }
}
        

