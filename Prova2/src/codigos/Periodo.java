package codigos;

/**
 * Classe Periodo
 * 
 * @author Guilherme Stein Kuhn - 21 de Junho
 */
public class Periodo {
	private Horario inicio_tarefa, fim_tarefa;
	private Data data_inicio, data_fim;

	// CONSTRUTORES
	/**
	 * Construtor que instancia uma hora e data a partir do CalendarioGregoriano
	 * gerado
	 * 
	 * @throws Exception
	 */
	public Periodo() throws Exception {
		this.setInicioTarefa();
		this.setFimTarefa();
		this.setDataInicio();
		this.setDataFim();
		// verificacao de seguranca no fim de cada instancia
		this.validaDataHoraFim();
	}

	/**
	 * Construtor padrão pra entradas em classes Horario e Data, definidas
	 * 
	 * @param _inicio
	 * @param _fim
	 * @param data_inicio
	 * @param data_fim
	 * @throws Exception
	 */
	public Periodo(Horario _inicio, Horario _fim, Data data_inicio, Data data_fim) throws Exception {
		this.setInicioTarefa(_inicio);
		this.setFimTarefa(_fim);
		this.setDataInicio(data_inicio);
		this.setDataFim(data_fim);
		// verificacao de seguranca no fim de cada instancia
		this.validaDataHoraFim();
	}

	/**
	 * Construtor pra inteiros, entradas primitivas
	 * 
	 * @param hora_inicio
	 * @param min_inicio
	 * @param hora_fim
	 * @param min_fim
	 * @param dia_inicio
	 * @param mes_inicio
	 * @param ano_inicio
	 * @param dia_fim
	 * @param mes_fim
	 * @param ano_fim
	 * @throws Exception
	 */
	public Periodo(int hora_inicio, int min_inicio, int hora_fim, int min_fim, int dia_inicio, int mes_inicio,
			int ano_inicio, int dia_fim, int mes_fim, int ano_fim) throws Exception {
		this.setInicioTarefa(hora_inicio, min_inicio);
		this.setFimTarefa(hora_fim, min_fim);
		this.setDataInicio(dia_inicio, mes_inicio, ano_inicio);
		this.setDataFim(dia_fim, mes_fim, ano_fim);
		// verificacao de seguranca no fim de cada instancia
		this.validaDataHoraFim();
	}

	/**
	 * Construtor pra inteiros e Strings, entradas primitivas
	 * 
	 * @param hora_inicio
	 * @param min_inicio
	 * @param hora_fim
	 * @param min_fim
	 * @param data_inicio
	 * @param data_fim
	 * @throws Exception
	 */
	public Periodo(int hora_inicio, int min_inicio, int hora_fim, int min_fim, String data_inicio, String data_fim)
			throws Exception {
		this.setInicioTarefa(hora_inicio, min_inicio);
		this.setFimTarefa(hora_fim, min_fim);
		this.setDataInicio(data_inicio);
		this.setDataFim(data_fim);
		// verificacao de seguranca no fim de cada instancia
		this.validaDataHoraFim();
	}

	// METODOS
	/**
	 * Set pro inicio de uma tarefa, instaciada no horario da classe
	 * CalendarioGregoriano
	 * 
	 * @throws Exception
	 */
	public void setInicioTarefa() throws Exception {
		this.inicio_tarefa.setHorario();
	}

	/**
	 * Set padrão pra uma entrada de Horario, classe definida
	 * 
	 * @param _inicio
	 * @throws Exception
	 */
	public void setInicioTarefa(Horario _inicio) throws Exception {
		this.inicio_tarefa = _inicio;
	}

	/**
	 * Set padrão pra uma entrada primitiva de inteiros
	 * 
	 * @param _horas
	 * @param _minutos
	 * @throws Exception
	 */
	public void setInicioTarefa(int _horas, int _minutos) throws Exception {
		this.inicio_tarefa.setHorario(_horas, _minutos);
	}

	/**
	 * Set sem parametros, define o fim da tarefa no fim do dia
	 * 
	 * @throws Exception
	 */
	public void setFimTarefa() throws Exception {
		this.fim_tarefa.setHorario(23, 59);
	}

	/**
	 * Set padrão pra uma entrada de Horario, classe definida
	 * 
	 * @param _fim
	 * @throws Exception
	 */
	public void setFimTarefa(Horario _fim) throws Exception {
		this.inicio_tarefa.setHorario(_fim.getHora(), _fim.getMin());
	}

	/**
	 * Set padrão pra uma entrada primitiva de inteiros
	 * 
	 * @param _horas
	 * @param _minutos
	 * @throws Exception
	 */
	public void setFimTarefa(int _horas, int _minutos) throws Exception {
		this.fim_tarefa.setHorario(_horas, _minutos);
	}

