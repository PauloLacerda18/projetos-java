package fundamentos.operadores;

import java.util.Scanner;

public class tipostringequals {
    public static void main (String[]args){
        System.out.println("2" == "2"); // nao é correto

        String s1 = new String("2");
        System.out.println("2" == s1); // da falso pois elas não sao iguais embora o conteudo seja verdadeiro
        System.out.println("2".equals(s1)); // da verdadeiro pois o comado  .equals ele vai comparar os conteudos e não vai entrar em uma questao interna  a linguagem



        Scanner  entrada = new Scanner(System.in);
        String s2 =  entrada.next();//tira os espaços em branco e o nextline nao tira
        System.out.println("2" == s2.trim());
        System.out.println("2".equals(s2.trim())); // .trim tira os espaços em brancos

        entrada.close();






    }
}
