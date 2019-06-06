package Ex23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LetraC {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String frase;
		int i;
		System.out.println("Digite o texto:");
		frase = new Scanner(System.in).nextLine();
		String[] vet = frase.split(" ");

		List<String> s = new ArrayList<String>();

		for (i = 0; i < (vet.length); i++) {
			s.add(new String(vet[i]));
		}

		Collections.shuffle(s);

		// exibe o conteúdo de cada coleção com o toString nativo:

		System.out.println("Texto embaralhado: " + s);

	}
}