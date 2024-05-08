import java.util.Scanner;
public class MainMoradia {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    
        Casa minhaCasa = new Casa();
        minhaCasa.quartos(ler);
        minhaCasa.banheiros(ler);
        minhaCasa.localizacao(ler);
        minhaCasa.moveis(ler);   

        System.out.println(minhaCasa);
    
        ler.close();
    }
    
}
