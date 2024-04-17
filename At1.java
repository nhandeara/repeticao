package Repetiçao;

import java.util.Scanner;

public class At1 {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		String nome;
		
		
		 for(int i = 0; i <= 5; i++) {
		System.out.println("informe seu nome: ");
		nome=ler.next();
		System.out.println("o seu nome é:" +i);
		 }
		ler.close();
		}
	}


