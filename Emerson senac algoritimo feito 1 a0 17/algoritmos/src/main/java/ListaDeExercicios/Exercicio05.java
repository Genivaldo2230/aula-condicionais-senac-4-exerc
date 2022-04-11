//Fazer um algoritmo que leia um valor L e calcula a área de um quadrado de lado L.
package ListaDeExercicios;
import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double l; //valor de L
        double al; //area do quadrado L
        
        System.out.println("Informe o valor de L: ");
        l = input.nextDouble();
        
        al = l * l;
        System.out.println("Valor da area do quadrado L: " + al);
    }
    
}
