/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
import java.util.Random;
public class Main

{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Random gerador = new Random();
	int num1,num2, numero;
	
	System.out.print("DIGITE UM NUMERO: ");
	num1 = scanner.nextInt();
	
	System.out.print("DIGITE OUTRO NUMERO: ");
	num2 = scanner.nextInt();    
	
	if (num1>num2) {
	    System.out.println("primeiro número é o maior");
	}  
	else if (num2>num1) {
	    System.out.println("segundo número é o maior ");
	}
		    
	numero = gerador.nextInt(1000);	
	System.out.println("numero gerado: "+ numero);
	
	 if (numero % 2 == 0) {
            System.out.println("O número gerado é PAR.");
        } else {
            System.out.println("O número gerado é ÍMPAR.");
        }
		
		
	}
}