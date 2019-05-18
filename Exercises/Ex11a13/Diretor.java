package Ex11a13;

public class Diretor extends Chefe {
	private Data dtPromocao;

	public Diretor(String nome, String identidade, Data dtNasc, Data dtAdmissao, double salario, String depto, Data dtPromo) {
		super(nome, identidade, dtNasc, dtAdmissao, salario, depto);
		this.dtPromocao = dtPromo;
	}
	public Diretor(String nome, String identidade, String dtNascStr, String dtAdmStr, double salario, String depto, String dtPromoStr) throws Exception {
		super(nome, identidade, dtNascStr, dtAdmStr, salario, depto);
		this.dtPromocao = new Data(dtPromoStr);
	}
	public Diretor(String nome, String identidade, int diaNasc, int mesNasc, int anoNasc, int diaAdm, int mesAdm, int anoAdm, double salario, String depto, int diaPromo, int mesPromo, int anoPromo) throws Exception {
		super(nome, identidade, diaNasc, mesNasc, anoNasc, diaAdm, mesAdm, anoAdm, salario, depto);
		this.dtPromocao = new Data(diaPromo, mesPromo, anoPromo);
	}
	public Data getDtPromocao() {
		return this.dtPromocao;
	}
	public void setDtPromocao(Data _dtPromocao) {
		this.dtPromocao = _dtPromocao;
	}
	public double calculaMaxEmprestimo() {
		return super.calculaMaxEmprestimo()*1.5;
	}
	@Override
	public String toString() {
		return super.toString() + ", promocao=" + this.getDtPromocao();
	}
}
