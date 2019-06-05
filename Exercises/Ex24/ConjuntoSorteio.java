package Ex24;

import src.Ex3a8.*;
import java.util.List;

/**
 * 
 * @author Guilherme Stein Kuhn (junho - 2019)
 * @version 1.0
 *
 */
public class ConjuntoSorteio {
	private List<Sorteio> grupoSorteado;
	private int qtdSorteios = 0;

	/**
	 * 
	 * @param _grupoSorteado
	 * @throws Exception 
	 */
	public ConjuntoSorteio() throws Exception {
		this.grupoSorteado = (List<Sorteio>) this.insere();
		this.qtdSorteios = this.qtdSorteios++;
	}

	/**
	 * 
	 * @param _qtd
	 * @throws Exception
	 */
	public ConjuntoSorteio(int _qtdSorteios) throws Exception {
		this.grupoSorteado = (List<Sorteio>) this.insere(_qtdSorteios);
		this.qtdSorteios = _qtdSorteios + this.qtdSorteios++;
	}

	/**
	 * @throws Exception
	 * 
	 */
	public ConjuntoSorteio(Data _data, int _qtdSorteios, int _quant, int _valormin, int _valormax) throws Exception {
		this.grupoSorteado = (List<Sorteio>) this.insere(_data, _qtdSorteios, _quant, _valormin, _valormax);
		this.qtdSorteios = _qtdSorteios + this.qtdSorteios++;
	}

	public List<Sorteio> insere() throws Exception {
		this.grupoSorteado.add(new Sorteio());
		return this.grupoSorteado;
	}

	/**
	 * Esse metodo, insere n sorteios na lista, que foram feitos em uma só data
	 * passada.
	 * 
	 * @param _qtdSorteios
	 * @param _data
	 * @return
	 * @throws Exception
	 */
	public List<Sorteio> insere(int _qtdSorteios, Data _data) throws Exception {
		for (int i = 0; i < _qtdSorteios; i++) {
			this.grupoSorteado.add(new Sorteio(_data));
		}
		return this.grupoSorteado;
	}

	/**
	 * Esse metodo, insere n sorteios, numa data padrao
	 * 
	 * @param _qtdSorteios
	 * @return
	 * @throws Exception
	 */
	public List<Sorteio> insere(int _qtdSorteios) throws Exception {
		for (int i = 0; i < _qtdSorteios; i++) {
			Sorteio novo = new Sorteio();
			this.grupoSorteado.add(novo);
		}
		return this.grupoSorteado;
	}

	/**
	 * Esse metodo, insere 1 sorteio, em uma data passada
	 * 
	 * @param _data
	 * @return
	 * @throws Exception
	 */
	public List<Sorteio> insere(Data _data) throws Exception {
		Sorteio novo = new Sorteio(_data);
		this.grupoSorteado.add(novo);
		return this.grupoSorteado;
	}

	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<Sorteio> insere(Data _data, int qtdSorteios, int _quant, int _valormin, int _valormax)
			throws Exception {
		for (int i = 0; i < qtdSorteios; i++) {
			Sorteio novo = new Sorteio(_data, _quant, _valormin, _valormax);
			this.grupoSorteado.add(novo);
		}
		return this.grupoSorteado;
	}

	/**
	 * 
	 * adiciona mais n sorteios 
	 * @param _novaqtd
	 * @throws Exception 
	 */
	public void setQtdSorteios(int _novaqtdSorteios) throws Exception {
		if (this.getQtdSorteios() < _novaqtdSorteios) {
			this.insere((this.getQtdSorteios()) - (_novaqtdSorteios));
		} else
			return;
	}

	/**
	 * 
	 * @return
	 */
	public List<Sorteio> getGrupoSorteado() {
		return this.grupoSorteado;
	}

	/**
	 * 
	 * @return
	 */
	public int getQtdSorteios() {
		return this.qtdSorteios;
	}

	/**
	 * 
	 */
	public String toString() {
		return this.grupoSorteado.toString() + "quantidade de sorteios: " + this.getQtdSorteios();
	}

}