package Code.Numeric;

import java.util.Scanner;

public class LoopingFibonaci {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Masukan banyak nya deret fibonaci : ");
		int limit = input.nextInt();
		System.out.println();

		int pass = 1, current = 1, fibonaci = 1;

		for (int i = 1; i <= limit; i++) {

			System.out.print(fibonaci + ", ");
			
			fibonaci = current + pass;
			pass = current;
			current = fibonaci;

		}
	}
}
