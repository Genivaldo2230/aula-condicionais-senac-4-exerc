/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula2;

import java.util.Scanner;

/**
 *
 * @author genivaldo.aanjos
 */
public class EndradaDadosScanner {
    public static void main(String[] args) {

     
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor");
        int nota1 = entrada.nextInt();
        
        System.out.println("Digite o valor");
        int nota2 = entrada.nextInt();
        
        System.out.println("Digite o valor");
        int nota3 = entrada.nextInt();
        
        System.out.println("Digite o valor");
        int nota4 = entrada.nextInt();
        
        int media = (nota1 + nota2 + nota3 + nota4)/4;
        
        System.out.println("A nota media é:" + media );
        
    }
    
}
