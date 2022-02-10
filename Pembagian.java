package SimpleJavaTest;

import java.util.Scanner;

public class Pembagian {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("\nMasukan nilai yang akan di bagi : ");
		try {
			String nilai = input.nextLine();
			input.close();
			int intA, intB, count = 0;

			String[] numberStr = nilai.split(",");

			intA = Integer.parseInt(numberStr[0]);
			intB = Integer.parseInt(numberStr[1]);

			for (int i = 1; i <= intA; i++) {
				if ((intB * i) <= intA) {
					count++;
				} else {
					break;
				}
			}

			System.out.println();
			System.out.println(count);
		} catch (Exception e) {
			System.out.println("masukan nilai input yang valid! ");
			System.out.println("Contoh : 8 , 3 ( 8 dibagi 3) ");
		}

	}

}
