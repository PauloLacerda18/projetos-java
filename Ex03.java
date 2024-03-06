package EXERCICIOSDELPOO;
/* 
Faça um programa que recebe o nome e a idade de um Atleta na MAIN. Crie um método , 
um para verificar se ele é maior de idade(). A impressão é na MAIN.
*/
import java.util.Scanner;
public class Ex03 {
    
  public static void main(String[]args){
    Scanner input = new Scanner (System.in);

    System.out.println("DIGITE SUA IDADE:");
    int idade = input.nextInt();


    Maiordeidade(idade);

  } 
  
  public static void Maiordeidade(int idade){
    if (idade >= 18){
        System.out.println("é maior de idade");
    }else
    System.out.println("é menor de idade");
  }


}
