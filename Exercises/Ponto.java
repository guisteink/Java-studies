public class Ponto {
    private double x, y;
    private final static double LIdefault = 0;
    private final static double LSdefault = 500;
    private static double li = Ponto.LIdefault;
    private static double ls = Ponto.LSdefault;
    public static char[] toString;

    public Ponto() {
        this.x = 0;
        this.y = 0;
    }

    public Ponto(double x, double y) throws Exception {
        this.setx(x);
        this.sety(y);
    }

    public void setx(double x) throws Exception {
        if (x >= Ponto.li && x <= Ponto.ls) {
            this.x = x;
        } else
            throw new Exception("fora do limite");
    }

    public void sety(double y) throws Exception {
        if (y >= Ponto.li && y <= Ponto.ls) {
            this.y = y;
        } else
            throw new Exception("fora do limite");
    }

    public void setPonto(double x, double y) throws Exception {
        this.setx(x);
        this.sety(y);
    }

    public static void setli(double a) {
        Ponto.li = a;
    }

    public static void setls(double b) {
        Ponto.ls = b;
    }

    public double getx() {
        return this.x;
    }

    public double gety() {
        return this.y;
    }

    public static double getli() {
        return Ponto.li;
    }

    public static double getls() {
        return Ponto.ls;
    }

    public Ponto clonar() {
        Ponto Clone = new Ponto();
        Clone.x = this.x;
        Clone.y = this.y;
        return Clone;
    }

    public void swap() throws Exception {
        double aux1 = this.x;
        double aux2 = this.y;
        this.setx(aux2);
        this.sety(aux1);
    }

    public String toString() {
        StringBuffer ponto = new StringBuffer();
        ponto.append(this.x);
        ponto.append(",");
        ponto.append(this.y);
        return "(" + x + "," + y + ")";
    }

}
