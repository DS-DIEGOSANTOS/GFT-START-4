package aplicacao;

import java.util.Scanner;

public class principal {
	public static void main(String[] args) {
		int idade;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua idade:");
		idade = entrada.nextInt();
		
		if(idade>18 || idade < 67) {
			System.out.println("pode doar sangue");
		}else {
			System.out.println("não pode doar sangue");
		}

		entrada.close();
	}

}
