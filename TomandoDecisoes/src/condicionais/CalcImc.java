package condicionais;

import java.util.Scanner;

public class CalcImc {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o seu peso? > ");
        double peso = ler.nextDouble();
        System.out.println("Qual a sua altura? > ");
        double altura = ler.nextDouble();
        double imc = peso / (altura * altura);
        if (imc <= 18.5) {
            System.out.println("Abaixo do peso.");
        } else if (imc < 25) {
            System.out.println("Peso ideal");
        } else if (imc < 30) {
            System.out.println("Levemente acima do peso");
        } else if (imc < 35) {
            System.out.println("Obesidade Grau I");
        } else if (imc < 40) {
            System.out.println("Obesidade Severa");
        } else {
            System.out.println("Obesidade Mórbida");
        }
    }
}