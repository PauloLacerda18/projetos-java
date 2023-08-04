package ARITIMETICOS;

import java.util.Scanner;

public class SCANNER_SYSTENS {
    public static void main(String[] args) {
        //*
        System.out.print("vou");//faz com que os caracteres fique em uma mesma linha EX:
        System.out.print(" ser");
        System.out.print(" rico");


        System.out.println();//nao junta os caracteres de linhas puladas, so os que ja estao defenidas no codigo ai.


        System.out.printf( "vou ter : %d na conta do Banco. %n", 10000 );// o %d coloca valores inteiros escolhido.
        System.out.printf("Salario: %.2f%n", 1234.5670);// o %f faz com que vc escolha quantas casas decimais quer que seja amostrada.
        System.out.printf(" nome: %s%n", "paulo");// %S mostra uma string.


        //COMO USAR O SCANNER E OS SYSTENS>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        Scanner sc = new Scanner(System.in);//entrada do sistema

        System.out.print("Digite o seu nome:");
        String nome = sc.nextLine();

        System.out.print("digite seu sobrenome:");
        String sobrenome = sc.nextLine();

        System.out.print("digite sua idade:");
        int idade = sc.nextInt();


        System.out.printf("%s %s tem %d anos", nome,sobrenome,idade);
        sc.close();//fecha o scanner pra economizar memoria



    }

}

