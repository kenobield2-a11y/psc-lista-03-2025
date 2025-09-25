/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    double a,b,c,delta,x1,x2;
	    
		System.out.println("INFORME O VALOR DE (a): ");
		    a = scanner.nextDouble();
		System.out.println("INFORME O VALOR DE (b): ");
		    b = scanner.nextDouble();
		System.out.println("INFORME O VALOR DE (c): ");
		    c = scanner.nextDouble();
	
		//em vez de colocar "c%=0",colocar "c!=0" que significa diferente de   
		if (a==0 && b==0 && c!= 0){ 
		System.out.println("COEFICIENTES INFORMADOS INCORRETAMENTE");
		}
		else if(a==0 && b!=0){
		    x1 = -c / b;
		    System.out.println("ESSA E UMA EQUACAO DE PRIMEIRO GRAU!");
		    System.out.println("RAIZ: " + x1);
		} else {
            delta = (b * b) - (4 * a * c);

            if (delta < 0) {
                System.out.println("ESSA EQUACAO NAO POSSUI RAIZES REAIS.");
            } else if (delta == 0) {
                x1 = -b / (2 * a);
                System.out.println("ESSA EQUACAO POSSUI DUAS RAIZES REAIS IGUAIS.");
                System.out.println("RAIZ: " + x1);
            } else {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
           //A função "Math.sqrt()" em Java serve para calcular a raiz quadrada de um número.
           
                System.out.println("ESSA EQUACAO POSSUI DUAS RAIZES REAIS DIFERENTES.");
                System.out.println("RAIZ 1: " + x1);
                System.out.println("RAIZ 2: " + x2);
            }
                System.out.println("RESULTADO DA EQUACAO: "+ delta);
        } 

        scanner.close();
    }
}    
	