package condicionais;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class CalculoMedia {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a nota 1: ");
        double nota1 = ler.nextDouble();
        System.out.println("Digite a nota 2: ");
        double nota2 = ler.nextDouble();
        System.out.println("Digite a nota 3: ");
        double nota3 = ler.nextDouble();
        System.out.println("Digite a nota 4: ");
        double nota4 = ler.nextDouble();

        double media = (nota1+nota2+nota3+nota4)/4;

        System.out.println("A média das notas é: "+ media);
        if (media >= 7){
            System.out.println("Aprovado!");
        } else if (media >= 5){
            System.out.print("Recuperação");
        } else {
            System.out.print("reprovado");
        }

        }
    }
