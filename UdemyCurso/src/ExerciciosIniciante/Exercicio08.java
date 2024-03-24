package ExerciciosIniciante;

import java.util.Scanner;

/*Fazer um programa para ler um número inteiro, e depois dizer se este número
é negativo ou não.*/
public class Exercicio08 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número:");
        numero = ler.nextInt();

        if (numero > 0) {
            System.out.println(numero + " é um número Positivo");
        } else {
            System.out.println(numero + " é um número Negativo");
        }
        ler.close();
    }
}
