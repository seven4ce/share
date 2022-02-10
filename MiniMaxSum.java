package Code.Numeric;

import java.util.Scanner;

public class MiniMaxSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int max = 0;
		int min = 0;
		int sum = 0;
		int array[] = new int[5];

		for (int i = 0; i < 5; i++) {
			array[i] = input.nextInt();
		}

		min = array[0];
		for (int i = 0; i < array.length; i++) {
			
			sum += array[i];
			if (array[i] < min) {
				min = array[i];
			}
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("sum : "+ sum);
		System.out.println("min : "+ min);
		System.out.println("max : "+ max);
		System.out.println((sum - max) + " " + (sum - min));
		input.close();

	}
}
