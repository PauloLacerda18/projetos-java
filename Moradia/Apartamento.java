import java.util.Scanner;

public class Apartamento extends Moradia{
    String escolhermoveis;
    public void quartos(Scanner quartos1){
        System.out.println("quantos quartos voce quer que tenha na casa?");
        quantidadedequartos = quartos1.nextInt();

    }

    public void banheiros(Scanner banheiro){
        System.out.println("quantos banheiros voce quer que tenha na casa?");
        quantidadedebanheiros = banheiro.nextInt();
        banheiro.nextLine();
    }

    public void localização(Scanner localizaação){
        System.out.println("em qual localização? fortaleza ou caucaia?");
        localizaçãodesejada = localizaação.nextLine();
    }
    
    
    public void  moveis( Scanner escolher){
        System.out.println("deseja que tenha moveis?");
        quaismoveis = escolher.nextLine();

        if(quaismoveis.equals("sim")){
            System.out.println("quais moveis?");
            quaismoveis = escolher.nextLine();
        }else{
            System.out.println();
        }
    }




    @Override 
     public String toString(){
        return "quantidade de quartos:" + quantidadedequartos + "quantidade de banheiros" + quantidadedebanheiros +
        "\n localização:" + localizaçãodesejada + "os moveis são:" + quaismoveis;
    }

}