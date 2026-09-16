package repeticao;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
public class TabuadaLoop {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = ler.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (i*n));
        }
    }
        /* int i = 1; == início de contagem
           i <=5 == até que i seja igual ou menor que 5 == rodar o loop
           i++ == a cada volta, acrescentamos 1 à i

         */
}
