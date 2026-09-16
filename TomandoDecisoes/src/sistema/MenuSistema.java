package sistema;

import java.util.Scanner;
public class MenuSistema {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int opcao = -1;
        boolean b = true;

        while (b){
            System.out.println("menu de opções");
            System.out.println("1 - cadastrar");
            System.out.println("2 - listar");
            System.out.println("0 - sair ");
            opcao = ler.nextInt();
            switch (opcao){
                case 1 ->
                    System.out.println("Tela de cadastro");
                case 2 -> System.out.println("Tela de listagem");
                case 0 -> {
                    System.out.println("Saindo do Sistema...");
                    b = false;
                } default -> System.out.println("Entrada inválida");
            }
        }
    }
}
