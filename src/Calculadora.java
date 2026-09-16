//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner; // import == busca uma ferramenta que existe no java, mas não vem por padrão
public class Calculadora {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); // Scanner é uma ferramenta/instrução para ler dados do teclado

        System.out.println("Calculadora!");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção");

        int opcao = ler.nextInt(); // 'int opcao' declara uma variavel do tipo inteiro, que armazena a escolha

        System.out.print("Você escolheu a opção: "+ opcao);

    }
    }
