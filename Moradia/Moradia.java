//Moradia - classe pai ABSTRATA

//Um  sistema onde  os usuarios podem indicar suas preferencias
//entre o tipo de imovel,casa ou ap,localização desejada, numero de  quartos,
//numero de banheiros  e se quer um espaço medio pequeno ou grande


public abstract class Moradia{
    //atributos
    public int quantidadedequartos;
    public int quantidadedebanheiros;
    public String quaismoveis;
    public String localizacaodesejada;
  
    //construtor
     public Moradia(){
        this.localizacaodesejada = localizacaodesejada;
        this.quaismoveis = quaismoveis;
        this.quantidadedebanheiros = quantidadedebanheiros;
        this.quantidadedequartos = quantidadedebanheiros;
    }
    
    public int getQuantidadedequartos() {
        return quantidadedequartos;
    }

    public void setQuantidadedequartos(int quantidadedequartos) {
        this.quantidadedequartos = quantidadedequartos;
    }

    public int getQuantidadedebanheiros() {
        return quantidadedebanheiros;
    }

    public void setQuantidadedebanheiros(int quantidadedebanheiros) {
        this.quantidadedebanheiros = quantidadedebanheiros;
    }

    public String getQuaismoveis() {
        return quaismoveis;
    }

    public void setQuaismoveis(String quaismoveis) {
        this.quaismoveis = quaismoveis;
    }

    public String getlocalizacaodesejada() {
        return localizacaodesejada;
    }

    public void setlocalizacaodesejada(String localizacaodesejada) {
        this.localizacaodesejada = localizacaodesejada;
    }

   

    
    
   






















   
}

