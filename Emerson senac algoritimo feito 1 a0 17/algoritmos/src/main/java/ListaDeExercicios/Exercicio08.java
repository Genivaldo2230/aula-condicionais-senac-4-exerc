//Fazer um algoritmo que leia quatro números e imprime a média aritmética dos quatro números.
package ListaDeExercicios;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            int n1, n2, n3, n4, media;
            System.out.println("Média aritmetica de 4 numeros");
            
            System.out.println("Informe o valor do primeiro numero:");
            n1 = input.nextInt();
            System.out.println("Informe o valor do segundo numero:");
            n2 = input.nextInt();
            System.out.println("Informe o valor do terceiro numero:");
            n3 = input.nextInt();
            System.out.println("Informe o valor do quarto numero:");
            n4 = input.nextInt();
            
            //calculo da media aritmetica 
            media = (n1+n2+n3+n4)/4;
            
            System.out.println("Média aritmetica: " + media);
    }    
}
