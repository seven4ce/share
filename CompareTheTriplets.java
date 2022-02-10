package Code.Numeric;

import java.util.Scanner;

public class CompareTheTriplets {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] alice = new int[3];
		int[] bobs = new int[3];
		int a = 0, b = 0;

		for (int i = 0; i < 3; i++) {
			alice[i] = input.nextInt();
		}

		for (int i = 0; i < 3; i++) {
			bobs[i] = input.nextInt();
		}

		for (int i = 0; i < 3; i++) {

			 if (alice[i] > bobs[i]) {
	                a++;
	            } else if (alice[i] < bobs[i]){
	                b++;
	            }

		}
		System.out.println(a + " " + b);
		input.close();

	}
}
