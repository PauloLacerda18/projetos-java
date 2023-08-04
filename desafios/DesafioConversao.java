package desafios;

import java.util.Scanner;


//desafio conversao .. usar scanner ..pegar 3 string(nextline)
//o funcionario pode separar as classes decimais com virgula e ponto, soma os 3 salarios e divide por 3
//converter o string para numerico

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s1,s2,s3;

        System.out.println("DIGITE O PRIMEIRO SALARIO: ");
        s1 = input.nextLine().replace(",",".");

        System.out.println("DIGITE O SEGUNDO SALARIO: ");
        s2 = input.nextLine().replace(",",".");

        System.out.println("DIGITE O TERCEIRO SALARIO: ");
        s3 = input.nextLine().replace(",",".");//substitui qualquer virgula pelo ponto


        double v1 = Double.parseDouble(s1);
        double v2 = Double.parseDouble(s2);
        double v3 = Double.parseDouble(s3);

        double soma = v1 + v2 + v3;


        System.out.println("a soma dos salarios: "+soma);
        System.out.println("A media:" + soma/3);



























    }
}
