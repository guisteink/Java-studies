package Ex14;

public class Cliente {
    private static final double rendadefault = 2000;
    private int[] celular;
    private String endereco, categoria;
    private double rendafamiliar = Cliente.rendadefault;
    private Contato contato;

    // construtor
    public Cliente(int[] celular, String endereco, double rendafamiliar, Contato contato) {
        this.setCelular(celular);
        this.setEndereco(endereco);
        this.setRenda(rendafamiliar);
        this.setContato(contato);
        this.categoria = categoriaCliente();
    }

    public Cliente(int[] celular, String endereco, int renda) {
        this.setCelular(celular);
        this.setEndereco(endereco);
        this.setRenda(renda);
    }

    // gets e sets
    public void setCelular(int[] celular) {
        if (celularValido(celular) == 1) {
            this.celular = celular;
        }
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setRenda(double renda) {
        this.rendafamiliar = renda;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public String getCategoria() {
    	return this.categoria;
    	
    }
    
    public int[] getCelular() {
        return this.celular;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public double getRenda() {
        return this.rendafamiliar;
    }

    public Contato getContato() {
        return this.contato;
    }

    // metodos
    public String categoriaCliente() {
        if (getRenda() > 2000) {
            return "top";
        } else
            return "usual";
    }

    public int celularValido(int[] celular) {
        if (celular.length == 9) {
            return 1;
        } else
            return 0;
    }

    public int equalsCelular(int[] celular) {
        if (celular == getCelular())
            return 1;
        else
            return 0;
    }

    public int equalsEndereco(String endereco) {
        if (endereco.compareToIgnoreCase(getEndereco()) == 0)
            return 1;
        else
            return 0;
    }

    // tostring
    public String toString() {
        return "\nCelular: " + getCelular() + "\nEndereço: " + getEndereco() + "\nRenda: " + getRenda()
                + contato.toString();
    }

}