package Ex11a13;

public class Paciente extends Pessoa {
    private String planoS;
    private Data datanasc;

    // construtores
    public Paciente(String nome, String identidade, String datanasc, String planoS) throws Exception {
        super(nome, identidade, datanasc);
        this.setPlano(planoS);
    }
    public Paciente(String nome, String identidade, int diaNasc, int mesNasc, int anoNasc , String planoS)throws Exception{
        super(nome,identidade, diaNasc, mesNasc,anoNasc);
        this.setPlano(planoS);
    }
    public Paciente(String nome, String identidade, Data datanasc, String planoS)throws Exception{
        super(nome, identidade, datanasc);
        this.setPlano(planoS);
    }

    //gets e sets
    public String getPlano(){
        return this.planoS;
    }
    public Data getDatanasc(){
        return this.datanasc;
    }
    public void setPlano(String planoS){
        this.planoS = planoS;
    }
    public void setDatanasc(Data datanasc){
        this.datanasc = datanasc;
    }

    //toString
    public String toString(){
        return super.toString() + ", Plano de saúde: " + this.getPlano();

    }




}