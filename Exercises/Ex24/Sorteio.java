package Ex24;

import src.Ex3a8.*;

/**
 * 
 * @author Guilherme Stein Kuhn (junho - 2019)
 * @version 1.0
 */
public class Sorteio{
	private NumSorteados sorteio;
	private Data dataSort;
	
	/**
	 * construtor padrao
	 */
	public Sorteio() throws Exception{
		this.setNumSort();
		this.setData();
	}
	
	/**
	 * construtor que precisa gerar um sorteio, inicia a classe numa data padrao. 
	 */
	public Sorteio(Data _data) throws Exception{
		this.setNumSort();
		this.setData(_data);
	}
	
	/**
	 * constroi o sorteio de acordo com os parametros
	 * @param _data
	 */
	public Sorteio(Data _data, int _quant, int _valormin, int _valormax) throws Exception{
		this.setNumSort(_quant, _valormin, _valormax);
		this.setData(_data);
	}

	/**
	 * 
	 * @throws Exception
	 */
	public void setData()throws Exception{
		this.dataSort = new src.Ex3a8.Data(1,1,1900); //padrao
	}
	
	/**
	 * 
	 * @param _data
	 */
	public void setData(Data _data) throws Exception{
		this.dataSort.setData(_data.getDia(), _data.getMes(), _data.getAno());
	}
	
	public void setNumSort(int _quant , int _valormin, int _valormax) {
		this.sorteio = new NumSorteados(_quant,_valormin,_valormax);
	}
	
	/**
	 * 
	 * @param numSort
	 */
	public void setNumSort(NumSorteados _numSort) {
		this.sorteio = _numSort;
	}
	
	/**
  	 * Sobrecarregamento do set para modificar o numero sorteado
  	 * @param _quant quantidade de numeros sorteados
  	 */
	
	public void setNumSort(int quant) {
		this.sorteio = new NumSorteados(quant);
	}
	
	/**
  	 * Sobrecarregamento do set para modificar o numero sorteado com valor default
  	 * 
  	 */
	
	public void setNumSort() {
		this.sorteio = new NumSorteados();
	}
	
	
	/**
	 * 
	 */
	public String toString() {
		return this.sorteio.toString() + this.dataSort.toString();		
	}
}