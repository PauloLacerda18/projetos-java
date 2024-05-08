import java.util.Scanner;

public class Casa extends Moradia {
    String escolhermoveis;
    public void quartos(Scanner quartos1){
        System.out.println("quantos quartos voce quer que tenha na casa?");
        quantidadedequartos = quartos1.nextInt();

    }

    public void banheiros(Scanner banheiro){
        System.out.println("quantos banheiros voce quer que tenha na casa?");
        quantidadedebanheiros = banheiro.nextInt();
    }

    public void localizacao(Scanner localizacao){
        System.out.println("em qual localização? fortaleza ou caucaia?");
        localizacaodesejada = localizacao.nextLine();  
        
    }
    
  

    public void  moveis(Scanner escolher){
        System.out.println("deseja que tenha moveis?");
        escolhermoveis = escolher.nextLine();

        if(escolhermoveis.equals("sim")){
            System.out.println("quais moveis?");
            quaismoveis = escolher.nextLine();
        }else{
            System.out.println("sem moveis!");
        }

        escolher.nextLine();
    }




    @Override 
     public String toString(){
        return "quantidade de quartos: " + quantidadedequartos + "\nquantidade de banheiros " + quantidadedebanheiros +
        "\nlocalização:" +localizacaodesejada + "\nos moveis são: " + quaismoveis;
    }


}
