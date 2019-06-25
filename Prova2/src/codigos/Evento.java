package codigos;

/**
 * Classe Evento, que herda ItemAgenda, e é ordenada pelo seu compareTo
 * 
 * @author Guilherme Stein Kuhn - 21 de Junho
 */
public class Evento extends ItemAgenda implements Comparable<Evento>{
	private String local;

	// CONSTRUTORES
	/**
	 * Construtor padrão da classe, Entrada: String e Periodo 
	 * @param _local
	 * @param periodo_tarefa
	 * @param _registro
	 * @param _descricao
	 * @throws Exception
	 */
	public Evento(String _local, Periodo periodo_tarefa, String _registro, String _descricao) throws Exception {
		super(periodo_tarefa, _registro, _descricao);
		this.setLocal(_local);
	}

	/**
	 * Construtor padrão da classe, Entrada: String, Horario e Data
	 * @param _local
	 * @param _inicio
	 * @param _fim
	 * @param data_inicio
	 * @param data_fim
	 * @param _registro
	 * @param _descricao
	 * @throws Exception
	 */
	public Evento(String _local, Horario _inicio, Horario _fim, Data data_inicio, Data data_fim, String _registro,String _descricao) throws Exception
	{
		super(data_inicio,data_fim,_inicio,_fim,_registro,_descricao);
		this.setLocal(_local);
	}

	// METODOS
	/**
	 * Set pro local do evento, entrada primitiva
	 * @param _local
	 * @throws Exception
	 */
	public void setLocal(String _local) throws Exception {
		this.local = _local;
	}

	/**
	 * Get padrão do local
	 * @return String
	 */
	public String getLocal() {
		return this.local;
	}

	/**
	 * Equals
	 * @param objeto
	 * @return boolean
	 */
	public boolean equals(Evento objeto) {
		if (this.local.equals(objeto.getLocal()) == true)
			return true;
		else
			return false;
	}

	/**
	 * compareTo padrão da classe
	 * @param _evento
	 * @return int
	 */
	public int compareTo(Evento _evento) {
		return this.getLocal().compareTo(_evento.getLocal());
	}
	
	/**
	 * toString padrão da classe
	 * @return String
	 */
	public String toString() {

		StringBuilder str = new StringBuilder();
		str.append(super.toString());
		str.append("\nLocal do evento: " + this.getLocal());

		return str.toString();
	}
}
