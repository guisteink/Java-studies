package codigos;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Classe Agenda
 * 
 * @author Guilherme Stein Kuhn - 21 de Junho
 */
public class Agenda {
	private List<ItemAgenda> itens_agenda;

	// CONSTRUTORES
	/**
	 * Construtor padrao instanciando uma lista de Itens Agenda
	 */
	public Agenda() {
		this.itens_agenda = new LinkedList<ItemAgenda>();
	}

	/**
	 * Construtor padrao pra uma lista de itens agenda passadas como parametro
	 * 
	 * @param _itens
	 */
	public Agenda(List<ItemAgenda> _itens) {
		this.setAgenda(_itens);
	}

	// METODOS
	/**
	 * Set padrao pra lista de itens agenda
	 * 
	 * @param _itens
	 */
	public void setAgenda(List<ItemAgenda> _itens) {
		this.itens_agenda = _itens;
	}

	/**
	 * Set padrao pra uma lista instanciada
	 * 
	 * @throws Exception
	 */
	public void setAgenda() throws Exception {
		this.itens_agenda = new LinkedList<ItemAgenda>();
	}

	/**
	 * Get da lista de itens agenda
	 * 
	 * @return List
	 */
	public List<ItemAgenda> getAgenda() {
		return this.itens_agenda;
	}

	/**
	 * Metodo pra inserçao de itens na agenda
	 * 
	 * @param _item
	 * @throws Exception
	 */
	public void insere(ItemAgenda _item) throws Exception {
		this.getAgenda().add(_item);
	}

	/**
	 * Metodo pra remocao de itens constidos na agenda
	 * 
	 * @param _item
	 * @throws Exception
	 */
	public void remove(ItemAgenda _item) throws Exception {
		if (this.getAgenda().contains(_item) == true) {
			this.getAgenda().remove(_item);
		} else
			new Exception("\nItem não esta contido na agenda.");
	}

	/**
	 * Metodo que gera uma lista de elementos que esta entre duas datas de tarefas
	 * passadas
	 * 
	 * @param dt_inicio
	 * @param dt_fim
	 * @return List
	 * @throws Exception
	 */
	public List<ItemAgenda> IntervaloDeData(Data dt_inicio, Data dt_fim) throws Exception {
		int i;
		List<ItemAgenda> itens_data = new LinkedList<ItemAgenda>();
		for (i = 0; i < this.itens_agenda.size(); i++) {
			if (this.itens_agenda.get(i).getPeriodo().getDataInicio().compareTo(dt_inicio) == 1
					&& this.itens_agenda.get(i).getPeriodo().getDataFim().compareTo(dt_fim) == 1) {
				itens_data.add(this.itens_agenda.get(i));
			}
		}
		return itens_data;
	}

	/**
	 * Metodo pra retornar uma lista de itens Meta
	 * 
	 * @return List
	 */
	public List<Meta> itensMetas() {
		int i;
		List<Meta> itens_metas = new LinkedList<Meta>();
		for (i = 0; i < this.itens_agenda.size(); i++) {
			if (this.itens_agenda.get(i).getClass().toString().equalsIgnoreCase("class codigos.Meta")) {
				itens_metas.add((Meta) this.itens_agenda.get(i));
			}
		}
		Collections.sort(itens_metas);
		return itens_metas;
	}

	/**
	 * Metodo pra retornar uma lista de Lembretes
	 * 
	 * @return List
	 */
	public List<Lembrete> itensLembretes() {
		int i;
		List<Lembrete> itens_lembretes = new LinkedList<Lembrete>();
		for (i = 0; i < this.itens_agenda.size(); i++) {
			if (this.itens_agenda.get(i).getClass().toString().equalsIgnoreCase("class codigos.Lembrete")) {
				itens_lembretes.add((Lembrete) this.itens_agenda.get(i));
			}
		}
		Collections.sort(itens_lembretes);
		return itens_lembretes;
	}

	/**
	 * Metodo pra retornar uma lista de Eventos
	 * 
	 * @return List
	 */
	public List<Evento> itensEventos() {
		int i;
		List<Evento> itens_eventos = new LinkedList<Evento>();
		for (i = 0; i < this.itens_agenda.size(); i++) {
			if (this.itens_agenda.get(i).getClass().toString().equalsIgnoreCase("class codigos.Evento")) {
				itens_eventos.add((Evento) this.itens_agenda.get(i));
			}
		}
		Collections.sort(itens_eventos);
		return itens_eventos;
	}

	/**
	 * equals padrao pra agenda, de acordo com seu tamanho
	 * 
	 * @param objeto
	 * @return boolean
	 * @throws Exception
	 */
	public boolean equals(Agenda objeto) throws Exception {
		if (this.getAgenda().size() == objeto.getAgenda().size())
			return true;
		else
			return false;
	}

	/**
	 * compareTo, de acordo com o tamanho da agenda
	 * 
	 * @param objeto
	 * @return int
	 * @throws Exception
	 */
	public int compareTo(Agenda objeto) throws Exception {
		if (this.getAgenda().size() > objeto.getAgenda().size())
			return 1;
		if (this.getAgenda().size() < objeto.getAgenda().size())
			return -1;
		else
			return 0;
	}

	/**
	 * toString padrao da classe
	 * 
	 * @return String
	 */
	public String toString() {
		return this.getAgenda().toString();
	}
}
