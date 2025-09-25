/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorCompra, valorPago;

        System.out.print("Qual o valor da compra? R$ ");
        valorCompra = scanner.nextDouble();

        System.out.print("Quanto o cliente pagou? R$ ");
        valorPago = scanner.nextDouble();

        if (valorPago < valorCompra) {
            System.out.println("Valor insuficiente para realizar a compra.");
        } else {
            double trocoDouble = valorPago - valorCompra;
            int troco = (int) trocoDouble;
            
            //trocoDouble: calcula o troco com casas decimais.
            //troco: converte o troco para inteiro, ignorando os centavos.
            
            System.out.printf("Troco para o cliente: R$ %.2f%n", trocoDouble);
            //Mostra o valor total do troco com duas casas decimais.

            int[] notas = {50, 20, 10, 5, 2, 1};
            //valores das notas disponíveis.
            
            int[] quantidadeNotas = new int[notas.length];
            //vai guardar quantas notas de cada tipo serão usadas no troco.

            for (int i = 0; i < notas.length; i++) {
                quantidadeNotas[i] = troco / notas[i];
                troco %= notas[i];
                
                //Divide o troco pelo valor da nota para saber quantas notas usar.
                //Usa o operador % para atualizar o troco com o valor restante.
            }

            System.out.println("Notas devolvidas:");
            for (int i = 0; i < notas.length; i++) {
                if (quantidadeNotas[i] > 0) {
                    System.out.println("R$" + notas[i] + ",00: " + quantidadeNotas[i] + " nota(s)");
                }
            }
        }

        scanner.close();
    }
}





        

        
    

		
	