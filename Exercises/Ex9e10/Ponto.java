package Ex9e10;

public class Ponto {
	private double x, y;
	public static final double li_DEFAULT = 0;
	public static final double ls_DEFAULT = 500;
	private static double li = Ponto.li_DEFAULT;
	private static double ls = Ponto.ls_DEFAULT;

	public Ponto() throws Exception {
		this(0, 0);
	}

	Ponto(double x, double y) throws Exception {
		this.setX(x);
		this.setY(y);
	}

	public static boolean isLimite(double coordenada) {
		return coordenada >= Ponto.li && coordenada <= Ponto.ls;
	}

	public void setX(double x) throws Exception {
		if (Ponto.isLimite(x))
			this.x = x;
		else
			throw new Exception("valor de x fora dos limites");
	}

	public void setY(double y) throws Exception {
		if (Ponto.isLimite(y))
			this.y = y;
		else
			throw new Exception("valor de y fora dos limites");
	}

	public double getX() {
		return this.x;
	}

	public double getY() {
		return this.y;
	}

	public static double getli() {
		return Ponto.li;
	}

	public static double getls() {
		return Ponto.ls;
	}

	public static void setli(double inferior) {
		Ponto.li = inferior;
	}

	public static void setls(double superior) {
		Ponto.ls = superior;
	}

	public static double getls_DEFAULT() {
		return ls_DEFAULT;
	}
	
	public static double getli_DEFAULT() {
		return li_DEFAULT;
	}

	public Ponto clonar() throws Exception {
		return new Ponto(this.getX(), this.getY());
	}

	public Ponto criaSwap() throws Exception {
		return new Ponto(this.getY(), this.getX());
	}

	public boolean EixoComum(Ponto a) {
		return this.getX() == a.getX() || this.getY() == a.getY();
	}

	static public double distancia(double x1, double y1, double x2, double y2) {
		return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
	}

	public double distancia(Ponto a) {
		return Ponto.distancia(this.getX(), this.getY(), a.getX(), a.getY());
	}

	public double distancia(double x, double y) {
		return Ponto.distancia(this.getX(), this.getY(), x, y);
	}

	public double distanciaDaOrigem() {
		return Ponto.distancia(this.getX(), this.getY(), 0, 0);
	}

	public int compareTo(Ponto a) {
		if (this.distanciaDaOrigem() > a.distanciaDaOrigem())
			return 1;
		else if (this.distanciaDaOrigem() < a.distanciaDaOrigem())
			return -1;
		else
			return 0;
	}

	public boolean equals(Ponto a) {
		if(getX() == a.x && getY() == a.y)return true;
		else return false;
	}


	public String toString() {
		StringBuilder coordenada = new StringBuilder();
		coordenada.append("(");
		coordenada.append(this.getX());
		coordenada.append(",");
		coordenada.append(+this.getY());
		coordenada.append(")");
		return coordenada.toString();
	}
}
