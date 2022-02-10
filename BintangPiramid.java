package Code.String;

import java.util.Scanner;

public class BintangPiramid {

	public static void main(String[] args) {

		// Instance/Objek Input Scanner
//        Scanner input = new Scanner(System.in);
//        System.out.print("Masukan Input: ");
//        int tinggi = input.nextInt(); //Mendapatkan Input Dari User

//        for(int t=1; t<=tinggi; t++){
		for (int t = 1; t <= 5; t++) {
			// Menghitung Jumlah Tinggi Piramida

//            for(int s=t; s<=tinggi; s++){
			for (int s = t; s <= 5; s++) {
				// Menghitung Jumlah Spasi per Baris
				System.out.print(" ");
			}

			for (int b = 0; b <= (t * 2) - 2; b++) {
				// Menghitung Jumlah Bintang per Baris
				System.out.print("*");
			}

			System.out.println(); // Membuat Baris Baru
		}

		// System.out.println ("hasil outputnya");
		System.out.println("Bintang piramid");

	}

}
