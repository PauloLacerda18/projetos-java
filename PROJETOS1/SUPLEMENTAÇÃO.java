package PROJETOS1;

import java.util.Scanner;


public class SUPLEMENTAÇÃO {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String sp1,sp2,sp3,sp4;

        System.out.print("SUPLEMENTAÇAO:");
        System.out.print("\n1.whey" + "\n2.hipercalorico" + "\n3.creatina"+"\n4.preteino");





        System.out.println("\n\nADIOCIONE O VALOR DO SUPLEMENTO:");
        sp1 = inp.nextLine().replace(",",".");
        System.out.println("ADIOCIONE O VALOR DO SUPLEMENTO:");
        sp2 = inp.nextLine().replace(",",".");
        System.out.println("ADIOCIONE O VALOR DO SUPLEMENTO:");
        sp3 = inp.nextLine().replace(",",".");
        System.out.println("ADIOCIONE O VALOR DO SUPLEMENTO:");
        sp4 = inp.nextLine().replace(",",".");

        double suplemento1= Double.parseDouble(sp1);
        double suplemento2= Double.parseDouble(sp2);
        double suplemento3= Double.parseDouble(sp3);
        double suplemento4= Double.parseDouble(sp4);


        double soma = suplemento1+suplemento2+suplemento3+suplemento4;

        System.out.println("o valor total dos produtos é:".toUpperCase() + soma);







    }

}
