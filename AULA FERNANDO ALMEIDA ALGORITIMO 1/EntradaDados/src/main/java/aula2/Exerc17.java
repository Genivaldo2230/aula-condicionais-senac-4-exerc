/*se a variável A for par escrever a 
mensagem "Valores aceitos", senão escrever "Valores não aceitos".*/
package aula2;
import java.util.Scanner;

public class Exerc17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a, b, c, d;
        System.out.println("Digite o valor de A: ");
        a = input.nextInt();
        System.out.println("Digite o valor de B: ");
        b = input.nextInt();
        System.out.println("Digite o valor de C: ");
        c = input.nextInt();
        System.out.println("Digite o valor de D: ");
        d = input.nextInt();
        
        if(b>c && d>a && (c+d)>(a+b) && c>0 && d>0){
            System.out.println("Valores aceitos");
        }
        else{
            System.out.println("Valores não aceitos");
        }
    }   
}
