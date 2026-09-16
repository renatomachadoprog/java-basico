package repeticao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero = 0;
        double soma = 0;
        double maior = Integer.MIN_VALUE;
        for (int i = 1; i <= 5; i++) {
            System.out.printf("digite o %dº Número: ", i);
            try {
                numero = ler.nextInt();
        } catch (InputMismatchException e){
                System.out.println("Entrada inválida");
                ler.next();
            }
                soma = soma + numero;
            if (numero > maior) {
                maior = numero;
            }
        }
        double media = soma/ 5;
        System.out.println("o maior número entre os 5 é: "+ maior);
        System.out.println("a média dos 5 números é: "+ media);

    }
}