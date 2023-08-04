package ARITIMETICOS;

import javax.swing.*;

public class ConversaodeStringParaNumero {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("digite um numero:");// abre uma janelinha legal
        String valor2 = JOptionPane.showInputDialog("digite o segundo numero:");

        System.out.println(valor1 + valor2);

        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);

        double soma = numero1 + numero2;
        System.out.printf("soma = " + soma);

    }
}
