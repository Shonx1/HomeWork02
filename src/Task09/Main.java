package Task09;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner dig = new Scanner(System.in);

		System.out.print("a=");

		int a = dig.nextInt();

		System.out.print("b=");

		int b = dig.nextInt();

		System.out.print("Ostatuk:" +(a%2) +" i " +(b%2)); 


	}

}
