//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class FundamentosJava {
    public static void main(String[] args) {
        // Declaração de Váriaveis
        String nome = "maria";
        int idade = 25;
        double altura = 1.65; // float
        boolean ehEstudante = true;

        // para ler o que é digitado
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome2 = ler.nextLine(); // lê a próxima linha em texto
        System.out.println("Digite sua idade: ");
        int idade2 = ler.nextInt(); // lê número inteiro
        }
    }
