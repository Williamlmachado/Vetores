package application;

import java.util.Locale;
import java.util.Scanner;

import entities.DadosPensionato;

public class Pensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		DadosPensionato[] vect = new DadosPensionato[10];
		System.out.print("Quantos Quartos Serão Alugados? ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Alguel #" + i + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int room = sc.nextInt();
			vect[room] = new DadosPensionato(name, email);
		}
			System.out.println();
			System.out.println("Busy rooms:");
			for (int i=0; i<10; i++) {
			if (vect[i] != null) {
			System.out.println(i + ": " + vect[i]);
			}
			}
		sc.close();
	
	}

}