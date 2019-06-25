package codigos;

/**
 * Classe Abstrata ItemAgenda
 * 
 * @author Guilherme Stein Kuhn - 21 de Junho
 */
public abstract class ItemAgenda {
	private Periodo periodo_tarefa;
	private String registro, descricao;

	// CONSTRUTORES
	/**
	 * Construtor pra uma instancia gerada de Tarefa no mesmo dia, começo no
	 * instante e fim em 23:59 Registro e Descrição geradas no construtor
	 * 
	 * @throws Exception
	 */
	public ItemAgenda() throws Exception {
		this.periodo_tarefa.getHorarioInicio().setHorario();
		this.periodo_tarefa.getHorarioFim().setHorario(23, 59);
		this.periodo_tarefa.getDataInicio().setData();
		this.periodo_tarefa.getDataFim().setData();
		this.setRegistro("digite aqui o titulo: ");
		this.setDescricao("digite aqui a descricao: ");
	}

	/**
	 * Construtor padrão para classe Periodo, e String
	 * 
	 * @param periodo_tarefa
	 * @param _registro
	 * @param _descricao
	 * @throws Exception
	 */
	public ItemAgenda(Periodo periodo_tarefa, String _registro, String _descricao) throws Exception {
		this.setDescricao(_descricao);
		this.setRegistro(_registro);
		this.setPeriodo(periodo_tarefa);
	}

	/**
	 * Construtor pra classe Data, Horario e String
	 * 
	 * @param data_inicio
	 * @param data_fim
	 * @param _inicio
	 * @param _fim
	 * @param _registro
	 * @param _descricao
	 * @throws Exception
	 */
	public ItemAgenda(Data data_inicio, Data data_fim, Horario _inicio, Horario _fim, String _registro,
			String _descricao) throws Exception {
		this.setDescricao(_descricao);
		this.setRegistro(_registro);
		this.setPeriodo(new Periodo(_inicio, _fim, data_inicio, data_fim));
	}

	// METODOS
	/**
	 * Set pra Classe Periodo
	 * 
	 * @param periodo_tarefa
	 */
	public void setPeriodo(Periodo periodo_tarefa) {
		this.periodo_tarefa = periodo_tarefa;
	}

	/**
	 * Set Registro pra entrada primitiva String
	 * 
	 * @param _registro
	 * @throws Exception
	 */
	public void setRegistro(String _registro) throws Exception {
		this.registro = _registro;
	}

	/**
	 * Set Descricao pra entrada primitiva String
	 * 
	 * @param _descricao
	 * @throws Exception
	 */
	public void setDescricao(String _descricao) throws Exception {
		this.descricao = _descricao;
	}

	/**
	 * Get pra classe Periodo
	 * 
	 * @return Periodo
	 */
	public Periodo getPeriodo() {
		return this.periodo_tarefa;
	}

	/**
	 * Get primitivo pra Registro
	 * 
	 * @return String
	 */
	public String getRegistro() {
		return this.registro;
	}

	/**
	 * Get primitivo pra Descricao
	 * 
	 * @return String
	 */
	public String getDescricao() {
		return this.descricao;
	}

	/**
	 * toString padrão da classe
	 * 
	 * @return String
	 */
	public String toString() {
		StringBuilder str = new StringBuilder();

		str.append("\n\nTitulo: " + this.getRegistro());
		str.append("\nDescricao da tarefa: " + this.getDescricao());
		str.append(this.getPeriodo().toString());
		return str.toString();
	}
}
