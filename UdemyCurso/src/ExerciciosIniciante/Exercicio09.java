package ExerciciosIniciante;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número:");
        numero = ler.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " é um número Par");
        } else {
            System.out.println(numero + " é um número Impar");
        }
        ler.close();
    }
}
