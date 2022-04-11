/* Fazer um algoritmo que lê dois números inteiros 
e imprime os números consecutivos desses números. */

package ListaDeExercicios;
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero1, numero2;
        
        System.out.println("Informe o primeiro numero: ");
        numero1 = input.nextInt();
        
        System.out.println("Informe o segundo numero: ");
        numero2 = input.nextInt();
        
        numero1++;
        numero2++;
        
        System.out.println("O consecutivo do primeiro numero: " + numero1);
        System.out.println("O consecutivo do segundo numero: " + numero2);
        
    }
    
}
