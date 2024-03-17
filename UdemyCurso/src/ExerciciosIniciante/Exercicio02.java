package ExerciciosIniciante;
import java.util.Scanner;
/* ler dois valores inteiros, e depois mostrar na tela a soma desses 
        números com uma mensagem explicativa */
public class Exercicio02 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int valor1, valor2, soma = 0;
        
        System.out.println("Digite o primeiro valor: ");
        valor1 = ler.nextInt();
        System.out.println("Digite o segundo valor: ");
        valor2 = ler.nextInt();
        
        soma = valor1 + valor2;
        
        System.out.println("Soma = " + soma);
        
        ler.close();
    }
}
