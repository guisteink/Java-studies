package Ex14;

public class Email {
    private String descr;

    // construtor
    public Email(String descr) {
        this.setEmail(descr);
    }

    // get
    public String getEmail() {
        return this.descr;
    }

    // set
    public void setEmail(String descr) {
        if (isValido(descr) == 1) {
            this.descr = descr;
        }
    }

    // metodos
    public int isValido(String descr) {
        for (int i = 1; i < descr.length(); i++) {
            if (descr.compareTo("@") == 0) {
                if (descr.compareTo(".") == 0) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public int equalsDescr(String descr) {
        if (descr.compareToIgnoreCase(getEmail()) == 0)
            return 1;
        else
            return 0;

    }

    public String toString() {
        return "Email: " + getEmail();
    }
}