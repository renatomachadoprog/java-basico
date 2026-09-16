package repeticao;

import java.util.Scanner;
public class SomaAcumulada {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um número inteiro > ");
        int numero = ler.nextInt();
        int soma = 0;
        for (int i = 0;  i <= numero; i++ ){
            soma = soma + i;
            System.out.println(soma);
        }

    }
}
