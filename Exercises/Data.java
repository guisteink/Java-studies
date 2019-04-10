import javax.swing.JOptionPane;
import java.util.Scanner;

public class Data {

	private int dia, mes, ano;

	public Data(int dia, String mesStr, int ano) {
		this.setData(dia,mesStr,ano);
	}

	public Data(String data) {
		String s[] = data.split("/");
		// System.out.println(s);
		this.dia = Integer.parseInt(s[0]);
		this.mes = Integer.parseInt(s[1]);
		this.ano = Integer.parseInt(s[2]);
	}

	public static int converte(String mes) {
		int numMes = 0;
		if (mes.compareToIgnoreCase("janeiro") == 0) {
			numMes = 1;
		} else if (mes.compareToIgnoreCase("fevereiro") == 0) {
			numMes = 2;
		} else if (mes.compareToIgnoreCase("março") == 0) {
			numMes = 3;
		} else if (mes.compareToIgnoreCase("abril") == 0) {
			numMes = 4;
		} else if (mes.compareToIgnoreCase("maio") == 0) {
			numMes = 5;
		} else if (mes.compareToIgnoreCase("junho") == 0) {
			numMes = 6;
		} else if (mes.compareToIgnoreCase("julho") == 0) {
			numMes = 7;
		} else if (mes.compareToIgnoreCase("agosto") == 0) {
			numMes = 8;
		} else if (mes.compareToIgnoreCase("setembro") == 0) {
			numMes = 9;
		} else if (mes.compareToIgnoreCase("outubro") == 0) {
			numMes = 10;
		} else if (mes.compareToIgnoreCase("novembro") == 0) {
			numMes = 11;
		} else if (mes.compareToIgnoreCase("dezembro") == 0) {
			numMes = 12;
		}
		return numMes;
	}

	public void setData(int dia, int mes, int ano) {

		if (valida(dia, mes, ano) == true) {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		} else {
			this.dia = 01;
			this.mes = 01;
			this.ano = 1900;
		}
	}

	public void setData(int dia, String mes, int ano) {
		int x = converte(mes);
		this.setData(dia, x, ano);
		return;
	}

	public static boolean valida(int dia, int mes, int ano) {
		if (ano >= 1581) {
			if (dia > 0 && dia <= 31) {
				if (mes == 2) {
					if (isBissexto(ano)) {
						if (dia <= 29) {
							return true;
						} else {
							return false;
						}
					}
				}
				if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8
						|| mes == 10 || mes == 12) {
					return true;
				} else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11)
						&& dia < 31) {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean isBissexto(int ano) {
		if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
			// System.out.println("ANO BISSEXTO");
			return true;
		} else {
			return false;
		}
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}

	public void print(String s) {
		System.out.println(s);
	}

	public void print(int s) {
		System.out.println(s);
	}
}
