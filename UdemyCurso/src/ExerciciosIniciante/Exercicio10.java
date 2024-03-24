package ExerciciosIniciante;

import java.util.Scanner;

/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem 
"Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são 
múltiplos entre si.*/

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int A, B;

        System.out.println("Digite um número:");
        A = ler.nextInt();
        B = ler.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.printf("%d %d são multiplos \n", A, B);
        } else {
            System.out.printf("%d %d não são multiplos \n", A, B);
        }
        ler.close();
    }
}
