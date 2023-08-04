package fundamentos.operadores;

import javax.swing.*;
public class operadoresRelacionais {
    public static void main(String[] args) {

        String ola = JOptionPane.showInputDialog("digite uma valor inteiro e veja se é verdadeiro");
        int valor = 10;
        int inteiro = Integer.parseInt(ola);

        boolean verdade = inteiro >= valor;
        boolean falso = inteiro < valor;
        System.out.println(verdade);
        System.out.println(falso);


        /*
        int valordoido= 18;
        int valordasorte=17;
        System.out.println(valordoido == valordasorte);compração
        System.out.println(valordoido >= valordasorte);maior ou igual
        System.out.println(valordoido <= valordasorte);menor ou igual
        System.out.println(valordoido != valordasorte);diferente
        */


    }
}
