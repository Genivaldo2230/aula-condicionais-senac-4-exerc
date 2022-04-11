/* Fazer um algoritmo que lê dois números, a base e o expoente, e imprime a potência (base elevada ao
 expoente). Dica: use a função matemática Math.pow(). */ 
package ListaDeExercicios;
import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        
        double base, expoente, potencia;
        
        System.out.println("Informe o valor da base: ");
        base = input.nextDouble();
        
        System.out.println("Informe o valor do expoente: ");
        expoente = input.nextDouble();
        
        potencia = Math.pow(base, expoente);
        System.out.println("O valor da potencia é: " + potencia);

    }
    
}
