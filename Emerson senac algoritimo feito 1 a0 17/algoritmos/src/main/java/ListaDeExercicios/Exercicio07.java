//Fazer um algoritmo que leia os dois lados A e B de um triângulo retângulo e calcula a hipotenusa do triângulo.
package ListaDeExercicios;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, h;
        System.out.println("Calculo da hipotenusa");
        System.out.println("Informe o valor de A:");
        a = input.nextFloat();
        System.out.println("Informe o valor de B:");
        b = input.nextFloat();
        
        double raiz = (a * a) + (b * b);
        h = Math.sqrt(raiz);
        
        System.out.println("Hipotenusa: " + h);
    }    
}
