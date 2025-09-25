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
	    
	    int num1,num2,num3,media;
	    
		System.out.println("Digite um numero: ");
		    num1 = scanner.nextInt();
		System.out.println("Digite outro numero: ");
		    num2 = scanner.nextInt();
		System.out.println("Digite mais um numero: ");
		    num3 = scanner.nextInt();
		    
		int maior = Math.max(num1, Math.max(num2, num3));
		
		// Math.max(num2, num3) encontra o maior entre num2 e num3.

        //Depois, Math.max(num1, ...) compara esse resultado com num1.

        //Resultado: o maior dos três, com apenas uma linha de lógica.//   
		
		
		System.out.println("Esse e o maior numero: "+ maior);
		
		media= (num1+num2+num3)/3;
		
		System.out.println("A media entre os numeors digitados: "+media);
	}
}