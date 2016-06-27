package Task06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner abc = new Scanner(System.in);

		System.out.print("r= ");

		short r = abc.nextShort();

		System.out.print("P=");

		System.out.println(2 * Math.PI * r);

		System.out.print("S=");

		System.out.print(Math.PI * r * r);

	}

}
