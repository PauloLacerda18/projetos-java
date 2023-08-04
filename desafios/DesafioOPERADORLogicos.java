package desafios;

//se os dois trabalhos derem certo voce compra uma televisao de 50 polegadas, se um só trabalho der
//certo, voce compra uma Tv de 32 polegadas e se comprar a de 50 ou 32 a familia toma sorvete no shopping;
//

//trabalho na terça(v ou f)
// trabalho na quinta(v ou f)



public class DesafioOPERADORLogicos {
    public static void main(String[] args) {

        boolean trabalhoTerca1  = true;
        boolean trabalhoQUINTA2  = false;
        boolean comproutv50p = trabalhoTerca1 && trabalhoQUINTA2;
        boolean comprouTV32p = trabalhoTerca1 ^ trabalhoQUINTA2;
        boolean sorvete = trabalhoTerca1 || trabalhoQUINTA2;

        System.out.println("comprou a tvde50?" + comproutv50p);
        System.out.println("comprou a tvde32?" + comprouTV32p);
        System.out.println("comprou o sorvete?" + sorvete);


    }
}
