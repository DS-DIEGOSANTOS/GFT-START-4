package entidade;

import java.util.Calendar;

public class Pessoa {
	
	private String nome;
	private String dataDeNascimento;
	private double altura;
	
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	//data formato dd/mm/aaaa
	public int calculaIdade() {
		
		Calendar cal = Calendar.getInstance();
		String ano = getDataDeNascimento().substring(6,10);
		String mes = getDataDeNascimento().substring(3,5);
		String dia = getDataDeNascimento().substring(0,2);
		
		int intAno = Integer.parseInt(ano);
		int intMes = Integer.parseInt(mes);
		int intDia = Integer.parseInt(dia);
		
		if(cal.get(Calendar.DATE) < intDia || cal.get(Calendar.MONTH) + 1 < intMes ) {
			return cal.get(Calendar.YEAR) - intAno -1;
		}else {
			return cal.get(Calendar.YEAR) - intAno;	
		}
				
	}
	
	public void dadosPessoal() {
		System.out.println("Nome: " +getNome() );
		System.out.println("Data de nascimento: " + getDataDeNascimento());
		System.out.println("Idade: " + calculaIdade());
		System.out.println("Altura: " + getAltura());
		
	}
	

}
