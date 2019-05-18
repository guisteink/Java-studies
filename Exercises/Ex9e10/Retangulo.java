package Ex9e10;

public class Retangulo {
	Ponto esquerdosup, direitoinf;

	public Retangulo(double x1, double y1, double x2, double y2) throws Exception {
		this.esquerdosup.setX(x1);
		this.esquerdosup.setY(y1);
		this.direitoinf.setX(x2);
		this.direitoinf.setY(y2);
	}

	public Retangulo(Ponto es, Ponto di) {
		this.esquerdosup = es;
		this.direitoinf = di;
	}

	public Retangulo() throws Exception {
		this.esquerdosup.setX(0.0);
		this.esquerdosup.setY(0.0);
		this.direitoinf.setX(0.0);
		this.direitoinf.setX(0.0);
	}

	// metodos
	public void setEsquerdosup(Ponto a) throws Exception {
		this.esquerdosup.setX(a.getX());
		this.esquerdosup.setY(a.getY());
	}

	public void setDireitoinf(Ponto b) throws Exception {
		this.direitoinf.setX(b.getX());
		this.direitoinf.setY(b.getY());
	}

	public Ponto getEsquerdosup() {
		return this.esquerdosup;
	}

	public Ponto getDireitoinf() {
		return this.direitoinf;
	}

	public double AreaRetangulo() {
		return (esquerdosup.getX() - direitoinf.getX() * (direitoinf.getY() - esquerdosup.getY()));
	}

	public double PerimetroRetangulo() {
		return esquerdosup.getX() + esquerdosup.getY() + direitoinf.getX() + direitoinf.getY();
	}

	public boolean equals(Retangulo a) {
		if (esquerdosup.equals(a.esquerdosup) && direitoinf.equals(a.direitoinf)) {
			return true;
		} else
			return false;
	}

	public boolean equalsArea(Retangulo a) {
		if (this.AreaRetangulo() == a.AreaRetangulo()) {
			return true;
		} else
			return false;
	}

	public int compareTo(Retangulo a) {
		if (this.AreaRetangulo() == a.AreaRetangulo())
			return 0;
		else if (this.AreaRetangulo() > a.AreaRetangulo())
			return -1;
		else
			return 1;
	}

	public String toString() {
		return "esquerdo superior: (" + esquerdosup.getX() + "," + esquerdosup.getY() + ")" + "\ndireito inferior: ("
				+ direitoinf.getX() + "," + direitoinf.getY() + ").";
	}

}