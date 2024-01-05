//calcule a media das notas de uma turma, o usuario vai digitar uma nota valida de 
//0 a 10, quando o usuario digitar a nota valida, a nota tem que ser armazenada em uma
//varivel total e cada vez que uma nota for digitada ela deve ser armazenada nessa variavel
//somando as notas, e faça outra variavel para  aparecer quantas notas Validas foram digitadas
//quando o usario digitar menos 1 é pra ele sair do programa.

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner input =  new Scanner (System.in);

        String resultado =""; 
        int contador = 0;
        int total = 0 ;

        

       System.out.println("digite a nota(digite -1 para sair)");
       
       while (true){
        
            System.out.println("Nota:");
            total = input.nextInt() + total;  

            if (total == -1) {
                break;
            }
            if (total >= 0 && total <= 24) {
                contador++;
            }else {
                System.out.println("nota invalida, digite nota de zero a dez!");
            } 
            if (total == 20 ) {
                 System.out.println("digite 'ver' para visualizar a media");
                resultado = input.next();
            }if (resultado.equals("ver")) {
            System.out.println("a media:" + total);
            System.out.print("Foram digitadas: " + "" + contador + "" + " notas validas");
            break;
        }
            
          
                
        
    }
    
}
}