package teste;

import java.util.Scanner;

public class testescanner {

	public static void main(String[] args) {
		String valorString = "";
		int valorint = 0;
		Scanner entradaScanner = new Scanner(System.in);
		System.out.print("numero: ");
		valorint = entradaScanner.nextInt();
		System.out.print("nome : ");
		valorString = entradaScanner.nextLine();
		
		
	System.out.println(valorint + valorString);
		
		
		
		
		
		
		
		entradaScanner.close();
		
	}
}
