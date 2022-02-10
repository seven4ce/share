package Code.Numeric;

import java.util.Scanner;

public class NilaiMaxMin {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("input nilai x : ");
		int x = input.nextInt();

		System.out.println("input nilai n : ");
		int n = input.nextInt();

		int max = 0;
		int min = 0;

		System.out.println("input nilai array : ");
		for (int i = 1; i <= n; i++) {
			int spaces = input.nextInt();

			if (spaces > max) {
				max = spaces;
			} else if (spaces < min) {
				min = spaces;
			}
		}

		System.out.println("Nilai min : " + min);
		System.out.println("Nilai max : " + max);
		input.close();
	}
}
