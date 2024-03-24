package ExerciciosIniciante;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int cod, qtd;
        double preco, total = 0;

        System.out.println("Digite o código do produto");
        cod = ler.nextInt();
        System.out.println("Digite a quantidade");
        qtd = ler.nextInt();

        if (cod == 1) {
            preco = 4.0;
            total = preco * qtd;
        } else if (cod == 2) {
            preco = 4.50;
            total = preco * qtd;
        } else if (cod == 3) {
            preco = 5.0;
            total = preco * qtd;
        } else if (cod == 4) {
            preco = 2.0;
            total = preco * qtd;
        } else if (cod == 5) {
            preco = 1.50;
            total = preco * qtd;
        }else{
            System.out.println("Digite um código válido!");
        }
        
        System.out.printf("Preço total: %.2f \n", total);
        
        ler.close();
    }
}
