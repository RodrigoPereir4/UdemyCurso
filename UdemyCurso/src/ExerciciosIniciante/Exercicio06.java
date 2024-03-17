package ExerciciosIniciante;
import java.util.Scanner;

/*a ler o código de uma peça 1, o número de peças 1, o valor unitário de cada
peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada 
peça 2. Calcule e mostre o valor a ser pago.*/

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int cod1, qtd1; 
        double valor1;
        int cod2, qtd2;
        double valor2;
        
        double valorPago;
        
        System.out.println("Digite o código da peça, quantidade de peças"
                + " e o valor: ");
        cod1 = ler.nextInt();
        qtd1 = ler.nextInt();
        valor1 = ler.nextDouble();
        
        System.out.println("Digite o código da segunda peça, quantidade de peças"
                + " e o valor: ");
        cod2 = ler.nextInt();
        qtd2 = ler.nextInt();
        valor2 = ler.nextDouble();
        
        valorPago = valor1 * qtd1 + valor2 * qtd2;
        
        System.out.printf("Valor a pagar: %.2f %n", valorPago);
        
        ler.close();
    }
}
