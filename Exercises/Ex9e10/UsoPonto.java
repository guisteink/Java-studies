package Java.POO.Geometria;

import javax.swing.JOptionPane;
import java.util.Random;

public class UsoPonto {
    public static void main(String[] args) throws Exception {
        System.out.println("(X   ,Y   )");
        double x = Integer.parseInt(JOptionPane.showInputDialog("x: "));
        double y = Integer.parseInt(JOptionPane.showInputDialog("y: "));

        Ponto A = new Ponto(x, y);
        // A.clonar();
        // System.out.println(A.toStringBuilder());
        // System.out.println(A.clonar());
        // A.swap();
        System.out.println(A.toStringBuilder());
        double numero;
        //numero = random.nextDouble() * 100; //NÃºmero aleatÃ³rio de 0 Ã  100

        //Random gerado2 = new Random(20);
       // for (int i = 1; i < 10; i++) {
       //     Random gerado1 = new Random(20);
       //     System.out.println(gerado1);
      //  }

    }

}
