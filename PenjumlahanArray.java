package SimpleJavaTest;

import java.util.stream.IntStream;

public class PenjumlahanArray {

	public static void main(String[] args) {

		int jumlah = 0, arrayNumber[] = { 8, 2, 5, 1, 3, 7 };
	
		/* Opsi Pertama */		
//		for (int i : arrayNumber) {
//			jumlah += i;
//		}

		/* Opsi Kedua */
		jumlah = IntStream.of(arrayNumber).sum();
		
		
		System.out.println(jumlah);
	}

}
