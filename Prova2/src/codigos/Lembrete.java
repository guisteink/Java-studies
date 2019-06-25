package codigos;

import java.util.GregorianCalendar;

/**
 * Classe Lembrete, que herda ItemAgenda, e é ordenada de acordo com sua compareTo
 * 
 * @author Guilherme Stein Kuhn - 21 de Junho
 */
public class Lembrete extends ItemAgenda implements Comparable<Lembrete> {
	// o tempo ate o aviso contem uma qtd. de horas e minutos;
	private Horario tempo_aviso;

	// CONSTRUTORES
	/**
	 * Construtor que gera uma instancia de tempo de acordo com o momento gerado
	 * 
	 * @throws Exception
	 */
	public Lembrete(Periodo periodo_tarefa, String _registro, String _descricao) throws Exception {
		super(periodo_tarefa, _registro, _descricao);
		this.functionTempo(periodo_tarefa.getHorarioInicio().getHora(), periodo_tarefa.getHorarioInicio().getMin());
	}

	/**
	 * Construtor padrão pra entradas definidas, Periodo, String e Horario
	 * 
	 * @param periodo_tarefa
	 * @param _registro
	 * @param _descricao
	 * @param tempo_aviso
	 * @throws Exception
	 */
	public Lembrete(Periodo periodo_tarefa, String _registro, String _descricao, Horario tempo_aviso) throws Exception {
		super(periodo_tarefa, _registro, _descricao);
		this.setTempo(tempo_aviso);

	}

	/**
	 * Construtor padrao pra entradas definidas, Periodo, String e int
	 * 
	 * @param periodo_tarefa
	 * @param _registro
	 * @param _descricao
	 * @param horas_aviso
	 * @param min_aviso
	 * @throws Exception
	 */
	public Lembrete(Periodo periodo_tarefa, String _registro, String _descricao, int horas_aviso, int min_aviso)
			throws Exception {
		super(periodo_tarefa, _registro, _descricao);
		this.setTempo(horas_aviso, min_aviso);
	}

	/**
	 * Construtor padrão pra, Data, Horario, String e int
	 * 
	 * @param data_inicio
	 * @param data_fim
	 * @param _inicio
	 * @param _fim
	 * @param _registro
	 * @param _descricao
	 * @param horas_aviso
	 * @param min_aviso
	 * @throws Exception
	 */
	public Lembrete(Data data_inicio, Data data_fim, Horario _inicio, Horario _fim, String _registro, String _descricao,
			int horas_aviso, int min_aviso) throws Exception {
		super(data_inicio, data_fim, _inicio, _fim, _registro, _descricao);
		this.setTempo(horas_aviso, min_aviso);
	}

	/**
	 * Construtor padrão pra Data, Horario e String
	 * 
	 * @param data_inicio
	 * @param data_fim
	 * @param _inicio
	 * @param _fim
	 * @param _registro
	 * @param _descricao
	 * @param tempo_aviso
	 * @throws Exception
	 */
	public Lembrete(Data data_inicio, Data data_fim, Horario _inicio, Horario _fim, String _registro, String _descricao,
			Horario tempo_aviso) throws Exception {
		super(data_inicio, data_fim, _inicio, _fim, _registro, _descricao);
		this.setTempo(tempo_aviso);
	}

	// METODOS
	/**
	 * Set de tempo_aviso pra um lembrete a seguir
	 * 
	 * @throws Exception
	 */
	public void setTempo() throws Exception {
		this.tempo_aviso.setHorario(0, 0);
	}

	/**
	 * Set de tempo_aviso pra um lembrete próximo, mas nao agora, classe Horario
	 * definida
	 * 
	 * @param tempo_aviso
	 * @throws Exception
	 */
	public void setTempo(Horario tempo_aviso) throws Exception {
		this.tempo_aviso = tempo_aviso;
	}

	/**
	 * Set de tempo_aviso pra um lembrete próximo, classe nao definida, entrada
	 * primitiva
	 * 
	 * @param qtd_h
	 * @param qtd_min
	 * @throws Exception
	 */
	public void setTempo(int qtd_h, int qtd_min) throws Exception {
		this.tempo_aviso.setHorario(qtd_h, qtd_min);
		if (qtd_h == 0 && qtd_min == 0)
			new Exception("Lembrete agora!");
	}

	/**
	 * Get padrao tempo_aviso
	 * 
	 * @return Horario
	 */
	public Horario getTempo() {
		return this.tempo_aviso;
	}

	/**
	 * Funçao calcula o tempo de aviso, de acordo com o horario do lembrete e com
	 * uma instancia do calendario gregoriano gerado, que mostra o tempo no momento
	 * em que instanciado. Gera o tempo instanciado, no setTempo;;;;
	 * 
	 * @param hora_lembrete
	 * @param min_lembrete
	 * @throws Exception
	 */
	@SuppressWarnings("static-access")
	public void functionTempo(int hora_lembrete, int min_lembrete) throws Exception {
		GregorianCalendar gc = new GregorianCalendar();
		int h = 23 - hora_lembrete, m = 59 - min_lembrete, h_aux = 23 - gc.HOUR, m_aux = 59 - gc.MINUTE;
		this.setTempo(h_aux - h, m_aux - m);
	}

	/**
	 * equals
	 * 
	 * @param objeto
	 * @return boolean
	 */
	public boolean equals(Lembrete objeto) {
		if (this.getTempo() == objeto.getTempo())
			return true;
		else
			return false;
	}

	/**
	 * compareTo ,ordena de acordo com o menor tempo de aviso
	 * 
	 * @return int
	 */
	public int compareTo(Lembrete objeto) {
		if (this.tempo_aviso.getHora() > objeto.getTempo().getHora())
			return 1;
		if (this.tempo_aviso.getHora() < objeto.getTempo().getHora())
			return -1;
		else {
			if (this.tempo_aviso.getMin() > objeto.getTempo().getMin())
				return 1;
			if (this.tempo_aviso.getMin() < objeto.getTempo().getMin())
				return -1;
			else
				return 0;
		}
	}

	/**
	 * toString padrão da classe
	 * @return String
	 */
	public String toString() {

		StringBuilder str = new StringBuilder();
		str.append(super.toString());
		str.append("\nTempo até o lembrete: " + this.getTempo().toString());

		return str.toString();
	}
}
