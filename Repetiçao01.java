package Repetiçao;
import java.util.Scanner;

public class Repetiçao01 {

	public static void main(String[] args) {
		java.util.Scanner ler= new Scanner(System.in);
		int n;
		
		System.out.println("Digite um numero maior que zero: ");
		n=ler.nextInt();
		
		for(int i=0; i <= n ; i++) {
			System.out.println("Numero "+i);
			ler.close();
		}


	}

}
