package examena;

import java.util.Scanner;

public class ejer5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner k = new Scanner(System.in);
		System.out.println("Type some word and two numbers(Ex:hello 4 3):");
		String todo =k.nextLine();
		if (todo.indexOf(" ")<3) {
			System.out.println("The valid positions for the String are between 0 and "+todo.length());
		}
		else {
			System.out.println(todo.substring(todo.indexOf(" ")+1));
			if (todo.equalsIgnoreCase(todo.toLowerCase())) {
				System.out.println("All the letters are in lowercase");
			}
			else {
				System.out.println("Not all the letters are in lowercase");
			}
		}
		
	}
}
