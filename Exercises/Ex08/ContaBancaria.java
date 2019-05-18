package Ex08;
public class ContaBancaria {
    private String nome;
    private double saldo;
    private final static double taxadefault = 5; //%
    private static double taxa = ContaBancaria.taxadefault;

    public ContaBancaria() {
        this.nome = null;
        this.saldo = 0.00;
    }

    public ContaBancaria(String nome, double saldo) throws Exception {
        this.setName(nome);
        this.setSale(saldo);
    }

    public ContaBancaria(String nome, double saldo, double taxa) throws Exception {
        this.setName(nome);
        this.setSale(saldo);
        ContaBancaria.setTaxa(taxa);
    }

    public void setName(String nome) {
        this.nome = nome;
    }

    public void setSale(double saldo) throws Exception {
        if (saldo >= 0) {
            this.saldo = ContaBancaria.correctSale(saldo);
        } else
            throw new Exception("Saldo negativo!");
    }

    public static void setTaxa(double taxa) throws Exception {
        if (taxa >= 0) {
            ContaBancaria.taxa = taxa * 0.01;
        } else
            throw new Exception("Taxa negativa!");
    }

    public static double correctSale(double saldo) {
        double newsale = (1 - (ContaBancaria.taxa) * 0.01) * saldo;
        return newsale;
    }

    public String getName() {
        return this.nome;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double getTaxa() {
        return ContaBancaria.taxa;
    }

    public static double getTaxaDefault() {
        return ContaBancaria.taxadefault;

    }

    public boolean compareTo(String nome) {
        if (nome.compareToIgnoreCase(getName()) == 0) {
            return true;
        } else
            return false;
    }

    public String toString() {
        return "Nome: " + getName() + "\nSaldo da conta: " + getSaldo() + "\nA qual foi aplicada uma taxa de: "
                + getTaxa();
    }
}
