package Task03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);

		System.out.print("First name: ");

		String firstName = name.nextLine();

		System.out.print("Last Name: ");

		String lastName = name.nextLine();

		System.out.print("Age: ");

		short years = name.nextShort();

		System.out.print("Gender: ");

		char Gender = name.next().charAt(0);

		System.out.print("ID: ");

		long id = name.nextLong();

		System.out.print("Number: ");

		long number = name.nextLong();

	}

}
