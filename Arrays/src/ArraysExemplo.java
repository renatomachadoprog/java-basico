import java.util.Scanner;
public class ArraysExemplo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        // Declara um vetor de numeros inteiros com espaço pra 5 numeros
        int[] numeros = new int[5];


        int[] listade5 = new int[5];

        for (int i = 0; i <5 ; i++){
            System.out.print("Digite um número inteiro ");
            listade5[i] = ler.nextInt();
        } for(int i = 0;i <5; i++){
            System.out.print(listade5[i]+" ");
        }
    }
}