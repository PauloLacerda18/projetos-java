package PROJETOS1;

import java.util.Scanner;

//SISTEMA DE ECONOMIZAR MENSAL
public class ECONIMIZAR {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int escolha = 10;

    System.out.print("DIGITE A META DE VALOR QUE DESEJA ECOMIZAR: R$ ");
    int valorEconomico = entrada.nextInt();

    System.out.println("O VALOR DESEJADO É: " + valorEconomico);

    System.out.print("DEPOSITE UM VALOR ENTRE 100 A 1000" + "\nR$:");
    int DEPOSITO = entrada.nextInt();




    if(DEPOSITO >= 100){
        System.out.println("deposito concluido".toUpperCase());
    } if (DEPOSITO < 100){
        System.out.print("DESEJA CONCLUIR O DEPOSITO? (1)'SIM' ou (2) 'NAO'".toLowerCase() + "\n=");
        escolha = entrada.nextInt();
    }if( escolha == 1){
      System.out.print("deposito concluido".toUpperCase());
    }else if ( escolha == 2){
            System.out.print("DEPOSITE UM VALOR ENTRE 100 A 1000" + "\nR$:");
             DEPOSITO = entrada.nextInt();
            System.out.println("deposito concluido".toUpperCase());
    }



    }
}
