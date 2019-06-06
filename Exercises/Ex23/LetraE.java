package Ex23;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LetraE {
  	@SuppressWarnings("resource")
	public static void main(String[] args) {
  			String frase;
  			int i;
  			System.out.println("Digite a sequencia de nomes:");
  			frase = new Scanner(System.in).nextLine();
  			String[]vet = frase.split(" ");
  			
  			Map<String,Integer> s = new TreeMap<String,Integer>(); 
  			
        	for(i=0;i<(vet.length);i++){
        		vet[i] = vet[i].toLowerCase();
        		if (s.containsKey(vet[i])){
        			int contador = s.get(vet[i]);
        			s.put(vet[i], contador+1);
        		}
        		else s.put(vet[i], 1);
        	}
 
        	// exibe o conteúdo de cada coleção com o toString nativo:
        	System.out.println("Ordem: " + s);
  	}
}