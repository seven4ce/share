package SimpleJavaTest;

public class DeretBilanganPrima {

	public static void main(String[] args) {

		for (int i = 2; i < 14; i++) {
			
			boolean isPrima = true;
			
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrima = false;
				}
			}
			if (isPrima == true) {
				System.out.print(i + " ");

			}

		}

	}

}
