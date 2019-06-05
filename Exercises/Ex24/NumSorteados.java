package Ex24;

import java.io.Serializable;
import java.util.*;

/**
 * Usada como objeto de teste para compor as classes que encapsulam as cole��es
 * TreeSet.
 * <p>
 * Oferece m�todos de sortear numeros aleatorios sem repedi��es.
 * 
 * @author Guilherme Stein Kuhn
 * @version 1.0 (junho - 2019)
 */
public class NumSorteados implements Serializable {
	/**
	 * Variaveis
	 */
	private TreeSet<Integer> numeros = new TreeSet<Integer>(); // arvore de numeros sorteados
	private final static int FaixaMaxDefault = 99, FaixaInfDefault = 0, QuantDefault = 4;
	private int faixaSup = NumSorteados.FaixaMaxDefault, faixaInf = NumSorteados.FaixaInfDefault,
			quant = NumSorteados.QuantDefault;

	/**
	 * construtor basico para gerar uma treeset aleatoria
	 */
	public NumSorteados() {
		this.sorteia();
	}

	/**
	 * construtor que altera os valores default e gera
	 * 
	 * @param _tam
	 * @param _valormin
	 * @param _valormax
	 */
	public NumSorteados(int _tam, int _valormin, int _valormax) {
		this.setQuant(_tam);
		this.setFaixaInf(_valormin);
		this.setFaixaSup(_valormax);
		this.sorteia();
	}

	/**
	 * 
	 */
	public NumSorteados(int _quant) {
		this.setQuant(_quant);
		this.sorteia();
	}

	/**
	 * metodo pra sortear o numero;;;
	 * 
	 */
	public void sorteiaAntigo() {
		int x, i = 1;
		Random aleatorio = new Random();
		while (i <= this.getQuant()) {
			x = aleatorio.nextInt(this.getFaixaSup());
//			System.out.println("X =" + x + " i" + i);
			if (this.numeros.contains(x) == true)
				i--;
			else {
				this.numeros.add(new Integer(x));
				i++;
			}
		}
	}

	public void sorteia() {
		Integer x, i = this.getQuant();
		Random aleatorio = new Random();
		while (i >= 0) {
			x = aleatorio.nextInt(this.getFaixaSup());
			System.out.println("X =" + x + " i" + i);
			if (this.numeros.contains(x)) i++;
			else {
				this.numeros.add(new Integer(x));
				i--;
			}
		}

	}
	/**
	 * alterar o tamanho da treeset
	 * 
	 * @param _tam
	 */
	public void setQuant(int _tam) {
		if (_tam >= 0)
			this.quant = _tam;
		else
			this.quant = 0;
	}

	/**
	 * alterar o valor maximo da treeset
	 * 
	 * @param _valormax
	 */
	public void setFaixaSup(int _valormax) {
		this.faixaSup = _valormax;
	}

	/**
	 * alterar o valor minimo da treeset
	 * 
	 * @param _valormin
	 */
	public void setFaixaInf(int _valormin) {
		this.faixaInf = _valormin;
	}

	/**
	 * get do valor maximo da treeset
	 * 
	 * @return valor maximo alteravel
	 */
	public int getFaixaSup() {
		return this.faixaSup;
	}

	/**
	 * get do valor minimo da treeset
	 * 
	 * @return valor minimo alteravel
	 */
	public int getFaixaInf() {
		return this.faixaInf;
	}

	/**
	 * get do tamanho alteravel
	 * 
	 * @return tamanho da treeset
	 */
	public int getQuant() {
		return this.quant;
	}

	/**
	 * get do tamanho default da treeset
	 * 
	 * @return o tamanho default da treeset
	 */
	public int getQuantDefault() {
		return this.QuantDefault;
	}

	/**
	 * get do valor maximo
	 * 
	 * @return o valor maximo de um numero sorteado
	 */
	public int getFaixaSupDefault() {
		return this.FaixaMaxDefault;
	}

	/**
	 * get do valor minimo/
	 * 
	 * @return o valor minimo de um numero
	 */
	public int getFaixaInfDefault() {
		return this.FaixaInfDefault;
	}

	/**
	 * pega a treeset de numeros sorteados
	 * 
	 * @return numeros sorteados
	 */

	public TreeSet getNumSorteados() {
		return this.numeros;
	}

	/**
	 * Sobreposi��o do m�todo toString para retornar todo o conte�do dos numeros
	 * sorteados
	 * 
	 * @return retorna uma String com todos os dados
	 */
	public String toString() {
		StringBuilder info = new StringBuilder();
		info.append(this.numeros);
		return info.toString();
	}
}