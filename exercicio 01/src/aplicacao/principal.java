package aplicacao;

import entidade.Pessoa;

public class principal {
	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		
		p1.setNome("Diego");
		p1.setDataDeNascimento("07/05/2002");
		p1.setAltura(1.5);
		
		
		p1.dadosPessoal();
	}

}
