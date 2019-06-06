package Ex23;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class LetraA {
  	@SuppressWarnings("resource")
	public static void main(String[] args) {
  			String frase;
  			int i;
  			System.out.println("Digite o texto:");
  			frase = new Scanner(System.in).nextLine();
  			String[]vet = frase.split(" ");
        	Set<String> s = new TreeSet<String>();
        	
        	for(i=0;i<(vet.length);i++){
        		s.add(new String(vet[i]));
        	}
 
        	// exibe o conteúdo de cada coleção com o toString nativo:
        	System.out.println("Texto ordenado: " + s);
  	}
}