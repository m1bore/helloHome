package examena;

import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		//V=Math.PI*Mayh.Pow(r,2)*h
		//S=2*Math.Pi*Math.Pow(r,2)+2*Mayh.Pi*r*h

		Scanner k = new Scanner(System.in);
		System.out.println("Write the radius of the cylinder:");
		int r=k.nextInt();k.nextLine();
		System.out.println("Write the height of the cylinder:");
		int h=k.nextInt();k.nextLine();
		if (r>0 && h>0) {
			System.out.println("Erro: the height and the radius must be positive");

		}
		
	}


}
