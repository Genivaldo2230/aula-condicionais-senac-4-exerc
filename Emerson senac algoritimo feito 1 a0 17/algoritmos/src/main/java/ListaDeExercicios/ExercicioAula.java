
package ListaDeExercicios;
import java.util.Scanner;

public class ExercicioAula {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float n1, n2;
        int nFaltas;
        
        System.out.println("Informe o valor da primeira nota: ");
        n1 = input.nextFloat();
        System.out.println("Informe o valor da segunda nota: ");
        n2 = input.nextFloat();
        System.out.println("Informe a quantidade de faltas: ");
        nFaltas = input.nextInt();
        
        //calculo da media
        float m = (n1+n2)/2;
        
        if(m>=6 && nFaltas<=18){
            System.out.println("Aprovado");
        }
        else if(nFaltas>18){
            System.out.println("Reprovado");            
        }
        else if (nFaltas<18) {
            System.out.println("Realizar o exame (prova substitutiva)");
            System.out.println("Digite o valor da prova substitutiva");
            float sub = input.nextFloat();
            
            //calculo da média com a substitutiva
            float mSub = (m+sub)/2;             
            if (mSub>=6){
            System.out.println("Aprovado");
        }
        else { 
            System.out.println("Reprovado");
        }
     
    }
    
   }
}
    
