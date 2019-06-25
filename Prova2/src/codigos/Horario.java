package codigos;

import java.util.GregorianCalendar;

/**
 * Classe Horario
 * 
 * @author Guilherme Stein Kuhn - 21 de Junho
 */
public class Horario {
	private int hora, minutos;

	/**
	 * Construtor padrão Gera uma instancia no horario do calendario gregoriano no
	 * momento;;
	 * 
	 * @throws Exception
	 */
	public Horario() throws Exception {
		this.setHorario();
	}

	/**
	 * Construtor padrão
	 * 
	 * @param _horas
	 * @param _min
	 * @throws Exception
	 */
	public Horario(int _horas, int _min) throws Exception {
		this.setHorario(_horas, _min);
	}

	// Metodos

	/**
	 * Metodo de set que gera a instacia no momento
	 * 
	 * @throws Exception
	 */
	public void setHorario() throws Exception {
		GregorianCalendar gc = new GregorianCalendar();
		@SuppressWarnings("static-access")
		int hora = gc.HOUR, min = gc.MINUTE;
		this.setHorario(hora, min);
	}

	/**
	 * Metodo de set padrao, que gera um horario valido
	 * 
	 * @param _horas
	 * @param _min
	 * @throws Exception
	 */
	public void setHorario(int _horas, int _min) throws Exception {
		if (Horario.isHoraValida(_horas) == true && Horario.isMinutoValido(_min)) {
			this.hora = _horas;
			this.minutos = _min;
		} else
			new Exception("\nHorario invalido");
	}

	/**
	 * Set padrao pra um Horario definido
	 * @param _horario
	 * @throws Exception
	 */
	public void setHorario(Horario _horario)throws Exception {
		if (Horario.isHoraValida(_horario.getHora()) == true && Horario.isMinutoValido(_horario.getMin()) == true) {
			this.hora = _horario.getHora();
			this.minutos = _horario.getMin();
		} else
			new Exception("\nHorario invalido");
	}

	/**
	 * Get da hora padrao
	 * 
	 * @return int
	 */
	public int getHora() {
		return this.hora;
	}

	/**
	 * Get dos minutos
	 * 
	 * @return int
	 */
	public int getMin() {
		return this.minutos;
	}

	/**
	 * Método validador booleano de horas
	 * 
	 * @param _horas
	 * @return boolean
	 */
	public static boolean isHoraValida(int _horas) {
		if (_horas >= 0 && _horas <= 23)
			return true;
		else
			return false;
	}

	/**
	 * Método validador booleano de minutos
	 * 
	 * @param _min
	 * @return boolean
	 */
	public static boolean isMinutoValido(int _min) {
		if (_min >= 0 && _min <= 59)
			return true;
		else
			return false;
	}

	/**
	 * Equals padrão da classe
	 * 
	 * @param objeto
	 * @return boolean
	 */
	public boolean equals(Horario objeto) {
		if (this.getHora() == objeto.getHora() && this.getMin() == objeto.getMin())
			return true;
		else
			return false;
	}

	/**
	 * compareTo padrão da classe
	 * 
	 * @param objeto
	 * @return int
	 */
	public int compareTo(Horario objeto) {
		if (this.getHora() > objeto.getHora())
			return 1;
		if (this.getHora() < objeto.getHora())
			return -1;
		else {
			if (this.getMin() > objeto.getMin())
				return 1;
			if (this.getMin() < objeto.getMin())
				return -1;
			else
				return 0;
		}
	}

	/**
	 * to String padrão da classe
	 * 
	 * @return String
	 */
	public String toString() {
		StringBuilder str = new StringBuilder();

		str.append(this.getHora());
		str.append(":");
		str.append(this.getMin());

		return str.toString();
	}
}
