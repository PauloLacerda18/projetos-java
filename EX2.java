package EXERCICIOSDELPOO;

/* 
Faça um programa que recebe o valor do salário de um funcionário na  MAIN. Crie dois métodos, 
um chamado aumentarDezPorCento() e outro chamado  aumentarVintePorCento(). 
A impressão da variável salário será no método MAIN.
*/

import java.util.Scanner;
public class EX2 {
public static void main (String []args){

    Scanner input = new Scanner (System.in);

    double salario;
     
    
   

    System.out.println("digite seu salário");
    salario = input.nextDouble();

    System.out.println("escolha 1(para aumentar 10% salario)" + "\nescolha 2(para aumentar 20% do salario)");
    int opcao = input.nextInt();
    
    switch (opcao){
        case 1:
        aumentarDezPorCento(salario);
        break;
        case 2:
        aumentarVintePorCento(salario);
        break;
        default:
        System.out.println("escolha entre 1 ou 2");
    }
    
    

    


    
}



public static void aumentarDezPorCento(double salario){
    
    double aumentarDez;
    aumentarDez = salario * 10;

    System.out.println(aumentarDez);
    
    

}

   


public static void aumentarVintePorCento(double salario){
    double aumentarVinte;
    aumentarVinte = salario * 20;

    System.out.println(aumentarVinte);
}
   


}