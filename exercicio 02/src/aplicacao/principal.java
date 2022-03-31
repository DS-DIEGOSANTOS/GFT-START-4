package aplicacao;

import java.util.Scanner;

public class principal {
	
	public static void main(String[] args) {
		
		char turno;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Em que turno você Trabalha:\n"
				+ "M-matutino\n"
				+ "V-vespertino\n"
				+ "N-noturno\n"
				+ "Digite sua resposta: ");
		turno = entrada.nextLine().toUpperCase().charAt(0);
		
		if(turno == 'M') {
			System.out.println("Bom Dia");
		}else if(turno == 'V') {
			System.out.println("Boa Tarde");
		}else if(turno == 'N') {
			System.out.println("Boa Noite");
		}else {
			System.out.println("“Valor inválido”,");
		}
		
		entrada.close();
		
	}

}
