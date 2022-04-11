/* Fazer um algoritmo que leia dois números e imprima na tela o produto (multiplicação)
dos dois números.*/

package ListaDeExercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {        
        
        float n1, n2, produto;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o primeiro numero: ");
        n1 = input.nextFloat();
        
        System.out.println("Informe o segundo numero: ");
        n2 = input.nextFloat();
        
        produto = n1 * n2;
        System.out.println("O valor da mutiplicação é: " + produto);
        
        
        
       

    }
    
}
