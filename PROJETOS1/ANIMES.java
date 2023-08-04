package PROJETOS1;

import java.util.Scanner;

//programa que ler a sinopse de animes
public class ANIMES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int animes = 10;

        while (animes > 0) {
            System.out.println("\n\nEscolha o anime de sua preferencia e saiba a sinopse: ");
            System.out.println("1.Haijime no ippo");
            System.out.println("2.naruto");
            System.out.println("3.BAKI");
            System.out.print("APERTE 4 PARA ENCERRAR".toLowerCase());

            System.out.println("\nescolha um valor entre 1 a 3".toUpperCase());
            animes = sc.nextInt();

            if (animes == 1) {
                System.out.println("HAIJIME NO IPPO:".toLowerCase() +
                        " \nIppo Makunouchi é um garoto de 16 anos bastante tímido, trabalha com sua " +
                        "\nmãe que possui uma loja que " +
                        "\naluga barco para pescaria. Devido ao trabalho, ele nunca " +
                        "\npossui tempo livre para praticar esportes e fazer amigos. " +
                        "\nUm certo dia uns garotos de seu colégio o cercam no caminho de casa, e " +
                        "\ncomeçam a bater em Ippo, até que " +
                        "\naparece um famoso boxeador Mamoru " +
                        "\nTakamura, para salvá-lo. ");

            } else if (animes == 2) {
                System.out.println("\nnaruto : Naruto Uzumaki, um jovem ninja que constantemente procura por reconhecimento \ne sonha em se tornar Hokage, o ninja líder de sua vila. \nA história é dividida em duas partes, a primeira parte se passa nos anos da pré-adolescência de Naruto, \ne a segunda parte se passa em sua adolescência. ");

            } else if (animes == 3) {
                System.out.println("BAKI : A série conta a saga do jovem Baki Hanma que ambiciona ser mais forte que seu pai. \n O grande problema é que seu pai, Yujiro Hanma, é o ser vivo \n mais forte do planeta. Para tal enfrenta os treinos mais duros que existem, para além de enfrentar todo o tipo de \nadversários em que cada um deles tem um estilo de luta muito peculiar.");
            } else if (animes == 4){
                System.out.println("programa encerrado".toUpperCase());
               return;
            }

        }




        }

    public static class Aps {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int escolha = 10;
            String[] produtos = new String[6];
            double total = 0;
            int quant;
            int escolhaPag;
            int quantParc = 10;
            double pixe = 0.1;



            produtos[0] = "1. Sabonete ---- R$ 2,00";
            produtos[1] = "2. Shampoo ---- R$ 10,00";
            produtos[2] = "3. Limpol ---- R$ 7,00";
            produtos[3] = "4. Óleo ---- R$ 7,00";
            produtos[4] = "5. Pão ---- R$ 6,50";
            produtos[5] = "aperte 0 para encerrar o pedido ";


            System.out.println("Escolha os produtos que deseja de 1 a 5");

            while (escolha != 0) {
                for (int i = 0; i < produtos.length; i++) {
                    System.out.println(produtos[i]);
                }
                System.out.printf(">> ");
                escolha = sc.nextInt();

                switch (escolha) {
                    case 0:
                        break;
                    case 1:
                        System.out.printf("Digite a quantidade de Sabonete");
                        quant = sc.nextInt();
                        total = total + (2 * quant);
                        break;
                    case 2:
                        System.out.printf("Digite a quantidade de Shampoo: ");
                        quant = sc.nextInt();
                        total = total + (10 * quant);
                        break;
                    case 3:
                        System.out.printf("Digite a quantidade de Limpol: ");
                        quant = sc.nextInt();
                        total = total + (7 * quant);
                        break;
                    case 4:
                        System.out.printf("Digite a quantidade de Óleo: ");
                        quant = sc.nextInt();
                        total = total + (7 * quant);
                        break;
                    case 5:
                        System.out.printf("Digite a quantidade de Pão: ");
                        quant = sc.nextInt();
                        total = total + (6.50 * quant);
                        break;
                    default:
                        System.out.println("Digite uma opção válida!");
                        break;
                }
                System.out.println();
                System.out.println("Total: R$ " + total);
                System.out.println();
            }

            if (total <= 200 ) {
                System.out.println("Compra: R$ " + total);
                total = total + 10;
                System.out.println("+ R$ 10,00");
                System.out.println("Total da compra: R$ " + total);
                System.out.println();
            } else {
                System.out.println("Compra: R$ " + total);
                System.out.println("Frete: Grátis");
                System.out.println("Total da compra: R$ " + total);
                System.out.println();
            }

            System.out.println("Forma de pagamento: ");
            System.out.println("1. Cartão");
            System.out.println("2. PIX");
            System.out.println("3. Boleto");
            System.out.printf(">>");
            escolhaPag = sc.nextInt();

            switch (escolhaPag) {
                case 1:
                    while (quantParc > 4 || quantParc < 1) {
                        System.out.println("Digite a quantidade de parcelas(Máximo: 4)");
                        System.out.printf(">> ");
                        quantParc = sc.nextInt();
                    }
                    if (quantParc > 1) {
                        total = total + (total * 0.025);
                    }
                    total = total / quantParc;
                    System.out.println("=============== CUPOM FISCAL ================");
                    System.out.printf("Total: (%dx) R$ %.2f\n", quantParc, total);
                    System.out.println("Pagamento realizado com sucesso!");
                    System.out.println("================================================");
                    break;

                case 2:
                    total = total-(total*0.1);




                    System.out.println("=============== CUPOM FISCAL ================");
                    System.out.printf("Total:  R$ %.2f\n",total);
                    System.out.println("Pagamento realizado com sucesso!");
                    System.out.println("================================================");
                    break;

                case 3 :
                    total= total-(total*0.05);
                    System.out.println("=============== CUPOM FISCAL ================");
                    System.out.printf("Total:  R$ %.2f\n",total);
                    System.out.println("Pagamento realizado com sucesso!");
                    System.out.println("================================================");
                    break;


                }

            }
        }
}

