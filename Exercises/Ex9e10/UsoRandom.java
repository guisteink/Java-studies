package Java.POO.Geometria;

import java.util.Random;



public class UsoRandom {
    public static void main(String[] args) throws Exception {
        Random aleatorio = new Random();
        //System.out.println(num);
        for(int i=1;i<=10;i++){
            int x = aleatorio.nextInt(50);
            int y = aleatorio.nextInt(50);
            Ponto A = new Ponto(x,y);
            System.out.println(A.toStringBuilder());
            System.out.println(A.distanciaDaOrigem());
        }


    }
}
