package ExerciciosIniciante;
import java.util.Scanner;

/*leia o número de um funcionário, seu número de horas trabalhadas, o valor que 
recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número
e o salário do funcionário, com duas casas decimais.*/

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        int numFuncionario;
        double horasTrabalhadas;
        double salario;
        
        System.out.println("Digite o número do funcionário:");
        numFuncionario = ler.nextInt();
        System.out.println("Digite salário por hora:");
        salario = ler.nextDouble();
        System.out.println("Digite as horas trabalhadas:");
        horasTrabalhadas = ler.nextDouble();
        
        salario = salario * horasTrabalhadas;
        
        System.out.printf("Número: %d %nSalário: %.2f %n", numFuncionario, salario);
        
        ler.close();
    }
}
