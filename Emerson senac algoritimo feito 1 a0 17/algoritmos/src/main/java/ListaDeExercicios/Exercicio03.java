/* Fazer um algoritmo que lê dois números e imprime a soma dos quadrados dos dois números.
O quadrado de um número A é representado por A2 = A * A. */

package ListaDeExercicios;
import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, quadrado_n1, quadrado_n2, soma_dos_quadrados;
        
        System.out.println("Informe o primeiro numero:  ");
        n1 = input.nextInt();
        
        System.out.println("Informe o segundo numero: ");
        n2 = input.nextInt();
        
        quadrado_n1 = n1 * n1;
        quadrado_n2 = n2 * n2;
        
        soma_dos_quadrados = quadrado_n1 + quadrado_n2;
        System.out.println("A soma dos quadrados dos numeros é: " + soma_dos_quadrados);
  

    }
    
}
