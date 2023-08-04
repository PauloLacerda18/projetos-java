package ARITIMETICOS;

public class STRING {
    public static void main (String[]args){

        String p = "vou ficar rico";
        System.out.println(p.concat("!!!"));
        System.out.println(p.charAt(4));
        System.out.println(p.startsWith("p"));
        System.out.println(p.toLowerCase()); //deixa as letras minusculas
        System.out.println(p.endsWith("o"));
        System.out.println(p.length());// saber quantos caracteres tem numa string
        System.out.println(p.equals(p));
        System.out.println(p.equalsIgnoreCase(p));
        System.out.println(p.formatted(p));
        System.out.println(p.replace("ficar" ,"!!!")); // substitui algum caracter
    }
}
