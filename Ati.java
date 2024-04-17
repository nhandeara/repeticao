package Repetiçao;

import java.util.Scanner;

public class Ati {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
	    int nf;
	    
	    System.out.println("informe o o numero final");
	    nf =ler.nextInt();
	    
	
	    for(int i=0; i<=nf; i++) {
	    if(i % 2 !=0) {
	    System.out.println("os numeros são impares de " + 0 + " a " + nf + " : " + i);
	    }
	}
	    
	    ler.close();
	}

}
