package Code.Numeric;

import java.util.Scanner;

public class PlusMinus {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int plus = 0, minus = 0, zero = 0, n = 0;
		n = Integer.parseInt(input.nextLine());
		int array[] = new int[n];

		String line = input.next();
		line = line.concat(input.nextLine());
		String[] numberStr = line.split("\\s+");

		for (int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(numberStr[i]);
			if (array[i] > 0) {
				plus++;
			} else if (array[i] < 0) {
				minus++;
			} else {
				zero++;
			}
		}

		Double valuePlus = (((double) plus) / n);
		Double valueMinus = (((double) minus) / n);
		Double valueZero = (((double) zero) / n);
		System.out.printf("%.6f", valuePlus);
		System.out.println();
		System.out.printf("%.6f", valueMinus);
		System.out.println();
		System.out.printf("%.6f", valueZero);
		input.close();

	}
}
