package Ex14;

public class Contato {
    private String nome;
    private Email descr;

    // construtor
    public Contato(String nome, String descr) {
        this.setNome(nome);
        this.setDescr(descr);
    }

    public Contato(String nome) {
        this.setNome(nome);
    }

    public Contato(Email descr) {
        this.descr = descr;
    }

    // sets e gets
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescr(String descr) {
        this.descr = new Email(descr);
    }

    public void setDescr(Email descr) {
        this.descr = descr;
    }

    public String getNome() {
        return this.nome;
    }

    public Email getDescr() {
        return this.descr;
    }

    public int equalsNome(String nome) {
        if (nome.compareToIgnoreCase(getNome()) == 0)
            return 1;
        else
            return 0;
    }

    // toString
    public String toString() {
        return "Nome: " + getNome() + "\nEmail: " + getDescr();
    }

}