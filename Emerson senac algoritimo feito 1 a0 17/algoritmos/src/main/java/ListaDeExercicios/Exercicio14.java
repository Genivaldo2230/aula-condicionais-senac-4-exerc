//Fazer um algoritmo que leia dois números e imprime a divisão do maior pelo menor.
package ListaDeExercicios;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Divisão do numero maior pelo menor");
        System.out.println("Dgite o primeiro numero:");
        float numero1 = input.nextFloat();
        System.out.println("Digite o segundo numero:");
        float numero2 = input.nextFloat();
        float resultado;
        
        if(numero1 >= numero2){
            System.out.println("Resultado da divisão:");
            resultado = numero1/numero2;
            System.out.println(resultado);                   
        }
        else{
            System.out.println("Resultado da divisão:");
            resultado = numero2/numero1;
            System.out.println(resultado);
        }
    }    
}
