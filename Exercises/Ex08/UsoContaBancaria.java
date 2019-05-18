package Ex08;
import javax.swing.JOptionPane;

public class UsoContaBancaria{
    public static void main(String[] args)throws Exception {
        String nome = JOptionPane.showInputDialog("Digite o nome do correntista: ");    
        double saldo = Integer.parseInt(JOptionPane.showInputDialog("Saldo em conta: "));; 
        double taxa = Integer.parseInt(JOptionPane.showInputDialog("Taxa de juros(%): "));
        
        ContaBancaria A01 = new ContaBancaria(nome,saldo,taxa);
        System.out.println(A01.toString());

        ContaBancaria A02 = new ContaBancaria("gui",200,8);
        if(A01.compareTo(A02.getName())==true)System.out.println("[Conta ja existente]"); //teste 
        else System.out.println("[Contas diferentes]");
    }

}