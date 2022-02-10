package Code.Numeric;

import java.util.Scanner;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int max = 0, count = 0;
		int array[] = new int[n];

		max = array[0];
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
			if (array[i] > max) {
				max = array[i];
				System.out.println("max === " + max);
			}
		}
	
		for (int i = 0; i < array.length; i++) {
			if (array[i] == max) {
				count++;
				System.out.println("=== " + max);
			}
		}

		System.out.println("max : " + max);
		System.out.println("count : " + count);
		input.close();

	}
}
