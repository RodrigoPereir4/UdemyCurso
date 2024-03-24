package ExerciciosIniciante;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int horas1, horas2;
        int duracao;

        System.out.println("Digite as horas do jogo");
        horas1 = ler.nextInt();
        horas2 = ler.nextInt();

        if (horas1 < horas2) {
            duracao = horas2 - horas1;
        } else {
            duracao = 24 - horas1 + horas2;
        }

        System.out.println("O jogo durou " + duracao + "hora(s)");

        ler.close();
    }
}
