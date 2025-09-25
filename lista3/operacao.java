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
	    
	    double num1,num2,result;
	    String simb;
	    
		System.out.print("DIGITE UM NUMERO: ");
		num1 = scanner.nextDouble();
		
		System.out.print("DIGITE OUTRO NUMERO: ");
		num2 = scanner.nextDouble();
		
		System.out.println("DIGITE O SIMBOLO DA OPERACAO:");
		System.out.println("simbolos validos:(+ , - , * , / ou ^)");
		simb = scanner.next();
		
		switch(simb){
		case "+":
		    result = num1 + num2;
		    System.out.println("resultado: "+result);
		    break;
		
		case "-":
		    result = num1 - num2;
		    System.out.println("resultado: "+result);
		    break;
		
		case "*":
		    result = num1 * num2;
		    System.out.println("resultado: "+result);
		    break;
		
	    case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Erro: divisão por zero.");
                    return;
                }
                break;
                
         case "^":
             result = Math.pow(num1, num2);//Math.pow calcula automaticamente.
                break;
                default:
                    System.out.println("Operação inválida.");
                return;
        }
		    
		    
		    
		
		    
		    
		    
	}
}