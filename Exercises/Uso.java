import javax.swing.JOptionPane;
 
 
public class Uso {
 
    public static void main(String[] args) {
        // data2 g = new data2(01, 01, 1900);
        // data2 g = new data2("01/01/1900");
        // data2 g = new data2(01, "janeiro", 1900);
        // data2 g = new data2(01, 1900);
        
        String dataxx = JOptionPane.showInputDialog("Digite a data: ");
        
        //int dia = Integer.parseInt(JOptionPane.showInputDialog("Dia: "));
        //String mes = JOptionPane.showInputDialog("Mes: ");
        //int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano: "));
        Data g = new Data(dataxx);
 
        System.out.println(g.toString());
    }
 
 
}
