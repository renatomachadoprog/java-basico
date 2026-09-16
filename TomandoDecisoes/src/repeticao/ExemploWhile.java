package repeticao;

import java.util.Scanner;
public class ExemploWhile {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("Menu de Opções:");
            System.out.println("1 -- Saldo Atual");
            System.out.println("2 -- Depósito");
            System.out.println("0 -- Sair");
            System.out.print("Insira a opção desejada: ");
            opcao = ler.nextInt();
            if (opcao == 1) {
                System.out.println("Saldo atual: R$0,67");
            } else if (opcao == 2) {
                System.out.println("Deposito Realizado com Sucesso");
            } else if (opcao != 0) {
                System.out.println("opção inválida.");
            }
        }
        System.out.print("Saiu do Prog");
    }
}