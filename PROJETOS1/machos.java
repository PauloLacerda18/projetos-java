package PROJETOS1;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;




public class machos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int macho=10;



        System.out.println("MACHOS DA JULIANA");
        System.out.println("1.Pedro delamogli");
        System.out.println("2.Yuri");
        System.out.println("3.Peralta");
        System.out.println("4.Fabrício ");
        System.out.println("DIGITE '0' PARA ENCERRAR");



        while(macho !=0){

            System.out.println("ESCOLHA UM MACHO ENTRE 1 A 4 E SAIBA INFORMAÇÕES SOBRE O CARA>>");
            macho=entrada.nextInt();

        if(macho == 1){
            System.out.println("Pedro delamogli\n" +
                    "Merdas: não  tratou ela como uma prioridade, foi seco, me ignorava, apagou o story com ela, \n" +
                    "Beijo: 10/10\n" +
                    "Nivel de beleza: 07/10\n" +
                    "Nivel de proximidade: 05/10, nos tratamos como namorados mas não nos conhecemos direito \n" +
                    "Quantos dias pegou depois de conhecer: ficamos 1 vez só \n" +
                    "Quantos dias durou: tá durando ainda");

        }else if(macho == 2){
            System.out.println("Yuri\n" +
                    "Merdas: Tava sendo seco e demorado a responder \n" +
                    "Beijo: 100/10, sdds\n" +
                    "Nivel de beleza: 07/10\n" +
                    "Nivel de proximidade: 02/10\n" +
                    "Quantos dias pegou depois de conhecer: ficamos 1 vez só \n" +
                    "Quantos dias durou: 1 semana eu acho");
        }else if(macho==3){
            System.out.println("Peralta \n" +
                    "Merdas: por enquanto nenhuma\n" +
                    "Beijo: não sei ainda \n" +
                    "Nivel de beleza: 06/10\n" +
                    "Nivel de proximidade: 01/10\n" +
                    "Quantos dias pegou depois de conhecer: não ficamos ainda \n" +
                    "Quantos dias durou: 1 por enquanto");
        }else if (macho == 4){
            System.out.println("Fabrício \n" +
                    "Merdas: Me ignora, fala cmg ainda so pq quer me comer, é bipolar, é seco, é estranho, é instável.\n" +
                    "Beijo: nem sei se vou descobrir kkkk\n" +
                    "Nivel de beleza: 07/10\n" +
                    "Nivel de proximidade: 07/10\n" +
                    "Quantos dias pegou depois de conhecer: Nenhum \n" +
                    "Quantos dias durou: vai fazer 8 meses");

        }else if(macho == 0){
            System.out.println("ENCERRAMOS POR AQUI,LOGO LOGO NOVOS MACHOS NO CARDAPIO");
        }

    }





    }
}























