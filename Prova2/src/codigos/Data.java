package codigos;

import java.util.GregorianCalendar;

/**
 * Classe Data
 * 
 * @author Guilherme Stein Kuhn - 21 de Junho
 */
public class Data {
	private int dia, mes, ano;

	// CONSTRUTORES
	/**
	 * Construtor padrão para inteiros
	 * 
	 * @param _dia
	 * @param _mes
	 * @param _ano
	 * @throws Exception
	 */
	public Data(int _dia, int _mes, int _ano) throws Exception {
		this.setData(_dia, _mes, _ano);
	}

	/**
	 * Construtor padrão pra datas em Strings
	 * 
	 * @param _dtStr
	 * @throws Exception
	 */
	public Data(String _dtStr) throws Exception {
		this.setData(_dtStr);
	}

	/**
	 * Construtor padrão pra datas instanciadas no momento
	 * 
	 * @throws Exception
	 */
	public Data() throws Exception {
		this.setData();
	}

	// MÉTODOS
	/**
	 * Get padrão pra dia
	 * 
	 * @return int
	 */
	public int getDia() {
		return this.dia;
	}

	/**
	 * Get padrão pra mês
	 * 
	 * @return int
	 */
	public int getMes() {
		return this.mes;
	}

	/**
	 * Get padrão pra ano
	 * 
	 * @return int
	 */
	public int getAno() {
		return this.ano;
	}

	/**
	 * Set que instancia um GregorianCalendar e passa pro setData;
	 * 
	 * @throws Exception
	 */
	public void setData() throws Exception {
		GregorianCalendar gc = new GregorianCalendar();
		@SuppressWarnings("static-access")
		int dia = gc.DAY_OF_MONTH, mes = gc.MONTH, ano = gc.YEAR;
		this.setData(dia, mes, ano);
	}

	/**
	 * Set padrão pra data em inteiros
	 * 
	 * @param _dia
	 * @param _mes
	 * @param _ano
	 * @throws Exception
	 */
	public void setData(int _dia, int _mes, int _ano) throws Exception {
		if (Data.isDataValida(_dia, _mes, _ano)) {
			this.dia = _dia;
			this.mes = _mes;
			this.ano = _ano;
		} else {
			throw new Exception("Data invalida.");
		}
	}

	/**
	 * Set padrão pra data em Strings
	 * 
	 * @param dtStr
	 * @throws Exception
	 */
	public void setData(String dtStr) throws Exception {
		int _dia, _mes, _ano, cont;
		cont = dtStr.indexOf("/");
		// Formato: "dd"
		if (cont == 2) {
			// converte a string nas posicoes 1 e 2, para o dia
			_dia = Integer.parseInt(dtStr.substring(0, 2));
			cont = dtStr.indexOf("/", 3);
			// Formato: "dd/m/aaaa"
			if (cont == 4) {
				// converte as strings de mes e ano, caso tenha informado mes com 1 posicao
				_mes = Integer.parseInt(dtStr.substring(3, 4));
				_ano = Integer.parseInt(dtStr.substring(5, 9));
			} else { // Formato: "dd/mm/aaaa"
				// converte as stirngs de mes e ano, caso tenha informado mes com 2 posicoes
				_mes = Integer.parseInt(dtStr.substring(3, 5));
				_ano = Integer.parseInt(dtStr.substring(6, 10));
			}
			// Formato: "d"
		} else {
			_dia = Integer.parseInt(dtStr.substring(0, 1));
			cont = dtStr.indexOf("/", 2);
			// Formato: "d/m/aaaa"
			if (cont == 3) {
				_mes = Integer.parseInt(dtStr.substring(2, 3));
				_ano = Integer.parseInt(dtStr.substring(4, 8));
			} else { // Formato: "d/mm/aaaa"
				_mes = Integer.parseInt(dtStr.substring(2, 4));
				_ano = Integer.parseInt(dtStr.substring(5, 9));
			}
		}
		this.setData(_dia, _mes, _ano);
	}

	/**
	 * Equals padrão
	 * 
	 * @param objeto
	 * @return boolean
	 */
	public boolean equals(Data objeto) {
		if (this.getDia() == objeto.getDia() && this.getMes() == objeto.getMes() && this.getAno() == objeto.getAno()) {
			return true;
		}
		return false;
	}

	/**
	 * compareTo padrão
	 * 
	 * @param _data
	 * @return int
	 * @throws Exception
	 */
	public int compareTo(Data _data) throws Exception {
		if (this.getAno() > _data.getAno()) {
			return 1;
		}
		if (this.getAno() < _data.getAno()) {
			return -1;
		} else {
			if (this.getMes() > _data.getMes()) {
				return 1;
			}
			if (this.getMes() < _data.getMes()) {
				return -1;
			} else {
				if (this.getDia() > _data.getDia()) {
					return 1;
				}
				if (this.getDia() < _data.getDia()) {
					return -1;
				} else
					return 0;

			}
		}
	}

	/**
	 * Método pra validar datas com entradas em inteiros Defini entradas de anos a
	 * partir de 1800.
	 * 
	 * @param d
	 * @param m
	 * @param a
	 * @return boolean
	 * @throws Exception
	 */
	public static boolean isDataValida(int d, int m, int a) throws Exception {
		if ((d < 1 || d > 31) || (m < 1 || m > 12) || (a < 1800)
				|| ((m == 4 || m == 6 || m == 9 || m == 11) && (d > 30)) || (m == 2 && d >= 29))
			return false;
		else
			return true;
	}

	/**
	 * toString padrão
	 * 
	 * @return String
	 */
	public String toString() {

		StringBuilder str = new StringBuilder();
		str.append(this.getDia());
		str.append("/");
		str.append(this.getMes());
		str.append("/");
		str.append(this.getAno());
		return str.toString();
	}

}
