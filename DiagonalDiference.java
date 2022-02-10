package Code.Numeric;

import java.util.Scanner;

public class DiagonalDiference {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = 0, diag1 = 0, diag2 = 0;
		n = Integer.parseInt(input.nextLine());
		for (int i = 0; i < n; i++) {
			String str[] = input.nextLine().split(" ");
			diag1 += Integer.parseInt(str[i]);
			diag2 += Integer.parseInt(str[n - 1 - i]);
		}

		int diagDiff = Math.abs(diag1 - diag2);
		System.out.println(diagDiff);
		input.close();

	}
}
