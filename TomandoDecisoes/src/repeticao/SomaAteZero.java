package repeticao;

import java.util.Scanner;
public class SomaAteZero {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int numero = -1;
        int somaat0 = 0;
        while (numero != 0) {

            System.out.print("Insira um número inteiro: ");
            numero = ler.nextInt();
            if (numero !=0) {
                somaat0 = somaat0 + numero;
            } else {
                somaat0 = somaat0;
            }
        }
        System.out.println(somaat0);
        }
    }

