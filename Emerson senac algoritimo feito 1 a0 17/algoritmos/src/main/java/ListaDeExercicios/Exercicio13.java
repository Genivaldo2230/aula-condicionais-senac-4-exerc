//Fazer um algoritmo que leia três números e imprime o maior deles.
package ListaDeExercicios;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            
            int numero1, numero2, numero3;
            
            System.out.println("O maior numero entre os três");
            System.out.println("Digite o primeiro numero:");
            numero1 = input.nextInt();
            System.out.println("Digite o segundo numero:");
            numero2 = input.nextInt();
            System.out.println("Digite o terceiro numero:");
            numero3 = input.nextInt();
            
            if (numero1 > numero2 && numero1 > numero3){
                System.out.println(numero1);
            }
            else if (numero2 > numero1 && numero2 > numero3){
                System.out.println(numero2);
            }
            else{
                System.out.println(numero3);
                
            }
    }   
}
