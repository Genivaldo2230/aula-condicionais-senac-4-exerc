/* Escreva um algoritmo que leia três números decimais: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (π = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
f) o perímetro do retângulo que tem lados A e B. */
package ListaDeExercicios;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double a, b, c, pi, raio;
        System.out.println("Iforme o valor de a: ");
        a = input.nextDouble();
        System.out.println("Informe o valor de b: ");
        b = input.nextDouble();
        System.out.println("Informe o valor de c: ");
        c = input.nextDouble();
        
        // área do triângulo retângulo que tem A por base e C por altura.
        double trianguloRetangulo = (a*c)/2;
        System.out.println("Área do triângulo retângulo: " + trianguloRetangulo);
        
        // area do circulo de raio C. 
        pi = 3.14159;
        raio = c;
        double areaCirculo = pi * (raio * raio); 
        System.out.println("Área do circulo: " + areaCirculo);
        
        // área do trapézio que tem A e B por bases e C por altura.
        double areaTrapezio = (a + b) * c / 2;
        System.out.println("Área do trapezio: " + areaTrapezio);
        
        // área do quadrado que tem lado B.
        double areaQuadrado = b * b;
        System.out.println("Área do quadrado: " + areaQuadrado);
        
        // área do retângulo que tem lados A e B.
        double areaRetangulo = a * b;
        System.out.println("Área do retangulo: " + areaRetangulo);
        
        // perímetro do retângulo que tem lados A e B.
        double perimetroRetangulo = (a + b) * 2;
        System.out.println("Perimetro so retangulo: " + perimetroRetangulo);
       
    }
    
}