	/**
	 * Set pra Data inicial de uma tarefa a partir de uma instancia gerada da classe
	 * do Calendario Gregoriano
	 * 
	 * @throws Exception
	 */
	public void setDataInicio() throws Exception {
		this.data_inicio.setData();
	}

	/**
	 * Set pra Data final de uma tarefa a partir de uma instancia gerada da classe
	 * do Calendario Gregoriano Caso vazia, gera a partir do mesmo dia da tarefa
	 * inicial
	 * 
	 * @throws Exception
	 */
	public void setDataFim() throws Exception {
		this.data_fim = this.getDataInicio();
	}

	/**
	 * Set padrao de Data inicio pra entradas primitivas de inteiros
	 * 
	 * @param dia
	 * @param mes
	 * @param ano
	 * @throws Exception
	 */
	public void setDataInicio(int dia, int mes, int ano) throws Exception {
		this.data_inicio.setData(dia, mes, ano);
	}

	/**
	 * Set padrao de Data fim pra entradas primitivas de inteiros
	 * 
	 * @param dia
	 * @param mes
	 * @param ano
	 * @throws Exception
	 */
	public void setDataFim(int dia, int mes, int ano) throws Exception {
		this.data_fim.setData(dia, mes, ano);
	}

	/**
	 * Set padrao de Data inicial pra entradas primitivas de Strings
	 * 
	 * @param dataStr
	 * @throws Exception
	 */
	public void setDataInicio(String dataStr) throws Exception {
		this.data_inicio.setData(dataStr);
	}

	/**
	 * Set padrao de Data fim pra entradas primitivas de Strings
	 * 
	 * @param dataStr
	 * @throws Exception
	 */
	public void setDataFim(String dataStr) throws Exception {
		this.data_fim.setData(dataStr);
	}

	/**
	 * Set de entrada Data inicial pra classe Data definida
	 * 
	 * @param _data
	 * @throws Exception
	 */
	public void setDataInicio(Data _data) throws Exception {
		this.data_inicio = _data;
	}

	/**
	 * Set de entrada Data fim pra classe Data definida
	 * 
	 * @param _data
	 * @throws Exception
	 */
	public void setDataFim(Data _data) throws Exception {
		if (_data.compareTo(this.getDataInicio()) == 1) {
			this.data_fim = _data;
		}
		// caso a data de fim, seja maior que a data de inicio, a data de fim recebe a
		// mesma data do inicio
		else
			this.data_fim = this.getDataInicio();
	}

	/**
	 * Get Horario Inicio
	 * 
	 * @return Horario
	 */
	public Horario getHorarioInicio() {
		return this.inicio_tarefa;
	}

	/**
	 * Get Horario Fim
	 * 
	 * @return Horario
	 */
	public Horario getHorarioFim() {
		return this.fim_tarefa;
	}

	/**
	 * Get Data Inicio
	 * 
	 * @return Data
	 */
	public Data getDataInicio() {
		return this.data_inicio;
	}

	/**
	 * Get Data Fim
	 * 
	 * @return Data
	 */
	public Data getDataFim() {
		return this.data_fim;
	}

	/**
	 * Validador de Data&Hora: Verifica se a data final nao é menor que a data
	 * inicial, ou seja, se a data final nao esta antes da data de inicio Caso a
	 * data fim seja maior, ela recebe a data inicio; Após, verifica o horário, se o
	 * horário final for menor que o horário inicial, horario final recebe
	 * 23:59(ultimo horario do dia possivel)
	 * 
	 * @throws Exception
	 */
	public void validaDataHoraFim() throws Exception {
		if (this.getDataFim().compareTo(this.getDataInicio()) == 1) {
			this.setDataFim();
			if (this.getDataFim().compareTo(this.getDataInicio()) == 0) {
				if (this.getDataFim().compareTo(this.getDataInicio()) == 1) {
					this.setFimTarefa();
					return;
				}
			}
		} else
			return;
	}

	/**
	 * Equals
	 * 
	 * @param objeto
	 * @return true/false
	 * @throws Exception
	 */
	public boolean equals(Periodo objeto) throws Exception {
		if (this.getDataInicio().equals(objeto.getDataInicio()) && this.getDataFim().equals(objeto.getDataFim())
				&& this.inicio_tarefa.equals(objeto.getHorarioInicio())
				&& this.fim_tarefa.equals(objeto.getHorarioFim()))
			return true;
		else
			return false;
	}

	/**
	 * toString
	 * 
	 * @return String
	 */
	public String toString() {

		StringBuilder str = new StringBuilder();

		str.append("\nData do inicio da tarefa: " + this.getDataInicio().toString());
		str.append("\nData do fim da tarefa: " + this.getDataFim().toString());
		str.append("\tInicio da tarefa as: " + this.getHorarioInicio().toString());
		str.append("\tFim da tarefa as: ");
		//str.append(this.getHorarioFim().toString()); //nao esta funcionando nao sei pq

		return str.toString();
	}
}
