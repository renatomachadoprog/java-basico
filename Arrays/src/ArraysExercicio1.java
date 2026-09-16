import java.util.Scanner;

public class ArraysExercicio1 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int[] array = new int[5];
        int soma = 0;
        double media = 0;
        int contador = 0;
        for (int i = 0; i < 5; i++){
            System.out.println("Insira o "+(i+1)+"° número. ");
            array[i] = ler.nextInt();
            soma = soma + array[i];
            
        } media = soma / 5;
        System.out.println(" a média da array é: "+ media);
        for(int i = 0; i < 5; i++){
            if (array[i]>media){
                contador++;
            }
        } System.out.print("quantidade de itens maiores que a média> "+ contador);
    }
}
