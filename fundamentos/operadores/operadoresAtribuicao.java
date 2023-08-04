package fundamentos.operadores;

public class operadoresAtribuicao {
    public static void main (String[]args){

        int a = 4;
        int b = 3;
        int c = a+b;

        c+=b;
        c-=a;
        c*=a;
        c/=b;
        System.out.println(c);
        c%=2;
        System.out.println(c);




    }
}
