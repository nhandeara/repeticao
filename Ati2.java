package Repetiçao;

import java.util.Scanner;

public class Ati2 {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		double numero,soma=0,media;
		
		for(int i=0; i <=5; i++) {
			System.out.println("informe o numero");
			numero=ler.nextDouble();
			soma = soma+numero;
			{
			media=soma/5;
			System.out.println("a soma é:" + soma + "e a media é:" + media);
			 
			}
		}

	}

}
