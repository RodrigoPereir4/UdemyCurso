package ExerciciosIniciante;
import java.util.Scanner;

/* ler o valor do raio de um círculo, e depois mostrar o valor da 
área deste círculo com quatro casas decimais conforme exemplos.*/

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double area, raio, pi = 3.14159;
        
        System.out.println("Digite o raio do círculo:");
        raio = ler.nextDouble();
        
        area = pi * (Math.pow(raio, 2.0));
        
        System.out.printf("Área do circulo: %.4f %n", area);
        
        ler.close();
    }
}
