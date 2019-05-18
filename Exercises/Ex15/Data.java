package Ex15;

import java.sql.Date;

public class Data {
	Date data;

	@SuppressWarnings("deprecation")
	public void setMonth(String month) {
		if (month.equalsIgnoreCase("janeiro") == true)
			data.setMonth(0);
		if (month.equalsIgnoreCase("fevereiro") == true)
			data.setMonth(1);
		if (month.equalsIgnoreCase("março") == true)
			data.setMonth(2);
		if (month.equalsIgnoreCase("abril") == true)
			data.setMonth(3);
		if (month.equalsIgnoreCase("maio") == true)
			data.setMonth(4);
		if (month.equalsIgnoreCase("junho") == true)
			data.setMonth(5);
		if (month.equalsIgnoreCase("julho") == true)
			data.setMonth(6);
		if (month.equalsIgnoreCase("agosto") == true)
			data.setMonth(7);
		if (month.equalsIgnoreCase("setembro") == true)
			data.setMonth(8);
		if (month.equalsIgnoreCase("outubro") == true)
			data.setMonth(9);
		if (month.equalsIgnoreCase("novembro") == true)
			data.setMonth(10);
		if (month.equalsIgnoreCase("dezembro") == true)
			data.setMonth(11);
		else
			return;
	}

	@SuppressWarnings("deprecation")
	public Date incrementaDays(int x) {
		int a = this.data.getDay();
		a = a + x;
		if (a <= 30)
			this.data.setDate(a);
		return this.data;
	}

	public int diferentDate(Date data2) {
		int x = (int) this.data.getTime();
		int y = (int) data2.getTime();
		x = x / (1000 * 60 * 24); // data em dias
		y = y / (1000 * 60 * 24);

		return x - y;
	}

	public int diferentDate(Date data1, Date data2) {
		int x = (int) data1.getTime();
		int y = (int) data2.getTime();
		x = x / (1000 * 60 * 24); // data em dias
		y = y / (1000 * 60 * 24);
		return x - y;
	}

	@SuppressWarnings("deprecation")
	public String getMonth() {
		if (data.getMonth() == 0)
			return "janeiro";
		if (data.getMonth() == 1)
			return "fevereiro";
		if (data.getMonth() == 2)
			return "março";
		if (data.getMonth() == 3)
			return "abril";
		if (data.getMonth() == 4)
			return "maio";
		if (data.getMonth() == 5)
			return "junho";
		if (data.getMonth() == 6)
			return "julho";
		if (data.getMonth() == 7)
			return "agosto";
		if (data.getMonth() == 8)
			return "setembro";
		if (data.getMonth() == 9)
			return "outubro";
		if (data.getMonth() == 10)
			return "novembro";
		if (data.getMonth() == 11)
			return "dezembro";
		else
			return "mes inválido";
	}
}
