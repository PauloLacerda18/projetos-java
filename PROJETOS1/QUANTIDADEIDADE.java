package PROJETOS1;

import java.util.Scanner;

public class QUANTIDADEIDADE {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);

          String nome;

          int i;


        //PROGRAMA QUE LER A IDADE DE TRES PESSOAS E DETERMINA QUAL A MAIS VELHA
        System.out.println("DIGITE o PRIMEIRO NOME: ");
        nome=input.next();
        System.out.println("DIGITE A IDADE");
        i=input.nextInt();

        System.out.println("NOME: " + nome +
                        " idade:" + i);


    System.out.println();
    System.out.println("DIGITE O SEGUNDO NOME");
    nome = input.next();
    System.out.println("DIGITE A IDADE");
    i=input.nextInt();
    System.out.println();
    System.out.println("NOME: "+ nome + " Idade: " + i );


    if(i > 10 ){
        System.out.println("ELE É MAIS VELHO: "+ nome );
    }else if(i<5){
        System.out.println("ELE É O MAIS NOVO: "+nome);
    }

    }

}
