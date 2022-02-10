package Code.String;

public class BintangPiramidBawah {

	public static void main(String[] args) {

		// Instance/Objek Input Scanner
//        Scanner input = new Scanner(System.in);
//        System.out.print("Masukan Input: ");
//        int tinggi = input.nextInt(); //Mendapatkan Input Dari User

		for (int i = 5; i >= 1; i--) {

			for (int j = i; j <= 5; j++) {
				System.out.print(" ");
			}


			for (int k = 0; k <= (i * 2) - 2; k++) {
				System.out.print("*");
			}

			System.out.println();
		}

		System.out.println(); // Membuat Baris Baru
//        }

		// System.out.println ("hasil outputnya");
		System.out.println("Bintang piramid");

	}

}
