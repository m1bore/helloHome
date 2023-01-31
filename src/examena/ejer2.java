package examena;

import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner k = new Scanner(System.in);
		System.out.println("Type the price :");
		double pri=k.nextDouble();k.nextLine();
		if (pri>100) {
			System.out.println("Final price = "+(pri-pri*0.15));
		}
		else if (pri>50) {
			System.out.println("Final price = "+(pri-pri*0.10));	
		}
		else {
			System.out.println("Final price = "+pri);
		}
	}

}
