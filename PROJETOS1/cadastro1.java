package PROJETOS1;

import java.net.StandardSocketOptions;
import java.util.Scanner;

public class cadastro1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;
        int senha;

        System.out.print("DIGITE SEU NOME:");
        nome = input.nextLine();


        System.out.print("digite a senha(8 digitos) : ".toUpperCase() );
        senha = input.nextInt();

        System.out.printf("nome : %s" + "\nsenha: "+senha, nome);
    }


}
