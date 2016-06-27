package Task07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner dig = new Scanner(System.in);

		System.out.print("a= ");

		int a = dig.nextInt();

		boolean var = (a % 5 == 0 && a % 7 == 0);

		System.out.print(var);

	}

}
