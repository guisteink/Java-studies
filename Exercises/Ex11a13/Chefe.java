package Ex11a13;

public class Chefe extends Funcionario {
	private String depto;

    //construtores
	public Chefe(String nome, String identidade, Data datanasc, Data data_admissao, double salario, String depto) {
		super(nome, identidade, datanasc, data_admissao, salario);
		this.depto = depto;
	}
	public Chefe(String nome, String identidade, String datanascStr, String data_admissaoStr, double salario, String depto) throws Exception {
		super(nome, identidade, datanascStr, data_admissaoStr, salario);
		this.depto = depto;
	}
	public Chefe(String nome, String identidade, int diaNasc, int mesNasc, int anoNasc, int diaAdm, int mesAdm, int anoAdm, double salario, String depto) throws Exception {
		super(nome, identidade, diaNasc, mesNasc, anoNasc, diaAdm, mesAdm, anoAdm, salario);
		this.depto = depto;
    }
    
    //gets e sets
	public String getDepto() {
		return this.depto;
	}
	public void setDepto(String depto) {
		this.depto = depto;
	}
	public double calculaMaxEmprestimo() {
		return super.calculaMaxEmprestimo()*2;
	}
    
    //tostring
	public String toString() {
		return super.toString()
				+ ", depto=" + this.getDepto();
	}


}
