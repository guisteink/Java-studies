package Ex17;

public class Coordenada {
	private double c;

	public Coordenada(double _c) throws Exception {
		this.setCoord(c);
	}

	public Coordenada() throws Exception {
		this(0);
	}

	public double getCoor() {
		return this.c;
	}

	public void setCoord(double _c) throws Exception {
		if (_c >= 0) {
			this.c = _c;
		} else {
			throw new Exception("Erro");
		}

	}

	public boolean equals(Object obj) {
		Coordenada aux = (Coordenada) obj;
		if (this.getCoor() == aux.getCoor()) {
			return true;
		}
		return false;
	}

	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append(this.getCoor());
		return s.toString();
	}
}