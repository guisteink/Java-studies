package Ex11a13;

public class Funcionario extends Pessoa {
    private Data data_admissao;
    private double salario;

    // construtores
    public Funcionario(String nome, String identidade, String dtNasc, String data_admissao, double salario)
            throws Exception {
        super(nome, identidade, dtNasc);
        this.data_admissao = new Data(data_admissao);
        this.salario = salario;
    }

    public Funcionario(String nome, String identidade, int dia_nasc, int mes_nasc, int ano_nasc, int dia_adm,
            int mes_adm, int ano_adm, double salario) throws Exception {
        super(nome, identidade, dia_nasc, mes_nasc, ano_nasc);
        this.data_admissao = new Data(dia_adm, mes_adm, ano_adm);
        this.salario = salario;
    }

    public Funcionario(String nome, String identidade, Data dtNasc, Data data_admissao, double salario) {
		super(nome, identidade, dtNasc);
		this.data_admissao = data_admissao;
		this.salario = salario;
	}

    // sets e gets
    public Data getdtAdmissao() {
		return this.data_admissao;
	}
	public void setdtAdmissao(Data data_admissao) {
		this.data_admissao = data_admissao;
	}
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	//metodos
	public void reajusta(double taxa) {
		this.salario += this.salario * taxa;
	}
	public double calculaMaxEmprestimo() {
		return this.getSalario();
	}

    // toString
    public String toString() {
		return super.toStringBuilder()
		+ ", dtAdmissao=" + this.getdtAdmissao() 
		+ ", salario=" + this.getSalario();
	}	

}