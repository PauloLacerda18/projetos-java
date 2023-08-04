package fundamentos.operadores;
import java.util.Scanner;
public class Operadoresternario {
    public static void main(String[]args){
        /*
        double media=4;
        String recuperacao = media >= 5.0 ? "em recuperação": "reprovado";
        String resultado =  media >=7.0 ? "aprovado" : "recuperação";
        System.out.println("o aluno esta " + resultado);
        */
        Scanner input = new Scanner(System.in);
        double credito;

        System.out.println("DIGITE O VALOR DO CARTAO ENTRE 100 A 1000");
        credito = input.nextDouble();

        String desconto = credito >= 500 ? "tem desconto" : "não tem desconto";

        System.out.println("o valor " + desconto);




    }
}
