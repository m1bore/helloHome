package examena;

import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner k = new Scanner(System.in);
		System.out.println("Type your note in reading :");
		double rea=k.nextDouble();k.nextLine();
		System.out.println("Type your note in writing :");
		double wri=k.nextDouble();k.nextLine();
		System.out.println("Type your note in listening :");
		double lis=k.nextDouble();k.nextLine();
		System.out.println("Type your note in speaking :");
		double spe=k.nextDouble();k.nextLine();
		if (rea>=5 && wri>=5 && lis>=5 && spe>=5) {
			double ave=(rea+wri+lis+spe)/4;
			if (ave>=6) {
				System.out.println("pass");
			}
			else {
				System.out.println("fail");
			}
		}
		else {
			System.out.println("You have failed");
		}
	}

}
