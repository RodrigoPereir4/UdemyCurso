package ExerciciosIniciante;
import java.util.Scanner;

/* ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a 
diferença do produto de A e B pelo produto de C e D segundo a fórmula: 
DIFERENCA = (A * B - C * D).
*/

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int A, B, C, D;
        double diferenca = 0;
        
        System.out.println("Digite 4 valores para calcular a diferença:");
        A = ler.nextInt();
        B = ler.nextInt();
        C = ler.nextInt();
        D = ler.nextInt();
        
        diferenca = (int)(A * B) - (C * D);
        
        System.out.println("Diferença= " + diferenca);
        
        ler.close();
    }
}
