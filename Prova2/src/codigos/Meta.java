package codigos;

/**
 * Classe Meta, herda ItemAgenda
 * 
 * @author Guilherme Stein Kuhn - 21 de Junho
 */

public class Meta extends ItemAgenda implements Comparable<Meta> {
	private final static int PrioridadeDefault = 1, MaxPrioridadeDefault = 5;
	private int prioridade_meta;

	// CONSTRUTORES
	/**
	 * Construtor padrão pra entradas definidas, Periodo e String
	 * 
	 * @param periodo_tarefa
	 * @param _registro
	 * @param _descricao
	 * @throws Exception
	 */
	public Meta(Periodo periodo_tarefa, String _registro, String _descricao) throws Exception {
		super(periodo_tarefa, _registro, _descricao);
		this.setPrioridade(Meta.PrioridadeDefault);
	}

	/**
	 * Construtor Meta padrão pra entradas definidas, int, Horario, Data e String
	 * 
	 * @param _prioridade
	 * @param _inicio
	 * @param _fim
	 * @param data_inicio
	 * @param data_fim
	 * @param _registro
	 * @param _descricao
	 * @throws Exception
	 */
	public Meta(int _prioridade, Horario _inicio, Horario _fim, Data data_inicio, Data data_fim, String _registro,
			String _descricao) throws Exception {
		super(data_inicio, data_fim, _inicio, _fim, _registro, _descricao);
		this.setPrioridade(_prioridade);
	}

	// METODOS
	/**
	 * Set padrão pra variavel primitiva prioridade
	 * 
	 * @param _prioridade
	 * @throws Exception
	 */
	public void setPrioridade(int _prioridade) throws Exception {
		if (_prioridade > Meta.PrioridadeDefault && _prioridade < Meta.MaxPrioridadeDefault) {
			this.prioridade_meta = _prioridade;
		} else
			new Exception("\nPrioridade não permitida!");
	}

	/**
	 * Get padrao pra prioridade
	 * 
	 * @return int
	 */
	public int getPrioridade() {
		return this.prioridade_meta;
	}

	/**
	 * equals
	 * 
	 * @param objeto
	 * @return boolean
	 */
	public boolean equals(Meta objeto) {
		if (this.getPrioridade() == objeto.getPrioridade())
			return true;
		else
			return false;
	}

	/**
	 * compareTo padrão que ordena de acordo com a maior prioridade
	 * @return int
	 */
	public int compareTo(Meta objeto) {
		try {
			if (this.getPeriodo().getDataInicio().compareTo(objeto.getPeriodo().getDataInicio()) == 1)
				return 1;
			if (this.getPeriodo().getDataInicio().compareTo(objeto.getPeriodo().getDataInicio()) == -1)
				return -1;
			else {
				if (this.getPeriodo().getHorarioInicio().compareTo(objeto.getPeriodo().getHorarioInicio()) == 1)
					return 1;
				if (this.getPeriodo().getHorarioInicio().compareTo(objeto.getPeriodo().getHorarioInicio()) == 1)
					return -1;
				else {
					if (this.getPrioridade() > objeto.getPrioridade())
						return 1;
					if (this.getPrioridade() < objeto.getPrioridade())
						return -1;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 * toString padrão da classe 
	 * @return String
	 */
	public String toString() {

		StringBuilder str = new StringBuilder();
		str.append(super.toString());
		str.append("\nPrioridade: " + this.getPrioridade());

		return str.toString();
	}

}
