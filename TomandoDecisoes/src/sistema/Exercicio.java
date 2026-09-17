package sistema;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio {
    public static void main(String [] args){
        Scanner ler = new Scanner(System.in);
        int escolha = -1;
        double valorVenda = 0;
        int quantidadeVendas = 0;
        double porcentagemDesconto = 0;
        double valorFinal = 0;
        double mediaVendas;
        double maiorVenda = Integer.MIN_VALUE;

        while(escolha !=0){
            System.out.println("MENU DE OPÇÕES");
            System.out.println("1 - Abrir uma Venda");
            System.out.println("2 - Relatório de Vendas");
            System.out.println("0 - Sair");
            try {
                escolha = ler.nextInt();
            } catch(InputMismatchException e){
                System.out.println("Erro: Você digitou um valor inválido.");
                ler.nextLine();
                escolha = -1;
            }
            switch(escolha){
                case 1 -> {
                    boolean valorvalido = false;
                    while (!valorvalido) {
                        try {
                        System.out.println("insira o valor da venda: ");
                            valorVenda = ler.nextDouble();
                            valorvalido = true;
                        } catch (InputMismatchException e) {
                            System.out.println("Erro: Você digitou um valor inválido.");
                            ler.nextLine();
                        }
                    }
                    boolean descontovalido = false;
                    while(!descontovalido) {
                        try {
                        System.out.println("insira a porcentagem de desconto: ");
                            porcentagemDesconto = ler.nextDouble() / 100;
                            descontovalido=true;
                        } catch (InputMismatchException e) {
                            System.out.println("Erro: Você digitou um valor inválido.");
                            ler.nextLine();
                        }
                    }
                    valorVenda = valorVenda - (valorVenda*porcentagemDesconto);
                    System.out.println("Valor da venda: "+ valorVenda);
                    quantidadeVendas++;
                    valorFinal = valorFinal+valorVenda;
                    if(valorVenda > maiorVenda){
                        maiorVenda = valorVenda;
                    }
                    System.out.println(quantidadeVendas);
                    System.out.printf("%.2f%n", valorFinal);
                }
                case 2 -> {
                    if(quantidadeVendas==0){
                        System.out.println("Nenhuma venda registrada até o momento");
                    } else {
                        mediaVendas = valorFinal / quantidadeVendas;
                        System.out.printf("Total acumulado em vendas: R$%.2f%n", valorFinal);
                        System.out.printf("Quantidade de vendas realizadas: %d%n", quantidadeVendas);
                        System.out.printf("Média do valor das vendas: %.2f%n", mediaVendas);
                        System.out.printf("Maior venda individual: %.2f%n", maiorVenda);
                    }
                }
                default -> System.out.println("Entrada inválida, tente novamente.");
            }
        } System.out.println("Sistema encerrado.");


    }
}
