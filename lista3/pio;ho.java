/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner  scanner = new Scanner(System.in);
	    int indicador;
	    double raio,py,pr,py2,vl;
		System.out.println("DIGITE O INDICADOR DE OPERACAO(1,2 ou 3): ");
		System.out.println("(1:peritro do circulo); (2:area do circulo); (3: volume da esfera);");
		
	
		indicador = scanner.nextInt();
		
	    if (!(indicador == 1 || indicador == 2 || indicador == 3)) {
		    System.out.println("erro, codigo invalido!");
		}
		py=3.141592;
		
		if (indicador == 1|| indicador == 2 || indicador == 3) {
		System.out.print("DIGIE O RAIO DA CIRCUNFERENCIA: ");
		}
		raio = scanner.nextDouble();
		
		switch(indicador){
		    case 1:
		    indicador = 1;
		    pr = 2* py *raio;
		        System.out.println("perimetro do circulo: "+ pr);
		    break;
		    
		    case 2:
		    indicador = 2;
		    py2 = raio*raio;
		        System.out.println("area do circulo: "+ py2);
		    break;
		    
		    case 3:
		    indicador = 3;
		    vl = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);//calcula o volume da esfera
		        System.out.printf("volume da esfera:  %.2f%n",vl);
		        //para funcionar o limitador de casas decimais utilizar o printf
		    break;
		     default:
                System.out.println("Indicador inválido.");
            break;
		}
		
		    
		}
	 }
	
