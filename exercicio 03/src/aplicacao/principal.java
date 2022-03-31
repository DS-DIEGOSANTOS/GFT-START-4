package aplicacao;

import java.util.Scanner;

public class principal {
	
	
	public static void main(String[] args) {	
		
		final double valorDoSuco = 10;

		char TipoDeSuco;
		int quantidadeDeLitros;
		double valorPago;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escolha um tipo de suco\n"
				+ "L-limão\n"
				+ "T-tamarindo\n"
				+ "Digite sua escolha :");
		TipoDeSuco = entrada.nextLine().toUpperCase().charAt(0);
	
		System.out.print("Informa a quantidade de Litros :");
		quantidadeDeLitros = entrada.nextInt();
		
		valorPago = calcularValorPago(TipoDeSuco, quantidadeDeLitros, valorDoSuco);
		
		System.out.println("valor pago :" + valorPago);
		
		entrada.close();
	}
	
	static double calcularValorPago(char TipoDeSuco, int quantidadeDeLitros, double valorDoSuco) {
		
		double resultado = 0;
		
		if(TipoDeSuco == 'L') {
			
			if(quantidadeDeLitros <= 2) {
				resultado =  valorDoSuco*quantidadeDeLitros* (1-0.3);
			}else if(quantidadeDeLitros > 5){
				resultado =  valorDoSuco*quantidadeDeLitros* (1-0.5);				
			}else {
				resultado =valorDoSuco*quantidadeDeLitros;
			}
		}else if(TipoDeSuco == 'T') {
			
			if(quantidadeDeLitros <= 2) {
				resultado =  valorDoSuco*quantidadeDeLitros* (1-0.4);
			}else if(quantidadeDeLitros > 5){
				resultado =  valorDoSuco*quantidadeDeLitros* (1-0.6);				
			}else {
				resultado =valorDoSuco*quantidadeDeLitros;
			}
		}
		
		return resultado;
	}
}
