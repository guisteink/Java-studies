package Ex11a13;

public class Pessoa {
	private String nome, identidade;
	private Data datanasc;

	// construtores
	public Pessoa(String nome, String identidade, Data datanasc) {
		this.setNome(nome);
		this.setIdentidade(identidade);
		this.datanasc = datanasc;
	}

	public Pessoa(String nome, String identidade, String datanasc) throws Exception {
		this.setNome(nome);
		this.setIdentidade(identidade);
		this.datanasc = new Data(datanasc);
	}

	public Pessoa(String nome, String identidade, int d, int m, int a) throws Exception {
		this.setNome(nome);
		this.setIdentidade(identidade);
		this.datanasc = new Data(d, m, a);
	}

	// sets e gets
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdentidade() {
		return this.identidade;
	}

	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}

	public Data getDataNasc() {
		return this.datanasc;
	}

	public double calculaMaxEmprestimo() {
		return 1000;
	}

	// toString
	public StringBuilder toStringBuilder() {
		StringBuilder pessoa = new StringBuilder();
		pessoa.append("\nNome:" + this.getNome() + "\nIdentidade: " + this.getIdentidade() + "\nData de nascimento: "
				+ this.datanasc.toString());
		return pessoa;
	}

}