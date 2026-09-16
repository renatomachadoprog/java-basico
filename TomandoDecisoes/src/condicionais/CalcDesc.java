package condicionais;

import java.util.Scanner;
public class CalcDesc {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("insira aqui o preço do produto > ");
        double preco = ler.nextDouble();
        System.out.println("insira aqui a porcentagem de desconto > ");
        double porcentagem= ler.nextDouble();
        double desconto = porcentagem / 100;

        double precofinal = preco - (preco*desconto);

        System.out.printf("o Valor do produto com desconto é R$%.2f", precofinal );
    }
}
