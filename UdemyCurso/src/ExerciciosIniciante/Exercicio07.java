package ExerciciosIniciante;

import java.util.Scanner;

/**/
public class Exercicio07 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double A, B, C, pi = 3.14159;
        double triangulo, trapezio, quadrado, circulo, retangulo;

        System.out.println("Digite 3 valores:");
        A = ler.nextDouble();
        B = ler.nextDouble();
        C = ler.nextDouble();

        triangulo = A * C / 2.0;
        circulo = pi * C * C;
        trapezio = (A + B) / 2.0 * C;
        quadrado = B * B;
        retangulo = A * B;

        System.out.printf("Triângulo: %.3f %n", triangulo);
        System.out.printf("Círculo: %.3f %n", circulo);
        System.out.printf("Trapézio: %.3f %n", trapezio);
        System.out.printf("Quadrado: %.3f %n", quadrado);
        System.out.printf("Retângulo: %.3f %n", retangulo);

        ler.close();
    }
}
