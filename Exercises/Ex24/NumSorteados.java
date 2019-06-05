package Ex24;

import java.io.Serializable;
import java.util.*;

/**
 * Usada como objeto de teste para compor as classes que encapsulam as coleções
 * TreeSet.
 * <p>
 * Oferece métodos de sortear numeros aleatorios sem repedições.
 * 
 * @author Guilherme S. Kuhn
 * @version 1.0 (junho - 2019)
 */
public class NumSorteados implements Serializable{
	private TreeSet<Integer> numeros; // arvore de numeros sorteados
	int valormax = NumSorteados.ValorMaxDefault, valormin = NumSorteados.ValorMinDefault, tamanho = NumSorteados.TamMaxDefault;
	private final static int ValorMaxDefault = 99, ValorMinDefault = 0, TamMaxDefault = 4;

	/**
	 * construtor basico para gerar uma treeset aleatoria
	 */
	public NumSorteados() {
		for (int i = 1; i <= this.getTam(); i++) {
			
		}
	}

	/**
	 * construtor que altera os valores default e gera
	 * @param _tam
	 * @param _valormin
	 * @param _valormax
	 */
	public NumSorteados(int _tam, int _valormin, int _valormax) {
		this.setTamanho(_tam);
		this.setValormin(_valormin);
		this.setValormax(_valormax);
		for(int i = 1; i<=this.getTam();i++) {
			this.numeros.add((int) (Math.random() * this.getValormax()));
		}
	}
	
	/**
	 * alterar o tamanho da treeset
	 * @param _tam
	 */
	public void setTamanho(int _tam) {
		if (_tam >= 0)
			this.tamanho = _tam;
		else
			this.tamanho = 0;
	}

	/**
	 * alterar o valor maximo da treeset
	 * @param _valormax
	 */
	public void setValormax(int _valormax) {
		this.valormax = _valormax;
	}
	
	/**
	 * alterar o valor minimo da treeset
	 * @param _valormin
	 */
	public void setValormin(int _valormin) {
		this.valormin = _valormin;
	}

	/**
	 * get do valor maximo da treeset
	 * @return valor maximo alteravel
	 */
	public int getValormax() {
		return this.valormax;
	}
	
	/**
	 * get do valor minimo da treeset
	 * @return valor minimo alteravel
	 */
	public int getValormin() {
		return this.valormin;
	}
	
	/**
	 * get do tamanho alteravel
	 * @return tamanho da treeset
	 */
	public int getTam() {
		return this.tamanho;
	}

	/**
	 * get do tamanho default da treeset
	 * @return o tamanho default da treeset
	 */
	public int getTamdefault() {
		return this.TamMaxDefault;
	}
	
	/**
	 * get do valor maximo
	 * @return o valor maximo de um numero sorteado
	 */
	public int getValorMaxDefault() {
		return this.ValorMaxDefault;
	}
	
	/**
	 *	get do valor minimo/
	 * @return o valor minimo de um numero 
	 */
	public int getValorMinDefault() {
		return this.ValorMinDefault;
	}
	
	/**
	 * pega a treeset de numeros sorteados 
	 * @return numeros sorteados
	 */
	
	public TreeSet getNumSorteados() {
		return this.numeros;
	}
	
	/**
	 * Sobreposição do método toString para retornar todo o conteúdo dos 
	 * numeros sorteados
	 * @return retorna uma String com todos os dados
	 */
	public String toString() {
		return this.numeros.toString();
	}
	
}
